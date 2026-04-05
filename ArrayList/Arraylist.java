import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Adds element at the end
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // Adding element at the particular index
        list.add(1,9);
        System.out.println(list);

        // Retrieves value of the particular index
        int element = list.get(2);
        System.out.println(element);

        //Removes element from the given index
        list.remove(2);
        System.out.println(list);

        // sets the value of particular index within bound , i.e if index exists in the arraylist 
        list.set(1,10);
        System.out.println(list);

        // Throws error as "IndexOutofBoundException"
        // list.add(3, 2);
        // System.out.println(list);

        //Checks whether the element is present in the arraylist
        System.out.println(list.contains(1));
        System.out.println(list.contains(100)); 

        System.out.println(list.size());

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
