public class Breakk {
    public static void main(String[] args) {
        // break statement stops executing the loop as soon as break condition appears;(exits the loop)
        int a = 0;
        while (a < 5) {
            a++;
            if (a == 3 ) {
                break;
            }
            System.out.println(a);
        }

        // continue statement skips the particular iterration and continues to execute the loop ;
        while (a < 20) {
            a++;
            if ( a == 10) {
                continue;
            }
            System.out.println(a);
        }
    }
}

// as the value of a becomes 3 ,iteration gets stop and leaves the 1st loop;
// moves to 2nd loop with a = 3 and starts executing the loop ..... don't print 3 as increments occurs before print statement;
// continues the loop ,skipping the value a = 10 ; 