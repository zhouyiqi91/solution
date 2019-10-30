package leetcode;

public class Solution160 extends Template {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) return null;
        int len1 = 1;int len2 = 1;
        ListNode p1 = headA;ListNode p2 = headB;
        while (p1.next != null) {p1=p1.next;len1++;}
        while (p2.next != null) {p2=p2.next;len2++;}

        ListNode pLong,pShort;
        int step;
        if (len1>len2) {pLong = headA;pShort = headB;step=len1-len2;}
        else {pLong = headB;pShort = headA;step=len2-len1;}
        for (int i =0;i<step;i++) {pLong = pLong.next;}

        //while(pLong.next!=null){  换种写法
        while (pLong!=null){
            if (pLong==pShort) return pLong;
            pLong = pLong.next;
            pShort = pShort.next;
        }
        return null;
    }
}
