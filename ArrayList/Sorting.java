import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args){
        //inbuilt method : Collections.sort()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        // Ascending Oreder
        Collections.sort(list);
        System.out.println(list);

        // Descending Order
        // Collections.reverseOrder() is comparator , These are function in java which decides the logic to be used in Java.
        // Comparators are also applied on objects
        // bydefault logic is ascending.

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
