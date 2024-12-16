package OOPs;

class Students{
    String name;
    int roll_no;

    Students(String name, int roll_no){
        this.name=name;
        this.roll_no=roll_no;

        System.out.println("My name is " +name);
        System.out.println("age:" +roll_no);

    }
}

public class ConstructorDemo {
    public static void main(String[] args){
        Students s1 = new Students("Ashish",55);

    }
}
