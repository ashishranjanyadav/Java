import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num =sc.nextInt();

        if(num%2==0)
            System.out.println("Your no.is Even");
        else
            System.out.println("Your no.is Odd");
    }
}
