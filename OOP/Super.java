// this ->  refers to the current object
// super -> refers immediate parent of class object 
// 1) access parent properties , functions , constructor

public class Super{
    public static void main(String[] args) {
        Animal_Horses h = new Animal_Horses();
        System.out.println(h.color);
    }
}

class Animalss{
    String color; 
    Animalss(){
        System.out.println("Animal constructor is called.");
    }
}

class Animal_Horses extends Animalss{
    Animal_Horses(){
        super();
        color = "Brown";
        System.out.println("Animal_Horses Constructor is called.");
    }
}