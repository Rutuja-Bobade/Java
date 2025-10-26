import java.util.*;
public class Duplicate {
    public static String no_recurssion(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[26];
        Arrays.fill(arr, false);
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int index = ch-'a';
            if(arr[index] == false){
                sb.append(str.charAt(i));
                arr[index] = true;
            }
        }

        return sb.toString();
    }

    public static String remove_duplicate(String str , StringBuilder sb , int index , boolean[] map){
        if(index == str.length()){
            return sb.toString();
        }

        char ch = str.charAt(index);
        if(map[ch-'a'] == true){
            remove_duplicate(str, sb, index+1, map);
        } else{
            map[ch-'a'] = true;
            sb.append(ch);
            remove_duplicate(str, sb, index+1, map);
        }

        return sb.toString();
    }
    public static void main(String[] args){
        String str = "Appreciation";
        String res = no_recurssion(str);
        System.out.println(res);

        str = str.toLowerCase();
        boolean map[] =new boolean[26];
        Arrays.fill(map, false);
        System.out.println(remove_duplicate(str, new StringBuilder(), 0 ,map));
    }
}
