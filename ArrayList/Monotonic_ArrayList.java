import java.util.ArrayList;

public class Monotonic_ArrayList {
    public static boolean IsMonotonic(ArrayList<Integer> arr){
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) > arr.get(i+1)){
                dec = false;
            }
            if (arr.get(i) < arr.get(i+1)) {
                inc = false;
            }
        }

        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(5);
        list2.add(4);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);

        System.out.println(IsMonotonic(list1));
        System.out.println(IsMonotonic(list2));
        System.out.println(IsMonotonic(list3));
    }
}
