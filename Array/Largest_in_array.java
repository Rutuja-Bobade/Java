public class Largest_in_array {
    public static void main(String[] args) {
        int number[] = {12 ,12,34 ,67 ,2, 76, 23 ,98 ,987 ,23,21};
        int largest = large(number);
        System.out.println("largest : "+largest);
    }
    public static int large(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < number.length ;i++){
            if(number[i] >= largest){
                largest = number[i];
            } 
            if (number[i] <= smallest) {
                smallest = number[i];
            }
        }
        System.out.println();
        System.out.println("Smallest : "+smallest);
    return largest;
    }
}