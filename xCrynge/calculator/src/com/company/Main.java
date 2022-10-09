package com.company;

import java.util.Scanner;

public class Main {
    public static int sum(int a, int b){
        return  a + b;
    }
    public static int minus(int a, int b){
        return  a - b;
    }
    public static int deleniye(int a, int b){
        return  a / b;
    }
    public static int ostatok(int a, int b){
        return  a % b;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	boolean t = true;
	while(t){
	    System.out.println("1. Сложение 2. Вычитание 3. Деление 4. Остаток от деления 5. Степень 6. Корень");
	    switch (in.nextInt()){
            case 1:
                System.out.println(sum(in.nextInt(), in.nextInt()));
                break;
            case 2:
                System.out.println(minus(in.nextInt(), in.nextInt()));
                break;
            case 3:
                System.out.println(deleniye(in.nextInt(), in.nextInt()));
                break;
            case 4:
                System.out.println(ostatok(in.nextInt(), in.nextInt()));
                break;
            case 5:
                System.out.println(Math.pow(in.nextInt(), in.nextInt()));
                break;
            case 6:
                System.out.println(Math.sqrt(in.nextInt()));
                break;

	    }

    }



    }
}
