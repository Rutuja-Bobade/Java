public class Overriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal_class{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal_class{
    void eat(){
        System.out.println("Eats Grass");
    }
}