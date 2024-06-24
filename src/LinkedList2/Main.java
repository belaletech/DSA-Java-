package LinkedList2;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.CreateSinglyLL(5);
        System.out.println(sll.head.value);
        sll.insertInLinkedList(6,0);
        System.out.println(sll.head.value);
    }
}
