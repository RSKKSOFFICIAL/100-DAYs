package com.Ravi;


public class Max2d {
    public static void main(String[] args) {
        int[][] arr ={{23,5,3},
                {18,33,99},
                {20,30,40,50},
                {16,19}
        };
        System.out.println(max(arr));

    }
    static int max(int[][] arr){
        if (arr.length == 0){
            return -1;
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;

    }
}
