public class Binary_String {
    public static void Print(int n , int lastplace , String str){
        // if(lastplace == 0){
        //     Print(n-1 , 0  ,str.append('0'));
        //     Print(n-1 , 1 ,str.append('1'));
        // } else{
        //     Print(n-1, 0, str.append('0'));
        // }

        if(n == 0){
            System.out.println(str);
            return;
        }
        Print(n-1, 0, str + "0");
        if(lastplace == 0){
            Print(n-1, 1, str+ "1");
        }
    }
    public static void main(String[] args){
        Print(4,0, "" );
    }
}
