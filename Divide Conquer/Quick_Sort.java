public class Quick_Sort {
    public static void Sort(int[] arr , int start , int end){
        if(start >= end){
            return ;
        }
        int pivot = partition(arr , start , end);
        Sort(arr , start , pivot - 1);
        Sort(arr , pivot + 1 , end);
    }

    public static int partition(int[] arr , int start , int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start ; j < end ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i + 1] and arr[end] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {6, 3 ,9, 5, 2, 8, 7, 4, 1};

        Sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
