import java.util.Scanner;

public class Set_bit {
    public static int set_bit(int n , int i ){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(set_bit(num , i));

        sc.close();
    }
}
