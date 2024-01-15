package com.Ravi;
import java.util.Arrays;

public class Changeval {
    public static void main(String[] args) {
        // Create an array
        int[] arr ={1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]= 25;
    }
}
