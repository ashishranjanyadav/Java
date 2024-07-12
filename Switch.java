import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        System.out.print("enter your first number");
         a = sc.nextInt();
        System.out.print("enter your second number");
         b = sc.nextInt();

        System.out.println("enter your choice 1-> Add 2-> subtract 3-> multiply 4-> division:");
         ch =sc.nextInt();
         switch (ch){
             case 1:
                 System.out.println("addition=" +(a+b));
                 break;
             case 2:
                 System.out.println("subtraction=" +(a-b));
                 break;
             case 3:
                 System.out.println("multiply=" +(a*b));
                 break;
             case 4:
                 System.out.println(" division=" +(a/b));
                 break;
             default:
                 System.out.println("Invalid number");

         }

    }
}
