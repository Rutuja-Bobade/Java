import java.util.Scanner;

public class Swtich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a+" + "+ b +" = "+ (a+b));
                break;
            case '-':
                System.out.println(a+" - "+ b +" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+ b +" = "+ (a*b));
                break;
            case '/':
                System.out.println(a+" / "+ b +" = "+ (a/b));
                break;
            case '%':
                System.out.println(a+" % "+ b +" = "+ (a%b));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
