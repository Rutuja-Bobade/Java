import java.util.Scanner;

public class Hollow_rect {
    public static void hollow_rectangle(int rows , int cols){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1)||(i == rows)||(j == 1)||(j == cols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of column");
        int column = sc.nextInt();
        sc.close();
        hollow_rectangle(row, column);
    }
}
