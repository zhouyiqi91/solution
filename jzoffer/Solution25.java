package jzoffer;
//输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
// (注意: 在返回值的list中，数组长度大的数组靠前)

import java.util.*;
public class Solution25 extends Template {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> arrayList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root==null) return result;
        arrayList.add(root.val);
        target -= root.val;
        if (target==0 && root.left==null && root.right==null)
            result.add(new ArrayList<Integer>(arrayList)); //new
        FindPath(root.left,target);
        FindPath(root.right,target);
        arrayList.remove(arrayList.size()-1); //remove
        return result;
    }
    
}
