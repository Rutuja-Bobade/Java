public class Abstraction {
    public static void main(String[] args) {
        Mustang m1 = new Mustang();
        System.out.println(m1.color);
        Chicken c = new Chicken();
        c.change_color();
        System.out.println(c.color);
        c.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        System.out.println("Animal Construtor is called");
    }

    void eat(){
        System.out.println("Eats Anything:");
    }

    abstract void walk();
}

class Horse extends Animal {
    void change_color(){
        color = "Light Brown";
    }
    Horse(){
        System.out.println("Horse constructor called");
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    void change_color(){
        color = "Black";
    }
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal {
    
    void change_color(){
        color = "Yellow";
    }
    Chicken(){
        System.out.println("Chicken constructor called");
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}