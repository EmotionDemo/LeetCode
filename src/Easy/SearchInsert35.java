package Easy;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 你可以假设数组中无重复元素。
//
// 示例 1:
//
// 输入: [1,3,5,6], 5
//输出: 2
//
//
// 示例 2:
//
// 输入: [1,3,5,6], 2
//输出: 1
//
//
// 示例 3:
//
// 输入: [1,3,5,6], 7
//输出: 4
//
//
// 示例 4:
//
// 输入: [1,3,5,6], 0
//输出: 0
//
// Related Topics 数组 二分查找
// 👍 757 👎 0
public class SearchInsert35 {
    public int searchInsert(int[] nums, int target) {

        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ans = i;
                break;
            }
        }
        if (nums.length == 1){
            if (target>nums[0]){
                return 1;
            }else {
                return 0;
            }
        }

        if (ans == -1) {
            //递增
            if (nums[0] < nums[nums.length - 1]) {
                if (target > nums[nums.length - 1]) {
                    return nums.length;
                }
                if (target < nums[0]) {
                    return 0;
                }
                for (int i = 0; i < nums.length; i++) {
                    if (i + 1 <= nums.length && nums[i] < target && target < nums[1 + i]) {
                        return i+1;
                    }
                }
            }

            //递减
            if (nums[0] < nums[nums.length - 1]) {
                if (target < nums[nums.length - 1]) {
                    return nums.length;
                }
                if (target > nums[0]) {
                    return 0;
                }
                for (int i = 0; i < nums.length; i++) {
                    if (i + 1 <= nums.length && nums[i] > target && target > nums[1 + i]) {
                        return i+1;
                    }
                }
            }


        }
        return ans;

    }
}
