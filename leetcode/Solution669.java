// 二叉搜索树的修剪

public class Solution669 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
        root = trim(root,L,R);
        return root;
    }

    private static TreeNode trim(TreeNode x,int L,int R){
        if (x==null) return null;
        //if (x.val<L ) x= x.right;
        //else if (x.val>R) x = x.left;
        //三种条件返回不同的值
        if (x.val<L ) return x.right;
        else if (x.val>R) return x.left;
        x.left = trim(x.left,L,R);
        x.right = trim(x.right,L,R);
        return x;
    }

    public static void main(String[] args) {
        TreeNode X0=new TreeNode(1);
        TreeNode X1=new TreeNode(0);
        TreeNode X2=new TreeNode(2);
        X0.left = X1;
        X0.right =X2;
        X0 = trimBST(X0,1,2);
    }
}
