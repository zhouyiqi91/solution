package jzoffer;

public class Solution31 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int maxSum = Integer.MIN_VALUE;        //integer.Min_VALUE
        int currSum = 0;
        for (int i = 0;i<array.length;i++){
            currSum += array[i];
            if (currSum > maxSum) maxSum = currSum;  //如果array都是负数，这一步可以找到数组最小值
            if (currSum < 0 ) currSum = 0;
        }
        return maxSum;
    }
}
