public class For_loop {
    public static void main(String[] args) {
        // using 1 for loop
        for(int a = 1; a <= 4; a++){
            System.out.println("****");
        }

        // using 2 for loop
        for(int i = 1; i <= 4; i++){
            for(int j = 1 ;j <=4; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
