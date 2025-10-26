public class Number_pyramid {
    public static void Pyramid(int n){
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // number
            for (int j = 1; j <= (2*i)-1; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }

            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void  main(String args[]){
        Pyramid(5);
    }
}
