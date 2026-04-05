// using Treemap , to store elements in the sorted order along with their frequencies
// .getOrDefault(Key , default value) ...this function checks for the required in present in the map. If not present sets the default value . If the key is present in the map then it retrieves the valur of the key

import java.util.*;

class Union{

    // using tree map
    // public static List<Integer> find_union(int[] arr1 , int[] arr2, int n ,int m){
    //     TreeMap<Integer , Integer> freq = new TreeMap<>();

    //     for(int i = 0 ; i < n; i++){
    //         freq.put(arr1[i] , freq.getOrDefault(arr1[i] ,0)+1);
    //     }

    //     for(int i = 0; i < m; i++){
    //         freq.put(arr2[i] , freq.getOrDefault(arr2[i],0) + 1);
    //     }

    //     List<Integer> union = new ArrayList<>();
    //     for (Integer key : freq.keySet()) {
    //         union.add(key);
    //     }
    //     return union;
    // }

    // using Set
    // public static List<Integer> find_union(int[] arr1 , int[] arr2 , int a , int b){
    //     Set<Integer> unique = new TreeSet<>();

    //     for (Integer integer : arr1) {
    //         unique.add(integer);
    //     }

    //     for (Integer integer : arr2) {
    //         unique.add(integer);
    //     }

    //     return new ArrayList<>(unique);
    // }


    // 2 pointer approach
    public static List<Integer> find_union(int[] arr1, int[] arr2, int n, int m){
        int i = 0;
        int j = 0;

        List<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++; 
            }
            else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++; j++;  
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        List<Integer> union_int = new ArrayList<>();
        union_int = find_union(arr1 , arr2 , arr1.length , arr2.length);

        for (Integer integer : union_int) {
            System.out.print(integer + " ");
        }
    }
}