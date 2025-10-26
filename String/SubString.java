public class SubString{
    public static String substring(String str , int start_index , int end_index){
        String substr = "";
        for(int i = start_index ; i < end_index ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str =  "Hello world";

        // inbuilt java funtion
        System.out.println(str.substring(0,5));

        // by creating method
        System.out.println(substring(str , 0 , 5));
    }
}