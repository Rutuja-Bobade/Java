import java.util.Scanner;

public class Transpose {
    public static int[][] Transpose(int[][] arr){
        int[][] mat = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length ;i++){
            for(int j = 0 ;j < arr[0].length ;j++){
                mat[j][i] = arr[i][j];
            }
        }

        return mat;
    }

    public static void Print(int[][] arr){
        for(int i =0 ; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];

        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array[0].length ;j++){
                array[i][j] = sc.nextInt();
            }
        }

        int[][] transposed  = Transpose(array);
        Print(transposed);

        sc.close();
    }
}
