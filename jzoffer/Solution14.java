package jzoffer;
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
