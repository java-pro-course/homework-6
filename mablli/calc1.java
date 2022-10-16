import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Для сложения введите 1, а затем два числа.");
        System.out.println("Для вычитания введите 2, а затем два числа.");
        System.out.println("Для умножения введите 3, а затем два числа.");
        System.out.println("Для деления нацело введите 4, а затем два числа.");
        System.out.println("Для вычисления остатка введите 5 а затем два числа.");
        System.out.println("Для возведения в степень введите 6, а затем, сначала число, потом его степень.");
        System.out.println("Для вычисления квадратного корня введите 7, а затем число.");

         int choice = in.nextInt();

        switch (choice){
            case(1):
                System.out.println(addition(in.nextInt(), in.nextInt()));
            break;

            case(2):
                System.out.println(subtraction(in.nextInt(), in.nextInt()));
                break;

            case(3):
                System.out.println(multiplication(in.nextInt(), in.nextInt()));
                break;

            case(4):
                System.out.println(division(in.nextInt(), in.nextInt()));
                break;

            case(5):
                System.out.println(remains(in.nextInt(), in.nextInt()));
                break;

            case(6):
                System.out.println( degree(in.nextInt(), in.nextInt()));
                break;

            case(7):
                System.out.println(root(in.nextInt()));

            default:
                System.out.println("Вы ввели некорректную команду");
        }


    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int remains(int a, int b){
        return a % b;
    }

    public static double degree(int a, int b){
        return Math.pow(a, b);
    }

    public static double root(int a){
        return Math.sqrt(a);
    }

    public static Scanner in = new Scanner(System.in);

}
