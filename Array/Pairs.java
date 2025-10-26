public class Pairs {
    public static void pair_in_array(int array[] ){
        int total =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("("+array[i]+","+array[j]+") ");
                total++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+total);
    }
    public static void main(String args[]){
        int arr[] = { 2,4,6,8,10 }; 
        pair_in_array(arr);
    }
}
