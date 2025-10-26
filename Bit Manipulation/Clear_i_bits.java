import java.util.Scanner;

public class Clear_i_bits {
    public static int clear(int n , int i , int j){
        // Method 1 :-  when starting index from left is 1 
        // int a = (-1) << j;
        // int b = (int) Math.pow(2,i)-1;
        
        // int bitmask = a|b;
        // return n & bitmask;

        // MEthod 2 :- When starting index from left is 0
        int a = ((~0) << (j+1));
        int b = (i << i)-1;

        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int res = clear(n, i, j);
        System.out.println(res);

        sc.close();
    }
}
