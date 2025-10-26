import java.util.Scanner;

public class Search {

    // Method 1 :- considering from the top right corner.......... matrix[0][matrix[0].length -1]

    // public static void search_key(int[][] mat , int key){
    //     int row = 0;
    //     int column = mat[0].length -1;
    //     while(row < mat.length && column >= 0){
    //         if(mat[row][column] == key){
    //             System.out.println("Key found at (" + row + ","+ column + ")");
    //             return;
    //         } else if (mat[row][column] > key){
    //             column--;
    //         } else {
    //             row++;
    //         } 
    //     }
    // }



    // Method 2 :- considering from the bottom left corner ...............matrix[matrix.lenght -1][0]

    public static void search_key(int[][] mat , int key){
        int row = mat.length -1;
        int column = 0;

        while(column < mat[0].length  && row >= 0 ){
            if(mat[row][column] == key){
                System.out.println("Key found at (" + row + "," + column + ")");
                return;
            } else if(mat[row][column] > key){
                row--;
            } else {
                column++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i =0 ; i < n; i++){
            for(int j = 0; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();
        search_key(matrix ,X);

        sc.close();
    }
}
