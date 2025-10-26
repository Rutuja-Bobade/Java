import java.util.Scanner;

public class Matrices {
    public static boolean search(int[][] mat , int key){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == key){
                    System.out.println("Found at cell ("+i+ ","+ j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void Min_Max(int[][] matrix){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length ; j++){
                Max = Math.max(matrix[i][j] , Max);
                Min = Math.min(matrix[i][j] , Min); 
            }
        }

        System.out.println("Min = " + Min);
        System.out.println("Max = " + Max);
    }
    public static void main(String[] args) {
        // Creation of 3*3 matrix
        int matrix[][] = new int[3][3];
        int n = matrix.length, m= matrix[0].length;
        Scanner sc  =new Scanner(System.in);

        for(int i = 0; i < n; i++ ){
            for(int j =0 ; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i = 0; i < n; i++ ){
            for(int j =0 ; j < m; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        search(matrix, 8);
        Min_Max(matrix);  
    }
}
