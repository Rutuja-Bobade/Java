public class Single_inheritance {
   public static void main(String[] args) {
       Fish Shark = new Fish();
       Shark.eat();
   }
}


class Fauna{
   String color;
   void eat(){
       System.out.println("Eats");
   }

   void breathe(){
       System.out.println("Breathes");
   }
}

class Fish extends Fauna{
   int fins;

   void swin(){
       System.out.println("Swims in water");
   }
}