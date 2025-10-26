// Java do not support call by refernce .
// java always supports call by value .
// i.e  while call the function the arguements passed are the copy of the original parameters .originak parameters do not get changed.

// import java.util.Scanner;

// public class func_call {
//     public static void summ() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b ;
//         System.out.println("Sum is : "+sum);
//         sc.close();
//     }
//     public static void main(String args[]){
//         summ();
//     }
// }

import java.util.Scanner;
// num1 , num2 are formal parameter.
public class Call_value {
    public static int summation(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = summation(a , b);
        // actual parameter are also known as arguement;
        System.out.println(c);
        sc.close();
    }
}