// for more built-in methods refer
// https://www.javatpoint.com/java-math

import java.util.Scanner;

public class Maths {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        System.out.println("Max = "+ Math.max(x , y));
        System.out.println("Min = "+Math.min(x, y));
        System.out.println("Square root of 4 = "+(int)Math.sqrt(4));
        System.out.println("absolute value of (-8) = "+Math.abs(-8));
        System.out.println("2 raised to 5 = "+(int)Math.pow(2,5));
        System.out.println("(base e)Logarithm of 4 is: " + (int)Math.log(4));
        System.out.println("(base 10)Logarithm of 10 is: " + (int)Math.log10(10));
        System.out.println("log(1+x) base e is: " +(int)Math.log1p(9));
        System.out.println("e raised to the power of 2 "+ (int)Math.exp(2));

         double a = 30;
         // return the trigonometric sine of a      
         System.out.println("Sine value of a is: " +Math.sin(a));    
          
         // return the trigonometric cosine value of a  
         System.out.println("Cosine value of a is: " +Math.cos(a));  
           
         // return the trigonometric tangent value of a  
         System.out.println("Tangent value of a is: " +Math.tan(a));  
           
         // return the trigonometric arc sine of a      
         System.out.println("Sine value of a is: " +Math.asin(a));    
           
         // return the trigonometric arc cosine value of a  
         System.out.println("Cosine value of a is: " +Math.acos(a));  
           
         // return the trigonometric arc tangent value of a  
         System.out.println("Tangent value of a is: " +Math.atan(a));  
   
         // return the hyperbolic sine of a      
         System.out.println("Sine value of a is: " +Math.sinh(a));    
           
         // return the hyperbolic cosine value of a  
         System.out.println("Cosine value of a is: " +Math.cosh(a));  
           
         // return the hyperbolic tangent value of a  
         System.out.println("Tangent value of a is: " +Math.tanh(a));  
    }
}