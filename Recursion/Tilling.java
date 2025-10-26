import java.util.Scanner;

public class Tilling {
    public static int ways(int area){
        if(area == 1 || area == 0){
            return 1;
        }
        return ways(area-1) + ways(area-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int way = ways(breadth);
        System.out.println(way);

        sc.close();
    }
}
