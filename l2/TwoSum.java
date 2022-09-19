package l2;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] nums1 = {3,9,5}; // input
        int target1 = 8;
        System.out.println(Arrays.toString(twoSum1(nums1, target1)));
    }
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, return null
        return null;
    }

}
