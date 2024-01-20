package com.Ravi;

public class DescendingBS {
    public static void main(String[] args) {
        int[] arr= {99,88,66,33,22,11,6,0};
        System.out.println(dbinarySearch(arr,11));

    }
    static int dbinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <=end){
            //middle element
//            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
            int mid = start + ((end-start) / 2); // same thing in better way
            if(target < arr[mid]){
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }else {
                // answer
                return mid;
            }
        }
        return -1;
    }
}
