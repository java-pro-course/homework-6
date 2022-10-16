import java.util.Scanner;

public class Main {
    public static void sum(int a, int b){
        System.out.print(a + b);
    }
    public static void mult(int a, int b){
        System.out.print(a * b);
    }
    public static void sep(int a, int b){
        System.out.print(a / b + a % b);
    }
    public static void pow(int a, int b){
        System.out.print(Math.pow(a, b));
    }
    public static void sqrt2(int a){
        System.out.print(Math.sqrt(Math.pow(a, 2)));
    }


    public static void main(String[] args) {
            int a = in.nextInt();
            String sgn = in.next();

            if ("+".equals(sgn)) {
                int b = in.nextInt();
                sum(a, b);
            } else if ("*".equals(sgn)) {
                int b = in.nextInt();
                mult(a, b);
            } else if ("/".equals(sgn)) {
                int b = in.nextInt();
                sep(a, b);
            } else if ("^".equals(sgn)) {
                int b = in.nextInt();
                pow(a, b);
            } else if ("sqrt2".equals(sgn)) {
                sqrt2(a);
            } else {
                System.out.println("Error! Please enter correct expression.");
            }

        }
    public static Scanner in = new Scanner(System.in);
}
