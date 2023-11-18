package LinkedListUdemy;

class Node{
    public int value;
    public Node next;
}

class SinglyLinkedList {
//    public Node head;
//    public Node tail;
//    public int size;

    public Node createSinglyLinkedList(Node head,int nodeValue)
    {
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        return head;
    }
}

public class Singly01Example {
    public static void main(String[] args)
    {
        SinglyLinkedList sll=new SinglyLinkedList();
        Node head=new Node();
        head=sll.createSinglyLinkedList(head,5);
        head=sll.createSinglyLinkedList(head,10);
        while(head!=null){
            System.out.println(head.value);
            head=head.next;

        }
    }
}
