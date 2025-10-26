// Creating new BlueCar()
// Object creation in inheritance goes in this order:
// 1) Parent’s static blocks (already done here)
// 2) Parent’s instance initializers
// 3) Parent’s constructor
// 4) Child’s instance initializers
// 5) Child’s constructor


abstract class Car{
    // Static block
    static {
        System.out.print("1");
    }

    // Constructor
    public Car(String name){
        super();
        System.out.print("2");
    }

    // Instance Initialization
    {
        System.out.print("3");
    }
}

public class BlueCar extends Car{
    // Instance Initialization
    {
        System.out.print("4");
    }

    // Constructor
    public BlueCar(){
        super("Blue");
        System.out.print("5");
    }

    public static void main(String[] args) {
        new BlueCar();
    }
}



// Load BlueCar → Load Car → Car static block (1)
// ↓
// new BlueCar() //Memory allocation occurs
// ↓
// super("Blue")
//     ↓
//     Car instance block (3)
//     Car constructor (2)
// ↓
// BlueCar instance block (4)
// BlueCar constructor (5)
