public class selection {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        sort(arr);
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[min] < arr[j]) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}