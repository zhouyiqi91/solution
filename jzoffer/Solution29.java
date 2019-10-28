package jzoffer;
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
// 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

import java.util.*;
public class Solution29 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        //count dic
        for (int i:array){
            if (map.containsKey(i)) {
                int count = map.get(i);
                map.put(i,++count); //not count++
            } else {
                map.put(i,1);
            }
        }

        //find max
        int half = array.length/2;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > half) return entry.getKey();
        }
        return 0;
    }
}
