public class Prime_range {
    public static boolean isPrime(int a){
        if (a == 2) {
            return true;
        } else if (a == 1){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void PrimeinRange(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        PrimeinRange(23);
    } 
}
