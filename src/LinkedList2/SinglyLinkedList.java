package LinkedList2;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node CreateSinglyLL(int nodeValue)
    {
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }

//    insert method in singly LinkedList
//    (i) At Beginning
//     (ii) After a Node in the Middle
//     (iii) At the end of the linkedList
    public void insertInLinkedList(int nodeValue,int location)
    {
        Node node=new Node();
        node.value=nodeValue;
        if(head==null)
        {
            CreateSinglyLL(nodeValue);
            return;
        }
        else if(location==0)
        {
            node.next=head;
            head=node;
        }
        else if(location>=size)
        {
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else {
            Node tempNode=head;
            int index=0;
            while (index<location-1)
            {
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
            }
        size++;
    }
}
