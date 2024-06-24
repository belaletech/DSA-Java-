package Linkedlist04;

public class Main {
    public static void main(String[] args) {
        SinglyLL sll=new SinglyLL();
        sll.CreateSinglyLL(5);
        sll.insertElementInLL(15,0);
        sll.insertElementInLL(20,1);
        sll.insertElementInLL(40,2);
        sll.insertElementInLL(60,2);
        sll.insertElementInLL(80,4);
        sll.trasverseSLL();
        sll.SearchNode(60);
        sll.DeleletionofNode(3);
        sll.trasverseSLL();
    }
}
