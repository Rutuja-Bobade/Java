import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> arr , int a , int b){
        int temp = arr.get(b);
        arr.set(b, arr.get(a));
        arr.set(a, temp);  
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        swap(list , 1 , 3);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
