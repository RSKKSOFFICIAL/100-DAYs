package com.Ravi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AscendingBS {
    public static void main(String[] args) {
        int[] arr = {-99,-22,-11,-2,0,2,4,5,6,33,66,99};
        System.out.println(abinarySearch(arr,0));

    }
    static int abinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <=end){
            //middle element
//            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
            int mid = start + ((end-start) / 2); // same thing in better way
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                // answer
                return mid;
            }
        }
        return -1;
    }
}