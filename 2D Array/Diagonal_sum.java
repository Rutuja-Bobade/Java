import java.util.Scanner;

public class Diagonal_sum {
    // My Code
    // Time Complexity := O(n)
    // public static int Diagonal_add(int[][] mat) {
    
    //     int primary = 0;

    //     for(int i = 0; i < mat.length; i++){
    //         primary += mat[i][i];
    //     }

    //     int secondary = 0;
    //     int k = mat[0].length - 1 ;
    //     for(int i = 0 ; i < mat.length ; i++ ){
    //         if(i != k){
    //             secondary += mat[k][i];
    //         }
    //         k -= 1;
    //     }

    //     int sum = primary + secondary;
    //     return sum; 
    // }

    // Apna College
    // Time Complexity := O(n^2)
    // public static int Diagonal_add(int mat[][]){
    //     int sum = 0;
    //     for(int i = 0; i < mat.length ;i++){
    //         for(int j = 0; j < mat[0].length ; j++){
    //             if(i == j ){
    //                 sum += mat[i][j];
    //             } else if(i + j == mat.length-1 ){
    //                 sum += mat[i][j];
    //             }
    //         }
    //     }

    //     return sum;
    // }


    // Optimized Apna College 
    // Time Complexity : O(n) with less operations
    public static int Diagonal_add(int[][] mat){
        int sum =0;
        for(int i = 0; i < mat.length ; i++){
            //primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            // condition for avoiding adding the element if matrix length is odd
            if(i != mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            } 
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = Diagonal_add(mat);
        System.out.println(sum);

        sc.close();
    }
}
