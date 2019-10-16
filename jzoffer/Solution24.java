package jzoffer;
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
public class Solution24 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null) return false;
        return VerifyCore(sequence,0,sequence.length-1);
    }
    private boolean VerifyCore(int[] sequence,int start,int end){
        if (start>=end) return true;
        int root = sequence[end];
        int i=0;
        for (;i<end;i++){
            if (sequence[i] > root)
                break;
        }
        int j = i;
        for (;j<end;j++){
            if (sequence[j] < root)
                return false;
        }

        boolean left = true;
        if (i>start) left=VerifyCore(sequence,start,i-1);

        boolean right = true;
        if (j<end) right=VerifyCore(sequence,i,end-1);

        return left && right;
    }
}
