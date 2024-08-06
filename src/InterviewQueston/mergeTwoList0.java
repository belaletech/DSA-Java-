package InterviewQueston;

public class mergeTwoList0 {
    public static NodeList mergeTwoSortedLL(NodeList l1,NodeList l2)
    {
        NodeList dummy=new NodeList(-1);
        NodeList current=dummy;

        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                current.next=l1;
                l1.next=l1;
            }
            else {
                current.next=l1;
                l2.next=l2;
            }
        }
        if(l1!=null)
        {
            current.next=l1;
        } else if (l2!=null) {
            current.next=l2;
        }
        return dummy;
    }
}
