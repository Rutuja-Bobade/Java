// lexicographically means the way that relates to dictionaries (the word which comes first is considered as small , whereas the word which comes later is considered as the large )
//  compareTo is inbuilt function which uses the Lexicographic method 
//  if output is  0 then the strings are equal ;
//  <0 : -ve ,then str1 < str2
//  >0 : +ve ,then str1 > str2
// str1.compareTo(str2)
// Apple < apple

public class Cmp_Lexicographically {
    public static void main(String[] args){
        // String fruits[] = {"apple","Apple"};
        String fruits[] = {"apple","mango" ,"banana"};
        
        String largest = fruits[0];
        for(int i = 1 ; i < fruits.length ; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}