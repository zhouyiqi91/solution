package jzoffer;
//输入一个链表，输出该链表中倒数第k个结点。
public class Solution15 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head==null) return null;
        if (k<=0) return null; //k的临界值
        ListNode result = head;
        while (k-- > 1) {  //不能是k-->0 因为k=1的时候不需要head先走
            head = head.next;
            if (head==null) return null;
        }

        while (head.next!=null){
            head = head.next;
            result = result.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.print(FindKthToTail(a,3));
        System.out.print(b.next);
    }
}
