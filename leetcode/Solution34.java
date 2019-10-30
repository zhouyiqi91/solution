package leetcode;
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
////你的算法时间复杂度必须是 O(log n) 级别。
////如果数组中不存在目标值，返回 [-1, -1]。

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums,target);
        int right = searchRight(nums,target);
        int[] result = {left,right};
        return result;
    }

    public int searchLeft(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi){
            int mid = lo + (hi-lo)/2;
            if (nums[mid] > target) hi = mid - 1;
            else if (nums[mid] < target) lo = mid + 1;
            else {
                if (mid==0 || nums[mid-1] < nums[mid]) return mid;
                else hi = mid - 1;
            }
        }
        return -1;
    }

    public int searchRight(int[] nums, int target) {
        int lo = 0;
        int last = nums.length - 1;
        int hi = last;
        while (lo <= hi){
            int mid = lo + (hi-lo)/2;
            if (nums[mid] > target) hi = mid - 1;
            else if (nums[mid] < target) lo = mid + 1;
            else {
                if (mid==last || nums[mid+1] > nums[mid]) return mid;
                else lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution34 res = new Solution34();
        int[] a = {1,2,3,4,4,4,4,5,7,8};
        int[] result = res.searchRange(a,4);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
