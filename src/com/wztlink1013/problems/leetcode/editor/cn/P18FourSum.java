package com.wztlink1013.problems.leetcode.editor.cn;

//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针 
// 👍 554 👎 0

/*
* 思路：
*   四个for循环，简单粗暴
* 缺点：
*   时间复杂度高
* */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P18FourSum{
    public static void main(String[] args) {
        Solution solution = new P18FourSum().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i=nums[0];i<nums.length;i++){
            for (int j=nums[1];j<nums.length;j++){
                for (int k=nums[2];k<nums.length;k++){
                    for (int l=nums[3];l<nums.length;l++){
                        if (i+j+k+l == target){
                            result.add(new LinkedList<>(Arrays.asList(i, j, k, l)));
                        }
                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}