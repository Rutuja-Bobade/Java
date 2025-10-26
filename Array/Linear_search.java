public class Linear_search{
    public static int linearsearch(int numbers[] ,int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearsearch(String menu[] , String key){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
            // if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int numbers[] = { 2 ,4 ,6 ,8 ,10 ,12, 14 , 16 ,18};
        // int key = 16;
        // int index = linearsearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println(key + " is at index "+index);
        // }


        // menu
        String menu[] = { "Dosa" , "wada ","Sandwich" , "Cold coffee"}; 
        String key = "Sandwich";
        int index = linearsearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " is at index "+index);
        }
    }
}