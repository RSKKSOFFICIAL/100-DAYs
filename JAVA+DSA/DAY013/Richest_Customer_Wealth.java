package com.Arrayssass;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(richestcustomerwealth(arr));

    }
    static int richestcustomerwealth(int[][] nums){
        int ans =Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = 0; j < nums[i].length; j++) {
                sum = sum + nums[i][j];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
