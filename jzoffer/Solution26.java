package jzoffer;
//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
// 返回结果为复制后复杂链表的head。（
// 注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

import java.util.*;
public class Solution26  {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> map = new HashMap<>(); //map save relation between old node and new node
        // 复制节点，连接起来
        if (pHead==null) return null;
        RandomListNode newHead = new RandomListNode(pHead.label); //return value:newHead
        RandomListNode tempOld = pHead; //temp : move
        RandomListNode tempNew = newHead;
        map.put(pHead,newHead);

        while (tempOld.next!=null){
            tempOld = tempOld.next;
            RandomListNode newNode = new RandomListNode(tempOld.label);
            tempNew.next = newNode;
            tempNew = tempNew.next;
            map.put(tempOld,tempNew);
        }

        // 设置random指针
        tempOld = pHead;
        tempNew = newHead;

        while (tempOld.next!=null){
            // tempNew.random = tempOld.random;  指向了同一个引用
            tempNew.random = map.get(tempOld.random);
            tempOld = tempOld.next;
            tempNew = tempNew.next;
        }

        return newHead;

    }

    public static void main(String[] args) {
        RandomListNode a = new RandomListNode(1);
        RandomListNode b = new RandomListNode(2);
        RandomListNode c = new RandomListNode(3);
        a.next = b;
        b.next = c;
        a.random = c;
        RandomListNode d = Clone(a);
        System.out.print(d.random.label);
    }
}
