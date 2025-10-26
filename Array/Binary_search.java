public class Binary_search {
    public static int binaryy_search(int num[] ,int key){
        int start=0 ,end = num.length-1;
        // here mid is the index ,where as the num[mid] is the value at mid of the array. 
        while (start <= end) {
            int mid = (start+end)/2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] > key) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11};
        int key = 7;
        int index = binaryy_search(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " is at index : "+index);
        }
    }
}