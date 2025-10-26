import java.util.*;

public class Ascending {
    // My code
    // public static void Increasing(int n){
    //     while(n > 1){
    //         Increasing(n-1);
    //         break;
    //     }
    //     System.out.println(n);
    // }

    // Apna College
    public static void Increasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        Increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Increasing(n);
        sc.close();
    } 
}
