public class Multiple {
    public static void main(String[] args) {
        Omnivore human = new Omnivore();
        human.describe();
        human.eat();
        human.eatMeat();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eatMeat();
}

class Omnivore implements Herbivore, Carnivore {

    @Override
    public void eat() {
        System.out.println("Omnivore eats plants.");
    }

    @Override
    public void eatMeat() {
        System.out.println("Omnivore eats meat.");
    }

    public void describe() {
        System.out.println("An omnivore eats both plants and animals.");
    }
}

