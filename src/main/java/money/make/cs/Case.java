package money.make.cs;

import money.make.cs.controller.Rifle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Case {
    final int quantityItem = 15;
    private Key key;
    private String name;
    private int price;

    private Rifle[] items=new Rifle[quantityItem];

    public Case(Key key, String name, int price, Rifle[] items){
        this.key=key;
        this.name=name;
        this.price=price;
        this.items=items;


    }
    public Rifle drop(){
        if (key.purchased()){
            return dropChance();

        }else {
            return null;

        }
    }
    public Rifle dropChance(){
        Random random=new Random();
        double roll = random.nextInt(100);
        System.out.println("Выпало число "+roll);
        if (roll<=2){
           return getDrop(0, 2);

        } else if (roll<=40) {
            return getDrop(3, 40);

        }else {
           return getDrop(15, 100);
        }

    }
    private Rifle getDrop(double prev, double next){
        System.out.println("Предыдущее число "+prev+ " Следующие число "+next);
        List<Rifle> result=new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getDropChance()>=prev && items[i].getDropChance()<=next){
                result.add(items[i]);
            }

        }
        Random random=new Random();
        int index = random.nextInt(result.size());
        System.out.println(index);
        return result.get(index);


    }


}
