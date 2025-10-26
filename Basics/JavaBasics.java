import java.util.*;
public class JavaBasics{
    public static void main(String args[])
    {
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a =12;
        // String b ="Rutuja"; 
        // System.out.println(b);
        // System.out.println(a);

        /*int a = 5;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);*/
    
 
        Scanner sc = new Scanner(System.in);
        
        // Reading a single word input
        System.out.print("Enter a single word (no spaces): ");
        String input = sc.next();
        System.out.println("name = " + input);
        
        // Clear the newline character left after next()
        sc.nextLine();
        
        // Reading a line of input
        System.out.print("Enter a full line of text: ");
        String name = sc.nextLine();
        System.out.println("input = " + name);
        
        // Reading an integer input
        System.out.print("Enter an integer: ");
        int var = sc.nextInt();
        System.out.println(var);
        
        // Reading a float input
        System.out.print("Enter a float: ");
        float inputs = sc.nextFloat();
        System.out.println(inputs);
        
        sc.close();
    }
}