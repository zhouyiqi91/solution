package jzoffer;
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Solution05 {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack();
        ArrayList<Integer> res = new ArrayList();
        while (listNode!=null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        for (int i = stack.size();i>0;i--){
            res.add(stack.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = null;
        printListFromTailToHead(listNode);
    }
}
