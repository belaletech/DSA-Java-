package Linkedlist04;

public class SinglyLL {
    public Node head;
    public Node tail;
    public int size;

    //  creation of linklist
    public Node CreateSinglyLL(int nodeValue)
    {
        head =new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
//    //insertion of linked list
//    there are three-way to insert element in linklist
//      (a)at the beginning
//      (b)at the end
//      (c) After a node in the middle
        public void insertElementInLL(int nodeValue,int location)
        {
            Node node=new Node();
            node.value=nodeValue;
            if(head==null)
            {
                CreateSinglyLL(nodeValue);
                return;
            } else if (location==0) {
                node.next=head;
                head=node;
            } else if (location>=size) {
                node.next=null;
                tail.next=node;
                tail=node;
            }
            else {
                Node tempNode=head;
                int index=0;
                while (index<=location-1)
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

        //tranverse the singly linked list
    public void trasverseSLL()
    {
        if(head==null)
        {
            System.out.println("SLL does not exit");
        }
        else {
            Node tempNode=head;
            for(int i=0;i<size;i++)
            {
                System.out.print(tempNode.value);
                if(i!=size-1)
                {
                    System.out.print("->");
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
                    System.out.println("Node found at the index of location "+i+"\n");
                    return true;
                }
                tempNode=tempNode.next;
            }

        }
        System.out.println("Node not found ");
        return false;
    }
    
    public void DeleletionofNode(int location)
    {
        if(head==null)
        {
            System.out.println("Singly LinkedList does not exit");
            return;
        }
        else if(location==0)
        {
            head=head.next;
            size--;
            if(size==0)
            {
                tail=null;
            }
        } else if (location>=size) {
            Node tempNode=head;
            for(int i=0;i<size-1;i++)
            {
                tempNode=tempNode.next;
            }
            if(tempNode==head)
            {
                tail=head=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }
        else {
            Node tempNode=head;
            for(int i=0;i<location-1;i++)
            {
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
}
