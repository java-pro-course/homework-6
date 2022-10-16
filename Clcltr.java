package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int action;
        double a;
        double b;
        double sum;
        double diff;
        double ab;
        double quo;
        double exp;
        double af;
	while (true){
        System.out.println("Выбери действие, которое хочешь совершить: 1) Сложение; 2) Вычитание; 3) Умножение; 4) Деление; 5) Возведение в степень; 6) Подсчёт корня второй степени из введённого числа; 7) Хочу чай с печеньками. Введи цифру желаемого действия: ");
        action = in.nextInt();
        switch (action){
            case 0: {
                System.out.println("Думаешь, умный такой?");
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 1: {
                System.out.println("Введи первое слагаемое: ");
                a = in.nextDouble();
                System.out.println("Введи второе слагаемое: ");
                b = in.nextDouble();
                sum = a+b;
                System.out.println("Ура! Результат: " + sum);
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 2: {
                System.out.println("Введи уменьшаемое: ");
                a = in.nextDouble();
                System.out.println("Введи вычитаемое: ");
                b = in.nextDouble();
                diff = a - b;
                System.out.println("Ура! Результат: " + diff);
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 3: {
                System.out.println("Введи первый множитель: ");
                a = in.nextDouble();
                b = in.nextDouble();
                ab = a*b;
                System.out.println("Ура! Результат: " + ab);
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 4: {
                System.out.println("Выбери тип деления (1 - нацело, 2 - вычисление остатка, 3 - вычисление целой части и остатка): ");
                action = in.nextInt();
                switch (action){
                    case 1:{
                        System.out.println("Введи делимое: ");
                        a = in.nextDouble();
                        System.out.println("Введи делитель: ");
                        b = in.nextDouble();
                        quo = a/b;
                        System.out.println("Ура! Результат: " + (int)quo);
                        System.out.println("__________________________________________________________________________________________________________________________________________________");
                    } break;
                    case 2:{
                        System.out.println("Введи делимое: ");
                        a = in.nextDouble();
                        System.out.println("Введи делитель: ");
                        b = in.nextDouble();
                        quo = a%b;
                        System.out.println("Ура! Результат: " + (int)quo);
                        System.out.println("__________________________________________________________________________________________________________________________________________________");
                    } break;
                    case 3:{
                        System.out.println("Введи делимое: ");
                        a = in.nextDouble();
                        System.out.println("Введи делитель: ");
                        b = in.nextDouble();
                        quo = a/b;
                        System.out.println("Ура! Результат: " + (int)quo + ", остаток: " + (int)(a%b));
                        System.out.println("__________________________________________________________________________________________________________________________________________________");
                    } break;
                }

            } break;
            case 5: {
                System.out.println("Введите основание степени: ");
                a = in.nextDouble();
                System.out.println("Введите показатель степени: ");
                b = in.nextDouble();
                exp = Math.pow(a, b);
                System.out.println("Ура! Результат: " + exp);
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 6: {
                System.out.println("Введите основание корня: ");
                a = in.nextDouble();
                af = Math.sqrt(a);
                System.out.println("Ура! Результат: " + af);
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 7: {
                System.out.println("ЭТО КАЛЬКУЛЯТОР, А НЕ БУФЕТ!");
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
            case 8: {
                System.out.println("Я тебе разве не говорил, что нужно вводить числа от 1 до 7?... Кажется, не говорил...");
                System.out.println("__________________________________________________________________________________________________________________________________________________");
            } break;
        }
	}
    }
}
