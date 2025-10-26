import java.util.*;

class Fractional_Knapsack{
    public static void main(String[] args){
        int[] val = { 60 , 100 ,120};
        int [] weight = {10 , 20 , 30};
        int W = 50;
        
        double ratio[][] = new double[val.length][2];

        // 0th col = index , 1st col = ratio
        for(int i = 0 ; i < val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double) weight[i];
        }
        // Ascending order 
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int totalValue = 0;
        for(int i = ratio.length - 1; i >= 0 ;i--){
            int index = (int) ratio[i][0];
            if(capacity >= weight[index]){
                System.out.println("Taking item with index : " + (index+1));
                capacity -= weight[index];
                totalValue += val[index];
            } else{
                System.out.println("Taking item with index : " + (index+1)+ " with fraction " + capacity + "/" + weight[index]);
                totalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Total value is : " + totalValue);
    }
}