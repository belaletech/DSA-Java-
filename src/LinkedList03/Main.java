package LinkedList03;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.CreateSinglyLL(5);
        sll.insertInLL(4,1);
        sll.insertInLL(5,2);
        sll.insertInLL(10,3);
        sll.insertInLL(15,0);
        sll.insertInLL(13,4);
       sll.tranversalSLL();
       sll.SearchNode(13);

    }
}
