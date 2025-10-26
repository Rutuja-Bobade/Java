public class Length {
    static int findLength(String str) {
        if (str.equals("")) {
            return 0;
        }

        // 1 + length of substring (excluding first char)
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int length = findLength(str);
        System.out.println(length);
    }
}
