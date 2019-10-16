package jzoffer;
//二叉搜索树转双向排序链表
import java.util.ArrayList;

public class Solution27 extends Template {
    private ArrayList<TreeNode> helper = new ArrayList<>();

    public TreeNode Convert(TreeNode pRootOfTree) {
        mid(pRootOfTree);
        if (helper.size() <= 1) return pRootOfTree;
        for (int i=1;i<helper.size()-1;i++){
            helper.get(i).right = helper.get(i+1);
            helper.get(i).left = helper.get(i-1);
        }
        helper.get(0).right = helper.get(1);
        helper.get(helper.size()-1).left = helper.get(helper.size()-2);

        return helper.get(0);
    }

    public void mid(TreeNode root){
        if (root==null) return;
        if (root.left!=null) mid(root.left);
        helper.add(root);
        if (root.right!=null) mid(root.right);
    }

}
