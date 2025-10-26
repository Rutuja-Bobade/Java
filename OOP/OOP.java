// class Vehicle{}
// class car extends Vehicle {}
// We can assign the object of childs class to the reference variable of parent class. 
// Vehicle v = new Car();
// Parent reference → Child object

public class OOP{
   public static void main(String[] args) {
       Pen p1 = new Pen();
       p1.set_color("Blue");
       System.out.println(p1.color);
       p1.settip(3);
       System.out.println(p1.tip);
   }
}

class Pen{
   String color;
   int tip;

   void set_color(String newColor){
       color = newColor;
   }
   void settip(int newTip){
        tip =newTip;
   }
}