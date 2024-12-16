package Operators;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("floating Multiplication");
        System.out.println("Enter Your first number: ");
        double first = sc.nextDouble();

        System.out.println("Enter Your Second Number: ");
        double second = sc.nextDouble();

        double mul = first* second;

        System.out.println("Multiplication =" + mul);
    }
}
