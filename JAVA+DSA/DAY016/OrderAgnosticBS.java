package com.Ravi;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};
        System.out.println(orderAgnosticBS(arr,10));


    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        if (arr[end] > arr[start]) {
//            while (start <= end) {
//                //middle element
////            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
//                int mid = start + ((end - start) / 2); // same thing in better way
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    // answer
//                    return mid;
//                }
//            }
//            return -1;
//        } else {
//            while (start <= end) {
//                //middle element
////            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
//                int mid = start + ((end - start) / 2); // same thing in better way
//                if (target < arr[mid]) {
//                    start = mid + 1;
//                } else if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    // answer
//                    return mid;
//                }
//            }
//            return -1;
//        }
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
