public class Type_promotion {
    public static void main(String[] args){
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(a);
        // System.out.println(b-a);

        // convert all the datatypes in int (further tells loosy conversion)
        // Short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = a + b + c ;

        // by type casting gives senseless answer
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        // 1st converts all the variables into double as it is the biggest data type ;if th e ans data type would be int then compiler would show as th loosy conversion .
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans); 

        // here 2 is integer, so compiler first converts 5 into integer and futher 5*2 is converted into byte (by the method of type casting.);
        // byte b = 5;
        // byte a = (byte) (b * 2);
        // System.out.println(a);
    }
}


// Rule for Type Promotion in Expression 
//  1)Java automatically promotes each byte,short,or character operand to int when evsluating an expression .
//  2)If one operand is long,float, or double the whole expression promoted to long, float, or double respectively.