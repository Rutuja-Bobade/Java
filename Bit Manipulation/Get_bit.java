// Shifting binary 1 to the ith and (&) with given number can result the ith bit of the binary numbers

// Example :- 1 0 0 1 0
//         & (0 0 0 0 1)
//     Ans    0 0 0 0 0 .............(1 << 0) Gives 0th bit as 0

//     1 0 0 1 0
//  &  0 0 0 1 0
// Ans 0 0 0 1 0 ...............(1 << 1)........Gives 1st bit as 1 as the number so obtained after & is not zero

//     1 0 0 1 0
//  &  0 0 1 0 0
// Ans 0 0 0 0 0 ...............(1 << 2)........Gives 3rd bit as 0

import java.util.*;

public class Get_bit {
    public static int get_bit(int num , int i ){
        int bitmask = 1 << i;
        if ((num &bitmask) == 0) {
            return 0;
        } else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(get_bit(num , i));

        sc.close();
    }
}
