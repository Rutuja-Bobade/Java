public class Practice_2 {
    public static void num_Word(int num ,String[] words){
        if(num <= 0){
            return;
        }

        int rem = num%10;
        num /= 10;
        num_Word(num, words);
        System.out.print(words[rem] + " ");
    }
    public static void main(String[] args) {
        int num = 10497;
        String[] word= {"zero","one" ,"two", "three" , "four" , "five", "six" , "seven" , "eight" , "nine"};
        num_Word(num , word);
    }
}
