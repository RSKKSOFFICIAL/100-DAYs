package com.Arrayssass;

import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));

    }
    static int[] shuffle(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length/2; i++) {
            ans[2*i]=nums[i];
            ans[(2*i)+1]= nums[(nums.length/2)+i];
        }
        return ans;
    }
}
