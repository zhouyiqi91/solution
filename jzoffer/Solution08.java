package jzoffer;

/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 */
//二分查找；如果array[mid] >= array[lo],说明最小在mid..hi;如果array[mid] <= array[hi]，说明最小在lo..mid

import java.util.ArrayList;
public class Solution08 {
    public static int minNumberInRotateArray(int [] array) {
        if (array.length==0) {return 0;}
        int lo=0;int hi=array.length-1;
        if (array[lo]<array[hi]) return array[lo];
        while (lo+1<hi){    //如果是lo<hi,死循环
            int mid = lo+(hi-lo)/2;
            //lo<hi  说明移动的是元素个数为0；
            if (array[lo] < array[hi]) return array[lo];
            //左中右相等，无法二分
            if (array[mid]==array[lo] && array[mid]==array[hi]) {lo++;hi--;}
            //移动lo,hi
            else if (array[mid] >= array[lo]) lo=mid;
            else if (array[mid] <= array[hi]) hi=mid;
        }
        return array[hi];
    }

    public static void main(String[] args){
        int[] data1 = {3,4,5,1,2};
        int[] data2 = {1,0,1,1,1};
        int[] data3 = {1,1,1,0,1};
        System.out.println(minNumberInRotateArray(data1));
        System.out.println(minNumberInRotateArray(data2));
        System.out.println(minNumberInRotateArray(data3));
    }
}
