public class Hybrid {
    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.fly();
        p1.nation();
        p1.eat();

        Mammal m1 = new Mammal();
        m1.eat();
    }
}

class FFFauna {
    void eat(){
        System.out.println("Eats");
    }
}


class Bird extends FFFauna{
    void fly(){
        System.out.println("Flies");
    }
}

class Mammal extends FFFauna{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

class Peacock extends Bird{
    void nation(){
        System.out.println("Peacock is a national bird of India");
    }
}