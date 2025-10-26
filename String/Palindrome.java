public class Palindrome {
    public static boolean palindromee(String string){
        for (int i = 0; i < string.length()/2; i++) {
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "racecar";
        if(palindromee(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}