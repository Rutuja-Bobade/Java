public class Rotated_pyramid {
    // method 1 (mine);
    public static void Rotated_half_pyramid(int rows){
        int cols = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i+j) > (rows)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 

    // // method 2 (Apna Clg)
    // public static void Rotated_half_pyramid(int row){
    //     // outer
    //     for (int i = 1; i <= row; i++) {
    //         // spaces
    //         for (int j = 1; j <= row-i; j++) {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[]){
        Rotated_half_pyramid(4);
    }
}