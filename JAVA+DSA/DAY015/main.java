package com.Ravi;

public class main {
    public static void main(String[] args) {
        int[] nums= {23,56,89,41,63,69,25,12};
        int target = 69;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;

            }

        }
        return -1;
    }
}

