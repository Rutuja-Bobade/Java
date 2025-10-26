// If a method exists only in the child class, you must:
// 1) Use a child class reference, or
// 2) Downcast the parent reference to the child type.

//  The code below gives compile time eror as the print1 fucntion is only defined in the child class not in the parent class 
// can’t call print1() on obj1 unless the reference type knows that method exists.

public class Reference_Object {
    public static void main(String[] args) {
        Vehicles obj1 = new Cars();
        // obj1.print1();      Compilation error
        obj1.print();

        Vehicles obj2 = new Vehicles();
        obj2.print();
    }
}

class Vehicles{
    void print(){
        System.out.println("Base Class (Vehicle)");
    }
}

class Cars extends Vehicles{
    void print1(){
        System.out.println("Derived class (Car)");
    }
}
