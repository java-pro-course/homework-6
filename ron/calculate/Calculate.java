package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для получения суммы напишите 1");
        System.out.println("Для получения вычитания напишите 2");
        System.out.println("Для получения умножения напишите 3");
        System.out.println("Для получения деления напишите 4");
        System.out.println("Для возведения в степень напишите 5");
        System.out.println("Для вычисления квадратного корня напишите 6");
        System.out.println("Для получения перевернутой новогодней елки напишите 7");


        System.out.println("Система работает так: введите 1 из 7 цифр, а после этого пишите значения которые вам нужны");
        int a = in.nextInt();

        if (a == 1) {
            System.out.println("Введите 2 числа, которые хотите сложить, через пробел: ");
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println("Ответ: " + (b + c));
        }
        if (a == 3) {
            System.out.println("Введите 2 числа, которые хотите умножить");
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println("Ответ: " + (b * c));

        }
        if (a == 4) {
            System.out.println("Введите 1 - если хотите поделить число нацело, 2 - если хотите получить остаток, 3 - если хотите увидеть и результат от деления нацело и остаток");
            int b = in.nextInt();
            if (b == 1) {
                System.out.println("Введите 2 числа, 1 - то, которое будете делить, 2 - то, на которое будете делить: ");
                int v = in.nextInt();
                int c = in.nextInt();
                System.out.println("Ответ: " + (v / c));
            }

            if (b == 2) {
                System.out.println("Введите 2 числа, 1 - то, которое будете делить, 2 - то, на которое будете делить: ");
                int v = in.nextInt();
                int c = in.nextInt();
                System.out.println("Ответ: " + (v % c));
            }
            if (b == 3) {
                System.out.println("Введите 2 числа, 1 - то, которое будете делить, 2 - то, на которое будете делить: ");
                int v = in.nextInt();
                int c = in.nextInt();
                System.out.println("Ответ: " + "деление нацело - " + (v / c) + ", остаток - " + (v % c));
            }
        }
        if (a == 2) {
            System.out.println("Введите 2 числа, 1 - уменьшаемое, 2 - вычитаемое: ");
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println("Ответ: " + (b - c));

        }
        if (a == 5) {
            System.out.println("Введите степень: ");
            int g = in.nextInt();
            System.out.println("А теперь цифру, которую вы хотите возвести в степень: ");
            int f = in.nextInt();
            double exp = Math.pow(g, f);
            System.out.println("Ответ: " + exp);
        }
        if (a == 6) {
            System.out.println("Введите число, из которого хотите извлечь квадратный корень: ");
            int b = in.nextInt();
            double af = Math.sqrt(a);
            System.out.println("Ответ: " + af);
        }
        if (a == 7) {
            System.out.println("Держи :3 ");
            int n = 11;
            for (int i = 0; i < n / 2 + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int s = 0; s < n - i * 2; s++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    }
}