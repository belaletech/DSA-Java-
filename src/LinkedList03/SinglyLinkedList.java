package LinkedList03;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    //creation of singly linked list
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

    //insertion of element in particular location
    public void insertInLL(int nodeValue,int location)
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

    public void tranversalSLL()
    {
        if(head==null)
        {
            System.out.println("Singly Linkedlist does not exist");
        }
        else {
            Node tempNode=head;
            for(int i=0;i<size;i++)
            {
                System.out.print(tempNode.value);
                if(i!=size-1)
                {
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("\n");
    }

    boolean SearchNode(int nodeValue)
    {
        if(head!=null)
        {
            Node tempNode=head;
            for(int i=0;i<size;i++)
            {
                if(tempNode.value==nodeValue)
                {
                    System.out.println("Found the node of location at "+i+"\n");
                    return true;
                }
                tempNode=tempNode.next;
            }

        }
        System.out.println("node not found");
        return false;
    }
}
