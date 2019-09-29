package jzoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树层次遍历
public class Solution23 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> res = new ArrayList<>();
        if (root==null) return res;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode x = queue.poll();
                res.add(x.val);
                if (x.left != null) queue.add(x.left);
                if (x.right != null) queue.add(x.right);
                size--;
            }
        }
        return res;

    }
    //反向
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            while (size > 0) {
                TreeNode x = queue.poll();
                list.add(x.val);
                if (x.left != null) queue.add(x.left);
                if (x.right != null) queue.add(x.right);
                size--;
            }
            res.add(list);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = res.size()-1;i>=0;i--){
            result.add(res.get(i));
            }
        return result;
        }
    }



