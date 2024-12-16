package Operators;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Four Sides");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double perimeter = a + b + c + d;

        System.out.println("Perimeter of rectangle : " +perimeter);




    }
}
