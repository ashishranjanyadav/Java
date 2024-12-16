package OOPs;

class Student{

    String name;
    int id;

    Student(){
        this.name="vijay";
        this.id = 32;
        System.out.println("Hello All");
    }

    Student(String name,int id){
        this.name = name;
        this.id = id;
        System.out.println("Hii sir");
    }

    public void display(){
        System.out.println("name;" +name);
        System.out.println("id: " +id);
    }

}

public class defCons {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("ajay",72);

        s.display();
        s2.display();

    }
}
