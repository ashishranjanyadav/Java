package Operators;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of Triangle");

        System.out.println("Base =");
        double base = sc.nextDouble();

        System.out.println("Height =");
        double height = sc.nextDouble();

        double area = 0.5 * base* height;
        System.out.println("Area Of Triangle =" +area);

    }
}
