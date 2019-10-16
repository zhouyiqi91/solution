package jzoffer;
//操作给定的二叉树，将其变换为源二叉树的镜像。
public class Solution19 extends Template{
    public void Mirror(TreeNode root) {
        if (root==null) return; //一开始输入根为null的边界情况
        if (root.left==null && root.right==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);  //if可以去掉 if (root.left!=null) Mirror(root.left);
        Mirror(root.right);
    }
}
