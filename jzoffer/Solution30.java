package jzoffer;

import java.util.ArrayList;

public class Solution30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (input == null|k > input.length|k==0) return res;
        sort(input);
        for (int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    public static void sort(int[] a)  {
        sort(a,0,a.length-1);
    }

    private static void sort(int[] a,int lo,int hi){
        if (lo>=hi) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int partition(int[] a,int lo,int hi){
        int i = lo,j=hi+1;
        int v = a[lo];
        while (true){
            while (a[++i] < v ) if(i==hi) break;
            while (a[--j] > v );
            if (i>=j) break;
            swap(a,i,j);
        }
        swap(a,lo,j);
        return j;
    }

}
