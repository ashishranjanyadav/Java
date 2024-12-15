package OOPs;

import java.util.Scanner;

class Calculation{
    int a ;
    int b;

    public void sum(){
        System.out.println("Addition: "+a+b);
    }

    public void subtract(){
        System.out.println("Subtract: "+(a-b));
    }

    public void multiply(){
        System.out.println("Multiply: "+a*b);
    }

    public void divide(){
        System.out.println("Divide: "+a/b);
    }
}

public class ClassAndObject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculation obj = new Calculation();

        System.out.println("Enter the value of a:");
        obj.a= sc.nextInt();

        System.out.println("Enter the value of b:");
        obj.b= sc.nextInt();


        obj.sum();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
