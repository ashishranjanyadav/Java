package OOPs;

class person{
    String name;
    int age;

    person(){
        this.name ="Ashish";
        this.age=35;
    }

    person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
}

public class Constructor {
    public static void main(String[] args){
        person p = new person();
        person p1 = new person("anurag",25);

        p1.details();
        p.details();
    }
}
