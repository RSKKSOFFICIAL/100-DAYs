package com.Ravi;
import java.util.Scanner;
import java.util.Arrays;
public class PassingFun {
    public static void main(String[] args) {
        int[] nums = {5,6,5,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]= 99;
    }
}
