import java.util.Scanner;

public class Bill {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Float pencil = sc.nextFloat();
        Float pen = sc.nextFloat();
        Float eraser = sc.nextFloat();
        Float total = pencil + pen + eraser ;
        System.out.println(total);

        Float GST = 0.18f * total;
        Float newTotal = total + GST;
        System.out.println("Bill including GST = "+newTotal);
        sc.close();
    }
}