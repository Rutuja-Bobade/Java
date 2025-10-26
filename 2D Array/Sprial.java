import java.util.*;

public class Sprial {


    // My code
    public static void spiral(int[][] matrix){
        int start_row = 0;
        int end_row = matrix.length-1;
        int start_col = 0 ;
        int end_col = matrix[0].length-1;
        while(start_row <= end_row && start_col <= end_col){
            for(int i = start_col; i <= end_col; i++){
                System.out.print(matrix[start_row][i] + " ");
            }
            start_row++;

            for(int i = start_row;i <= end_row ;i++){
                System.out.print(matrix[i][end_col] + " ");
            }
            end_col--;

            if(start_row <= end_row){
                for(int i = end_col; i >= start_col ; i--){
                    System.out.print(matrix[end_row][i] + " ");
                }
                end_row--;
            };

            if(start_col <= end_col){
                for(int i = end_row; i >= start_row; i--){
                    System.out.print(matrix[i][start_col] + " ");
                }
                start_col++;
            }
        }
    }


    // Apna College
    // public static void spiral(int[][] matrix){
    //     int start_row = 0;
    //     int end_row = matrix.length-1;
    //     int start_col = 0 ;
    //     int end_col = matrix[0].length-1;
    //     while(start_row <= end_row && start_col <= end_col){
    //         for(int i = start_col; i <= end_col; i++){
    //             System.out.print(matrix[start_row][i] + " ");
    //         }

    //         for(int i = start_row+1 ;i <= end_row ;i++){
    //             System.out.print(matrix[i][end_col] + " ");
    //         }

    //         for(int i = end_col-1 ; i >= start_col ; i--){
    //             if(start_row == end_row){
    //                 break;
    //             }
    //             System.out.print(matrix[end_row][i] + " ");
    //         }

    //         for(int i = end_row-1 ; i >= start_row; i--){
    //             if(start_col == end_col){
    //                 break;
    //             }
    //             System.out.print(matrix[i][start_col] + " ");
    //         }

    //         start_row++;
    //         end_col--;
    //         end_row--;
    //         start_col++;

    //     }
    // }


    // Leetcode Submission
    // class Solution {
    //     public List<Integer> spiralOrder(int[][] matrix) {
    //         // int n = matrix.length;
    //         // int m = matrix[0].length;
    //         int start_row = 0;
    //         int end_row = matrix.length - 1;
    //         int start_col = 0 ;
    //         int end_col = matrix[0].length - 1;

    //         List<Integer> list = new ArrayList<>();

    //         while(start_row <= end_row && start_col <= end_col){
    //             for(int i = start_col; i <= end_col; i++){
    //                 list.add(matrix[start_row][i]);
    //             }
    //             start_row++;

    //             for(int i = start_row;i <= end_row ;i++){
    //                 list.add(matrix[i][end_col]);
    //             }
    //             end_col--;

    //             if(start_row <= end_row){
    //                 for(int i = end_col; i >= start_col ; i--){
    //                     list.add(matrix[end_row][i]);
    //                 }
    //                 end_row--;
    //             }   

    //             if(start_col <= end_col){
    //                 for(int i = end_row; i >= start_row; i--){
    //                     list.add(matrix[i][start_col]);
    //                 }
    //                 start_col++;
    //             }
    //         }
    //         return list;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for(int i = 0 ; i < mat.length ; i++){
            for(int j =0 ; j < mat[0].length ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        spiral(mat);
        sc.close();
    }
}
