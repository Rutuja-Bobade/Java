// Valid syntax for object creation 
// Parent_class object  = new Parent/Child_class ();
// Same_Class object = new Same_Class();

// Parent reference = Child Object 


public class Object_reference {
    public static void main(String[] args) {
        Vehicle c = new CARS();
        c.print();            // O/P : Derived class called 'CARS'
        
        Vehicle v = new Vehicle();
        v.print();             // O/P : Base class called 'Vehicle'
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class called 'Vehicle'");
    }
}

class CARS extends Vehicle{
    void print(){
        System.out.println("Derived class called 'CARS'");
    }
}