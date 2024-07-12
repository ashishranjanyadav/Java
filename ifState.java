import java.util.Scanner;

public class ifState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        System.out.println("enter your first no.");
        a = sc.nextInt();
        System.out.println("enter your second no.");
        b = sc.nextInt();
        System.out.println("enter your third no.");
        c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("max no." +a);
        else if (b>a && b>c)
            System.out.println("max no."+b);
        else System.out.println("max no." +c);
    }
}
