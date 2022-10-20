package money.make.cs;

import money.make.cs.controller.Rifle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Case {
    final int quantityItem = 15;
    private Key key;
    private String name;
    private int price;

    private Rifle[] items = new Rifle[quantityItem];

    public Case(Key key, String name, int price, Rifle[] items) {
        this.key = key;
        this.name = name;
        this.price = price;
        this.items = items;


    }

    public Case() {
    }

    public Rifle drop() {
        if (key.purchased()) {
            return dropChance();

        } else {
            return null;

        }
    }

    public Rifle dropChance() {
        Random random = new Random();
        double roll = random.nextInt(100);
        System.out.println("Выпало число " + roll);
        if (roll <= 2) {
            return getDrop(0, 2);

        } else if (roll <= 40) {
            return getDrop(3, 40);

        } else {
            return getDrop(15, 100);
        }

    }

    private Rifle getDrop(double prev, double next) {
        //System.out.println("Предыдущее число " + prev + " Следующие число " + next);
        List<Rifle> result = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {  //i < items.length - условие выхода из цикла
            if (items[i].getDropChance() >= prev && items[i].getDropChance() <= next) {
                result.add(items[i]);
            }

        }
        Random random = new Random();
        int index = random.nextInt(result.size());
        System.out.println(result.get(index));
        return result.get(index);




    }

    public String substring(String args) {
        return args.substring(6, 12);


    }

    public static void main(String[] args) {
        Rifle[] items = new Rifle[15];
        items[0] = new Rifle("Glock-18", "Катакомбы", 100.0, 1);
        items[1] = new Rifle("M249", "Блокировка", 100.0, 2);
        items[2] = new Rifle("XM1014", "Ртуть", 100.0, 3);
        items[3] = new Rifle("MP9", "Грот", 100.0, 4);
        items[4] = new Rifle("SCAR-20", "Смертельный яд", 100.0, 4);
        items[5] = new Rifle("MAC-10", "Малахит", 100.0, 4);
        items[6] = new Rifle("Sawed-Off", "Безмятежность", 100.0, 4);
        items[7] = new Rifle("Dual Berettas", "Городской шок", 100.0, 6);
        items[8] = new Rifle("Desert Eagle", "Нага", 100.0, 10);
        items[9] = new Rifle("P250", "Покойник", 100.0, 20);
        items[10] = new Rifle("M4A4", "Король драконов", 30.0, 100);
        items[11] = new Rifle("AK-47", "Картель", 30.0, 110);
        items[12] = new Rifle("Автомат «Галиль»", "Щелкунчик", 40.0, 70);
        items[13] = new Rifle("AWP", "Боец", 15.0, 220);
        items[14] = new Rifle("Knife", "Lore", 2.0, 17000);
        Case chrome = new Case(new Key(true), "Chrome", 60, items);
        Case.simulationDropKnife(chrome);
        Case.countingMoney(chrome);


    }

    public static void simulationDropKnife(Case c) {
        double dropChance = 100;
        int sum = 0;
        while (dropChance > 2) {
            dropChance = c.drop().getDropChance();
            sum = c.price + sum;

        }
        System.out.println("Спустили бабла: " + sum);


    }

    /*public static void taxi(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("UKLON цена: ");
        int a = scan.nextInt();

        System.out.println("UBER цена: ");
        int b = scan.nextInt();

        if (a>b){
            System.out.println("UBER дешевле.");
        } else if (a<b){
            System.out.println("UKLON дешевле.");
        }

     */
    public static void countingMoney(Case chrome) {                    //1) засунуть кейс, узнать стоимость девайс за 100 раз
        int sum = 0;
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < 100; i++) {
            sum=sum+chrome.drop().getPriceDevice();

            sum1=sum1+ chrome.price;




        }
        System.out.println("На кейсы потратили: "+sum);
        System.out.println("Стоимость кейсов: " +sum1);
        sum2=sum-sum1;
        System.out.println("Разница: " +sum2);




    }
}
