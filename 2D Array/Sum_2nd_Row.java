import java.util.Scanner;

public class Sum_2nd_Row {
    public static int SUM(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr[0].length ; i++){
            sum += arr[1][i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr= new int[m][m];
        
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        System.out.println(SUM(arr));
    }
}
