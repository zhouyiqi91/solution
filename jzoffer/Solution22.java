package jzoffer;
/*输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */


import java.util.Stack;

public class Solution22 {
    /*
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int N = pushA.length;

        for (int pop:popA){
            System.out.println("pop="+pop);
            if (!stack.empty() && pop==stack.peek()) stack.pop();
            else {
                while (pushA[index] != pop && ){
                    stack.push(pushA[index]);
                    index++;
                    if (index>=N) return false;
                }
                index++;
            }
        }
        return true;
    } */

    //新建一个栈，将数组A压入栈中，当栈顶元素等于数组B时，
    // 就将其出栈，当循环结束时，判断栈是否为空，若为空则返回true.
    public static boolean IsPopOrder1(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex=0,popIndex=0;pushIndex<pushA.length;pushIndex++){
            stack.push(pushA[pushIndex]);
            while (!stack.isEmpty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

    //新建一个栈，遍历pop中数字：
    // 1.如果栈不为空且数字等于栈顶元素,则将该元素弹出；
    // 2.否则将index+1 ,push[index]对应的数字压入栈中,直到满足1且index<length
    //如果遍历没有结束，push[index]
    //遍历结束，return true
    /*
    public static boolean IsPopOrder2(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;


        for (int pop:popA){
            if (!stack.empty() && pop==stack.peek()) stack.pop();
            else {
                for (;pop!=stack.peek() && index<pushA.length;index++){
                    stack.push(pushA[index]);
                }
                index++;
            }
        }
        return true;
    }
    */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        System.out.print(IsPopOrder1(a,b));
    }
}
