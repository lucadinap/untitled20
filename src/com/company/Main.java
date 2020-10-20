package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String t;



        int c = 0;

        int a;

        System.out.println("quale e il valore iniziare che vuoi dare al tuo numero ?");

        a = in.nextInt();
        t=in.nextLine();
do {

    System.out.println("vuoi incrementare il tuo numero di 1 ?  si/no");


    t=in.nextLine();

    if (t.equals("si")) {
        a++;
        c++;
    }
    System.out.println(a);
    System.out.println("numero di giri "+c);
} while (t.equals("si"));


    }
}
