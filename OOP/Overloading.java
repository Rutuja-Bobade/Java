public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum((float)1.5 ,(float) 2.0 ));
        System.out.println(sum(2,7));
    }

    public static int sum(int n , int m){
        return m+n;
    }

    public static float sum(float a , float b){
        return a+b;
    }
}
