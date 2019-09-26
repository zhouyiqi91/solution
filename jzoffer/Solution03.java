package jzoffer;

//二维数组查找
public class Solution03 {
    /* 暴力穷举
    public boolean Find(int target, int [][] array) {
        int k = array.length;int t = array[0].length;
        for (int i=0;i<k;i++){
            for (int j=0;j<t;j++){
                if (target==array[i][j]) return true;
            }
        }
        return false;
    }
    */
    /* 递归
    public static boolean Find(int target, int [][] array) {
        int i = 0;int j = array[0].length-1;
        return find(target,array,i,j);
    }

    public static boolean find(int target, int [][] array,int i,int j) {
        if (i==array.length|j<0) return false;
        if (target<array[i][j]) return find(target,array,i,j-1);
        else if (target>array[i][j]) return find(target,array,i+1,j);
        return true;
    }
    */
    public static boolean Find(int target, int [][] array) {
        int row = 0;int col = array[0].length-1;int row_len=array.length;
        while (row<row_len && col>=0) {
            if (target > array[row][col]) row++;
            else if (target<array[row][col]) col--;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean t = Find(5,array);
        System.out.println(t);
    }
}
