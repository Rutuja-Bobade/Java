import java.util.*;
public class Occurence {
    public static int first_occur(int[] arr ,int key , int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == key){
            return index;
        } 
        return first_occur(arr, key, index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 3 ,6 ,9 ,5 ,10 ,2 ,5, 3};
        int key = sc.nextInt();
        int index = first_occur(arr , key , 0);
        System.out.println(index);
        sc.close();
    }
}
