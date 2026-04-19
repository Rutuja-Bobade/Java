// Stored in Dnyamic memory (Heap)
// Each node has 2 blocks , 1. data 2. poitner to next node

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
    }
}

public class Basics {
    private static Node coverall(int[] arr) {
        Node head = new Node(arr[0]);
        Node move = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
        }

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2 ,4 , 5, 7, 3 ,7};
         
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    
        Node head = coverall(arr);
        System.out.println(head.data);
    }
}
