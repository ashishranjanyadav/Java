package Operators;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Principle = ");
        double p =sc.nextDouble();

        System.out.println("Rate = ");
        double R = sc.nextDouble();

        System.out.println("Time = ");
        double T = sc.nextDouble();

        double SI = (p * R * T)/100;

        System.out.println("Simple Interest = " +SI);
    }
}
