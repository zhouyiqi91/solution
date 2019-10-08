package jzoffer;

//输入一个链表，反转链表后，输出新链表的表头。

import java.util.*;
public class Solution16 extends Template{
    /* 用stack保存内存过大
    public static ListNode ReverseList(ListNode head) {
        if (head==null) return null;
        Stack<ListNode> stack = new Stack<>();
        ListNode pointer = head;
        while (pointer != null){
            stack.push(pointer);
            pointer = pointer.next;
        }
        ListNode newHead = stack.pop();
        pointer = newHead;
        while (!stack.empty()){
            ListNode next = stack.pop();
            pointer.next = next;
            pointer = next;
        }
        return newHead;
        }
     */
    public static ListNode ReverseList(ListNode head) {
        if (head==null) return null;
        ListNode prev = null;
        ListNode next;

        while (head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode result = ReverseList(a);
        System.out.print(result.val);
    }

}
