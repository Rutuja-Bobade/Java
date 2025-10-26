public class Arithmetic{
    public static void main(String[] args) {
        // BINARY OPERATORS
        // int a = 10;
        // int b = 5;
        // System.out.println("add = "+(a + b));
        // System.out.println("difference = "+(a - b));
        // System.out.println("Multiply = "+(a * b));
        // System.out.println("Divide = "+(a / b));
        // System.out.println("Remainder = "+(a % b));

        // UNARY OPERATORS
        // PRE-INCREMENT
        int A = 10;
        int B = ++A;
        System.out.println(A);
        System.out.println(B);

        // post-increment
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // pre-decrement 
        int c = 10;
        int d = --c;
        System.out.println(c);
        System.out.println(d);

        // post-decrement
        int C = 10;
        int D = C--;
        System.out.println(C);
        System.out.println(D);
    }
}