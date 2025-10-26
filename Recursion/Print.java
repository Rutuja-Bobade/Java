import java.util.*;
public class Print {
    public static void PritnDesc(int n){
        if(n== 1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        PritnDesc(n-1);
    } 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        PritnDesc(n);

        sc.close();
    }
}
