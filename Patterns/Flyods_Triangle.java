public class Flyods_Triangle {
    public static void Flyods(int n){
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"\t");
                a++;
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        Flyods(5);
    }
}