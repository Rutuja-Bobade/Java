public class Multilevel_Inherit {
   public static void main(String[] args) {
       Dog doggy = new Dog();
       doggy.eat();
       doggy.Leggs = 4;
       System.out.println(doggy.Leggs);
   }
}

class Animal{
   void eat(){
       System.out.println("Eats");
   }

   void breathe(){
       System.out.println("breathes");
   }

}

class Mammal extends Animal{
   int Leggs;
}

class Dog extends Mammal{
   String breed;
}