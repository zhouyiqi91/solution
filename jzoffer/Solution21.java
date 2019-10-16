package jzoffer;
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
import java.util.Stack;
public class Solution21 {
    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> helper = new Stack<>();
    //不能用min变量，不然在弹出的时候也需要更新min
    //private static int min;

    public static void push(int node) {
        /*
        if (stack.empty()) {
            min = node;
        } else {
            if (node<min)
                min = node;
        } */

        if (stack.empty() || node < helper.peek())
            helper.push(node);
        else
            helper.push(helper.peek());

        stack.push(node);
    }

    public static void pop() {
        stack.pop();
        helper.pop();
    }

    public static int top() {
        return stack.peek();
    }

    public static int min() {
        return helper.peek();
    }

    public static void main(String[] args) {
        Solution21 a = new Solution21();
        a.push(20);
        a.push(10);
        a.push(30);
        System.out.println(a.min());
        a.pop();
        a.pop();
        System.out.println(a.min());
        a.push(15);
        System.out.println(a.min());

    }

}
