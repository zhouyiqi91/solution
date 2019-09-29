package leetcode;

import static org.junit.Assert.*;
public class solution1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] countArray = new int[1001];
        for (int i=0;i<arr1.length;i++){
            countArray[arr1[i]]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;
        for (int i=0;i<arr2.length;i++) {
            while (countArray[arr2[i]] > 0) {
                result[index++] = arr2[i];
                countArray[arr2[i]]--;
            }
        }
        for (int i=0;i<countArray.length;i++){
            while (countArray[i] > 0){
                result[index++] = i;
                countArray[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 = new int[] {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[] {2,1,4,3,9,6};
        int[] result=new int[] {2,2,2,1,4,3,3,9,6,7,19};
        int[] result1 = relativeSortArray(arr1,arr2);
        for (int i:result1){
            System.out.print(i+" ");
        }
            // System.out.print(relativeSortArray(arr1,arr2));
            // assertEquals(result,relativeSortArray(arr1,arr2));
    }
}
