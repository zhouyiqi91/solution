package jzoffer;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

public class Solution17 extends Template {


    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode pointer = new ListNode(-1); //sentinel node;
        ListNode head = pointer;
        while (list1!=null && list2!=null){
            if (list1.val < list2.val) {
                pointer.next=list1;list1=list1.next;
            }
            else {
                pointer.next=list2;list2=list2.next;
            }
            pointer = pointer.next;
        }
        if (list1==null) pointer.next = list2;
        if (list2==null) pointer.next = list1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        a.next = b;
        b.next = c;

        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);
        d.next = e;
        e.next = f;

        Merge(a,d);
    }
}
