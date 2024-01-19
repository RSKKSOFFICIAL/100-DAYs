package com.Ravi;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {2,6,5},{3,5}
        };
        System.out.println(maximumwealth(arr));

    }
    static int maximumwealth(int[][] accounts){
        //person = rol
        //account = col
        int ans =Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }
            //printing sum of accounts of each persons
            System.out.println(rowsum);
            if (rowsum > ans) {
                ans = rowsum ;
            }

        }
        // printing maximum one.
        return ans;

    }
}
