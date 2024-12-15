package OOPs;

class Vehicle{
    double price;
    String color;
    double mileage;

    void display(){
        System.out.println("price " +price);
        System.out.println("mileage " +mileage);
        System.out.println("color " +color);
    }
}

class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;

}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand= "Tata";
        car.price = 120000;
        car.color = "Black";
        car.mileage = 18.3;
        car.sunroof = true;
        car.ftype = "diesel";
        car.display();


    }
}



//
//class parentClass{
//    void display(){
//        System.out.println("Parent Class Method");
//    }
//}
//
//class childClass extends parentClass{
//    void show(){
//        System.out.println("Child Class Method");
//    }
//}
//
//
//public class Inheritance {
//    public static void main(String[] args) {
//        childClass c1 = new childClass();
//        c1.display();
//        System.out.println();
//        c1.show();
//    }
//}
