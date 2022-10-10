package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void a() {
        System.out.println("============================================");
        System.out.println("Вы выбрали сложение                        =");
        System.out.println("Для выполнение введите числа через пробел  =");
        System.out.println("или через Enter:                           =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: "+ (f+s));
    }

    public static void s() {
        System.out.println("============================================");
        System.out.println("Вы выбрали вычитание                       =");
        System.out.println("Для выполнение введите числа через пробел  =");
        System.out.println("или через Enter:                           =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: "+ (f+s));
    }

    public static void m() {
        System.out.println("============================================");
        System.out.println("Вы выбрали умножение                       =");
        System.out.println("Для выполнение введите числа через пробел  =");
        System.out.println("или через Enter:                           =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: "+ (f*s));
    }

    public static void d() {
        System.out.println("============================================");
        System.out.println("Вы выбрали деление                         =");
        System.out.println("Для выполнение введите числа через пробел  =");
        System.out.println("или через Enter:                           =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: "+ (f/s));
    }

    public static void dd() {
        System.out.println("============================================");
        System.out.println("Вы выбрали деление с остатком              =");
        System.out.println("Для выполнение введите числа через пробел  =");
        System.out.println("или через Enter:                           =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: " + (f / s) + "Остаток: " + (f % s));
    }

    public static void de (){
        System.out.println("==============================================");
        System.out.println("Вы выбрали нахождение степени                =");
        System.out.println("Для выполнение введите числа через пробел    =");
        System.out.println("или через Enter(сначала число, потом степень)=");
        System.out.println("==============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        System.out.println("Ваш ответ: "+ ((int) Math.pow(f,s)));
    }
    public static void sq (){
        System.out.println("==============================================");
        System.out.println("Вы выбрали нахождение квадратного корня      =");
        System.out.println("Для выполнение введите число:                =");
        System.out.println("==============================================");
        int n = in.nextInt();
        String SqrtFromNumber = "Ваш ответ: "+ ( Math.sqrt(n));
        System.out.println(SqrtFromNumber.replace(".0", ""));
    }

    public static void main(String[] args) {
        String TextFromUser;
        System.out.println("================================================");
        System.out.println("Пожалуйста, выберите что собираетесь сделать:  =");
        System.out.println("/a - сложение                                  =");
        System.out.println("/s - вычитание                                 =");
        System.out.println("/m - умножение                                 =");
        System.out.println("/d - деление                                   =");
        System.out.println("/dd - деление с остатком                       =");
        System.out.println("/de - нахождение степени                       =");
        System.out.println("/sq - нахождение квадратного корня             =");
        System.out.println("================================================");
        TextFromUser = in.nextLine();
        switch (TextFromUser) {
            case "/a" -> a();
            case "/s" -> s();
            case "/m" -> m();
            case "/d" -> d();
            case "/dd" -> dd();
            case "/de" -> de();
            case "/sq" -> sq();
            default -> System.err.println("Непредусмотренная комманда");
        }
    }
}