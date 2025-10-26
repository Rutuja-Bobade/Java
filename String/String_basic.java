import java.util.*;

public class String_basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Spaces are not alowed only a single word can be stored ...........next()
        // String name ;
        // name = sc.next();
        // System.out.println(name);

        // Can store a Sentence(Spaces are allowed in the string)............nextLine()
        // String full_name;
        // System.out.print("Enter your full name :");
        // full_name = sc.nextLine();
        // System.out.println(full_name);

        // Concatenation
        String name = "Rutuja";
        String surname = "Bobade";
        System.out.println(name+ " " + surname);
        System.out.println(name.charAt(1));
        sc.close();
    }
}