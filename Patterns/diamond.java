public class diamond {
    public static void Diamond(int n){
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            // spaces.......can be skipped
            // for (int j = 1; j <= (n-i); j++) 
            // {
            //     System.out.print(" ");
            // }
            System.out.println();
        }

        // 2nd half
        for (int i = n-1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 1; j <= (n-i); j++) 
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Diamond(4);
    }
}