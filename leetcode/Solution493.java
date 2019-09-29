package leetcode;

public class Solution493 {
        private static int[] aux;
        private static int count;


        public static int reversePairs(int[] nums) {
            count = 0;
            int N = nums.length;
            aux = new int[N];
            sort(nums,0,N-1);
            return count;
        }

        public static void sort(int[] a,int lo,int hi){
            if (lo>=hi) return;
            int mid = lo + (hi-lo)/2;
            sort(a,lo,mid);
            sort(a,mid+1,hi);
            merge(a,lo,mid,hi);
        }

        public static void merge(int[] a,int lo,int mid,int hi){
            System.arraycopy(a,lo,aux,lo,hi-lo+1);  //aux辅助数组记录了merge一开始左右数组的值
            int i = lo;int j = mid + 1;
            for (int k=lo;k<=hi;k++){
                if (i>mid) {a[k] = aux[j++];}
                else if (j>hi) {a[k] = aux[i++];}
                else if (aux[j] < aux[i]) {
                    for (int p=mid;p >=i && aux[p] > 2*aux[j];p--) {count++;}
                    a[k] = aux[j++];
                }  //注意这里比较的是aux[j],aux[i],而不是a[j]和a[i]
                else {a[k] = aux[i++];}
            }
        }

    public static void main(String[] args) {
        int[] a = {2,4,3,5,1};
        System.out.print(reversePairs(a));
    }

}



