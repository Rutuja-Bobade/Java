public class holllow_rhombus {
    public static void Hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // star and space
            for (int j = 1; j <= n; j++) {
                if ((j == 1)||(j == 5) ||(i == 1)||(i == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Hollow_rhombus(5);
    }
}
