public class Compress {
    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        int i =  0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            sb.append(ch);
            int count=1;
            i++;

            while (i < str.length() && ch==str.charAt(i)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbccddd";
        str = compression(str);
        System.out.println(str);
    }
}
