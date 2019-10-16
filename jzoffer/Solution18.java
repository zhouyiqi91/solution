package jzoffer;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class Solution18 extends Template{
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1!=null && root2!=null){
            //变形的前序遍历
            if (root1.val==root2.val)
                result = HasSub(root1,root2);
            if (!result)
                result = HasSubtree(root1.left,root2);
            if (!result)
                result = HasSubtree(root1.right,root2);
        }
        return result;
    }


    public boolean HasSub(TreeNode root1,TreeNode root2){
        //三种边界条件
        if (root2==null) return true;
        if (root1==null) return false;
        if (root1.val!=root2.val) return false;
        return HasSub(root1.left,root2.left) && HasSub(root1.right,root2.right);
    }
}
