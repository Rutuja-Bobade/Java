// Adding with 1 will give the least significant bit of the number

// Even Number 
// example:-  1 0 0 1 0 1 0
//      &    (0 0 0 0 0 0 1)
// Ans:-      0 0 0 0 0 0 0 ..................here the lsb is 0 and (0 & 1 = 0) 

// Odd number
// example:-  1 0 0 1 0 1 1
//      &    (0 0 0 0 0 0 1)
//    Ans:-   0 0 0 0 0 0 1...................here the lsb is 1 as (1 & 1 = 1)

//  thus we get the number itself on ANDing with one


import java.util.*;

public class Even_odd {
    public static void AND(int a) {
        // calculating the bitmask for the number . i.e Least significant bit of the number 
        int num = a & 1;
        if(num == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        AND(X);

        sc.close();
    }
}