package jzoffer;
//重建二叉树
public class Solution06 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructCore(pre,in,0,pre.length-1,0,in.length-1);
    }

    private static TreeNode reConstructCore(int [] pre,int [] in,int pS,int pE,int iS,int iE){
        if (pS>pE || iS>iE) return null;
        TreeNode root = new TreeNode(pre[pS]);
        for (int i=iS;i<=iE;i++){   //<= 而不是<
            if (in[i] == pre[pS]){
                root.left = reConstructCore(pre,in,pS+1,pS + (i-iS),iS,i-1);
                root.right = reConstructCore(pre,in,pS+(i-iS)+1,pE,i+1,iE);
            }
        }
        return root;
    }


}
