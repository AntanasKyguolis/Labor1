package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sk1, sk2, daugyba, dalyba, sudetis, atimtis;
        System.out.println("Skaičiuotuvas");
        System.out.println("Įveskite pirmą skaičių");
        Scanner S = new Scanner(System.in);
        sk1 = S.nextInt();
        System.out.println("Pasirinkite norimą veiksmą ' + - / * #' ");
        char zenklas = S.next().charAt(0);
        System.out.println("Įveskite antrą skaičių");
        Scanner S2 = new Scanner(System.in);
        sk2 = S.nextInt();

        if (zenklas == '*') {
            daugyba = sk1 * sk2;
            System.out.println(sk1 + " * " + sk2 + " = " + daugyba);
        } else if (zenklas == '/') {
            dalyba = sk1 / sk2;
            System.out.println(sk1 + " / " + sk2 + " = " + dalyba);
            if (sk2 == 0) {
                System.out.println("Dalyba iš nulio negalima");
            }
        } else if (zenklas == '+') {
            sudetis = sk1 + sk2;
            System.out.println(sk1 + " + " + sk2 + " = " + sudetis);
        } else if (zenklas == '-') {
            atimtis = sk1 - sk2;
            System.out.println(sk1 + " - " + sk2 + " = " + atimtis);
        } else if (zenklas == '#') {
            double ats = 1;
            for (double i = 13; i <= 25; i++) { //sk1 * sk2 + (sk2 - sk1) / sk1 * 13 = 4 < 6
                ats = (sk1 * sk2 + (sk2 - sk1) / sk1 * i);
                if (ats < 6) {
                    System.out.println( + sk1 + " * " + sk2 + " +" + " (" + sk2 + " - " + sk1 + ")" + " / " + sk1 + " * " + i + " = " + ats + " < " + 6);
                } else if (ats == 6) {
                    System.out.println( + sk1 + " * " + sk2 + " +" + " (" + sk2 + " - " + sk1 + ")" + " / " + sk1 + " * " + i + " = " + ats + " = " + 6);
                } else if (ats > 6) {
                    System.out.println( + sk1 + " * " + sk2 + " +" + " (" + sk2 + " - " + sk1 + ")" + " / " + sk1 + " * " + i + " = " + ats + " > " + 6);
                }
            }
        } else {
            System.out.println("Operacija negalima");
        }
        System.out.println("Ar dar norite toliau skaičiuoti? Jei įvesite taip, bus tęsiamas skaičiavimas : ");
        String kartoti = S.next();

        if (!kartoti.equals("taip")) {
            System.out.println("Programa baigė darbą");
            return;

        }
    }
}
