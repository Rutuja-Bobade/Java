public class Str_equal{
    public static void main(String[] args){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");


        // if 2 variable have same value ,then the string points the already stored string Thus == shows both the strings are same
        if (s1 == s2) {
            System.out.println("Strings are equal.");
        }else {
            System.out.println("Strings are not equal.");
        }


        // new keyword sets new place forthe word Tony even though the String Tony is already set in the other variable
        if (s1 == s3) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

        // thus in string , we use equals operator to check the content in the string.
        if (s1.equals(s3)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }



        String str1 = "HELLO";
        String str2 = "hello";
        if( str1 == str2){
            System.out.println("Equal Strings");
        }else {
            System.out.println("Unequal Strings");
        }

        if(str1.equals(str2)){
            System.out.println("Case dont matters for equals method");
        }else {
            System.out.println("Case matters for equals method");
        }

        if(str1.matches(str2)){
            System.out.println("Case Insensitive");
        }else {
            System.out.println("Case sensitive");
        }
    }
}
