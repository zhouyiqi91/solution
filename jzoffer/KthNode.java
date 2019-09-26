package jzoffer;

import java.util.ArrayList;

// 二叉搜索树的第k个节点
public class KthNode {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //
    ArrayList<TreeNode> array = new ArrayList<> ();

    TreeNode KthNode(TreeNode pRoot, int k){
        addNode(pRoot);
        if (k>array.size()|k<=0) return null; //边界条件
        return array.get(k-1);

    }

    void addNode(TreeNode root){
        if (root==null) return;
        addNode(root.left);  // not array.add(root.left) 不然无法递归
        array.add(root);
        addNode(root.right);
    }




}
