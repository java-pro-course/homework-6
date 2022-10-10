package com.company;
//
//СБИЛАСЬ КОДИРОВКА, ПОЭТОМУ ВСЁ НА АНГЛИЙСКОМ
//
import java.io.*;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void a() {
        System.out.println("============================================");
        System.out.println("You've chosen addition                     =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss ="Your answer is: "+ (f+s);
        System.out.println(ss);
        wr(ss);
    }

    public static void s() {
        System.out.println("============================================");
        System.out.println("You've chosen subtraction                  =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answer is: "+ (f-s);
        System.out.println(ss);
        wr(ss);
    }

    public static void m() {
        System.out.println("============================================");
        System.out.println("You've chosen multiplication               =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answer is: "+ (f*s);
        System.out.println(ss);
        wr(ss);
    }

    public static void d() {
        System.out.println("============================================");
        System.out.println("You've chosen division                     =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answer is: "+ (f/s);
        System.out.println(ss);
        wr(ss);
    }

    public static void dd() {
        System.out.println("============================================");
        System.out.println("You've chosen division with remainder      =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answers is : " + (f / s) + " Remainder is: " + (f % s);
        System.out.println(ss);
        wr(ss);
    }

    public static void de (){
        System.out.println("============================================");
        System.out.println("You've chosen finding degree               =");
        System.out.println("To execute, enter the numbers separated by =");
        System.out.println("the spase or the enter                     =");
        System.out.println("============================================");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answers is : "+ ((int) Math.pow(f,s));
        System.out.println(ss);
        wr(ss);
    }
    public static void sq (){
        System.out.println("==============================================");
        System.out.println("You've chosen finding the square root        =");
        System.out.println("To execute, enter the number:                =");
        System.out.println("==============================================");
        int n = in.nextInt();
        String SqrtFromNumber = "Your answers is  "+ ( Math.sqrt(n));
        String ss = SqrtFromNumber.replace(".0", "");
        System.out.println(ss);
        wr(ss);
    }

    public static void l (){
        System.out.println("=======================================================");
        System.out.println("You've chosen finding the logarithm                   =");
        System.out.println("To execute, enter the base first and then the number  =");
        int f = in.nextInt();
        int s = in.nextInt();
        String ss = "Your answers is : " + Math.log(f)/Math.log(s);
        System.out.println(ss);
        wr(ss);
    }
    public static void wr (String ss){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
            out.println(ss);
            out.close();
        } catch (IOException e) {}
    }

    public static void main(String[] args) {
        String TextFromUser;
        while (true) {
            System.out.println("================================================");
            System.out.println("Please select what you would like to do:       =");
            System.out.println("/a - addition                                  =");
            System.out.println("/s - subtraction                               =");
            System.out.println("/m - multiplication                            =");
            System.out.println("/d - division                                  =");
            System.out.println("/dd - division with remainder                  =");
            System.out.println("/de - finding degree                           =");
            System.out.println("/sq - finding the square root                  =");
            System.out.println("/l - finding the logarithm                     =");
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
                case "/l" -> l();
                default -> System.err.println("Unintended command");
            }
            try {
                Thread.sleep(3000);
            } catch(InterruptedException ex) {}
        }
    }
}
