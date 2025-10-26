import java.util.Scanner;

public class Update{
    public static int clear_bit(int n , int i ){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int set_bit(int n , int i ){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int update(int n , int i , int newbit){
        // if(newbit == 0){
        //     return clear_bit(n, i);
        // } else{
        //     return set_bit(n, i);
        // }

        n = clear_bit(n, i);
        int bitmask = newbit << i;

        return n|bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int newbit = sc.nextInt();
        System.out.print(update(num , i , newbit));
        
        sc.close();
    }
}