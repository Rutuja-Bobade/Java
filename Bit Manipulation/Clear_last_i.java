import java.util.Scanner;

public class Clear_last_i {
    public static int clear_i_bit(int n , int i){
        int bitmask = (-1) << i;
        // int bitmask = (~0) << i;

        return bitmask & n;
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();      // the number inthe input is the decimal number
        int i = sc.nextInt();

        int ans = clear_i_bit(n,i);
        System.out.println(ans);

        sc.close();
    }
}
