public class P_123 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        int n = sb.length();
        System.out.println(sb);
        boolean res = true;
        for (int i = 0; i < n/2; i++) {
            if(sb.charAt(i) != sb.charAt(n-i-1)){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}