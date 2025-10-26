public class Inverted {
    public static void invertedd(int n){
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i+1 ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedd(5);
    }
}
