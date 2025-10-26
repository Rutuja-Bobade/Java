class SubstringCount {
    static int countSubstr(String s, int i, int j, int n) {
        if (n == 1) return 1;   
        if (n <= 0) return 0;

        int res = countSubstr(s, i + 1, j, n - 1)  
                + countSubstr(s, i, j - 1, n - 1)  
                - countSubstr(s, i + 1, j - 1, n - 2); 

        if (s.charAt(i) == s.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        System.out.println("Count = " + countSubstr(s, 0, n - 1, n));
    }
}
