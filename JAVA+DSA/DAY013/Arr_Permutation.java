package com.Arrayssass;
import java.util.Arrays;
public class Arr_Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(ArrPer(nums)));

    }
    static int[] ArrPer(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}
