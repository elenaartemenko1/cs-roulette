package money.make.cs.utils;


import java.util.Random;
import java.util.Scanner;

public class Hw {
    public int taxi(int a, int b) {


        if (a < b) {
            System.out.println("UKLON стоимость: " + a);
            return a;
        } else if (a > b) {
            System.out.println("UBER стоимость: " + b);
            return b;
        } else {
            System.out.println("любое" + a);
            return a;
        }

    }

    public static void main(String[] args) {
        Hw t = new Hw();

        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            t.taxi(a, b);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        for (int i = 5; i >= 1; i--) {          //new line
            System.out.print(" " + i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);


        }
        System.out.println("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        // System.out.println(sum);

        int b = 7;
        while (b <= 98) {
            System.out.println(" " + b);
            b = b + 7;
        }

        int c = 1;
        while (c <= 512) {
            System.out.println(" " + c);
            c = c * 2;
        }

        String[] k = {"Каждый", " охотник ", " желает "};
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        System.out.println();

        int l = k.length;
        String temp;
        for (int i = 0; i < l / 2; i++) {
            temp = k[l - i - 1];
            k[l - i - 1] = k[i];
            k[i] = temp;
        }
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]); //end
        }


        String[] m = {" Вортал ", " смотри ", " что ", " делаю "};
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        System.out.println();

        int n = m.length;      //будет использоваться при обмене эл-тов
        String posr;    //поочереди меняет, используя как посредника переменную String
        for (int i = 0; i < n / 2; i++) {
            posr = m[n - i - 1];
            m[n - i - 1] = m[i];
            m[i] = posr;
        }
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }


}







