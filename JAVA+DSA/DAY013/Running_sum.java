package com.Arrayssass;

import java.util.Arrays;

public class Running_sum {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4};
        System.out.println(Arrays.toString(running_sum(ans)));

    }
    static int[] running_sum(int[] nums){
        int n= nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
