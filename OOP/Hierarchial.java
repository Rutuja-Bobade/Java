public class Hierarchial {
    public static void main(String[] args){
        Mammals m1 = new Mammals();
        m1.walk();

        Horses h1 = new Horses();
        h1.run();
        h1.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Bretahe");
    }
}

class Mammals extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}

class Horses extends Animals{
    void run(){
        System.out.println("runs");
    }
}