package InterviewQueston;


public class mergeTwoSortedLinkList {
    public static ListNode mergeTwoList(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

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
        } else if (l2!=null) {
            current.next=l2;
        }
        return dummy;
    }
}
