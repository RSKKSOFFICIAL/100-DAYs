package com.Ravi;

public class Max {
    public static void main(String[] args) {
        int[] arr ={18,12,3,14,28};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans){
                ans = arr [i];
            }
        }
        return ans;
    }
}
