import java.util.ArrayList;
import java.util.Collections;

public class Lonely {
    public static ArrayList<Integer> IsLonely(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i) != arr.get(i+1) && arr.get(i)+1 != arr.get(i+1)){
                list.add(arr.get(i));
            }
        }
        list.add(arr.get(arr.size()-1));
        System.out.println(list);

        for(int i = arr.size()-1 ; i > 0; i--){
            if(arr.get(i) == arr.get(i-1) || arr.get(i) - 1 == arr.get(i-1)){
                if(list.contains(arr.get(i))){
                    list.remove(arr.get(i));
                }
            }
        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        // list.add(5);

        System.out.println(IsLonely(list));
    }
}
