// only arrays are passed by refernce.
// other variables are passed by value.

public class Update_array {
    public static void update(int marks[] ,int non_changable){
        non_changable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {98,97,99};
        int non_changable = 5;
        update(marks ,non_changable);
        System.out.println(non_changable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}