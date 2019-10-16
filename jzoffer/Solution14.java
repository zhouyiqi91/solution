package jzoffer;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
import java.util.LinkedList;
import java.util.*;
public class Solution14 {
    public static void reOrderArray(int [] array) {
        // Queue<Integer> odd = new Queue<Integer>(); Queue is abstract!!
        Queue<Integer> odd = new LinkedList<>();
        Queue<Integer> even = new LinkedList<>();
        for (int number:array){
            if (number%2 == 1) odd.add(number);
            else even.add(number);
        }
        int i = 0;
        while (!odd.isEmpty()) array[i++] = odd.poll();
        while (!even.isEmpty()) array[i++] = even.poll();
    }

    public static void main(String[] args) {
        int[] array = {8,6,3,5,2,1,5,6,2};
        reOrderArray(array);

        System.out.print(Arrays.toString(array));
    }
}
