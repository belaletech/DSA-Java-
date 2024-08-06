package InterviewQueston;

public class mergeTowList2 {
    public static NodeList mergeTowSortedList(NodeList l1,NodeList l2)
    {
        NodeList dummy=new NodList(-1);
        NodeList current=dummy;

        while (l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                current.next=l1;
                l1=l1.next;
            }
            else {
                current.next=l2;
                l2=l2.next;
            }
        }
        if(l1!=null)
        {
            current.next=l1;
        }
        else if(l2!=null)
        {
            current.next=l2;
        }
        return dummy;
    }
}
