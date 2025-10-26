import java.util.Scanner;

public class Decimal_binary {
    public static int Decimal_to_Binary(int decimal){
        int remainder =0;
        int binary = 0;
        int power =0;
        while( decimal > 0){
            remainder = decimal % 2 ;
            binary = binary +(remainder* (int)(Math.pow(10, power)));
            decimal /= 2;
            power++;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Decimal_to_Binary(decimal));
        sc.close(); 
    }
}
