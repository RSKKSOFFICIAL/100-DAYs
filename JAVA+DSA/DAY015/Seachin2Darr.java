package com.Ravi;
import java.util.Arrays;

public class Seachin2Darr {
    public static void main(String[] args) {
        int[][] arr ={{23,5,3},
                {18,33,99},
                {20,30,40,50},
                {16,19}
        };
        int target = 19;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr,int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }

            }


        }
        return new int[]{-1,-1};
    }
}
