import java.util.*;

public class Count_set {
    public static int count_bit(int n){
        int count =0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(count_bit(n));

        sc.close();
    }
}
