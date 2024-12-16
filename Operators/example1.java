package Operators;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operator:");

        System.out.println("Enter Your First Number: ");
        int first = sc.nextInt();

        System.out.println("Enter Ypur Second Number: ");
        int second = sc.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first/second;


        System.out.println("Addition: "+add);
        System.out.println("Subtraction: " +sub);
        System.out.println("Multiplication: " +mul);
        System.out.println("Division: " +div);

    }
}
