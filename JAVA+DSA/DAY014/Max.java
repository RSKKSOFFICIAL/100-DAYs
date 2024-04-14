package com.Ravi;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,56,3,5,6,99,2};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,5));
    }
    static int maxrange(int[] arr, int start, int end){
        if (start > end){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = 0; i <= end ; i++) {
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    //imagine that arr is not empty
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

}

