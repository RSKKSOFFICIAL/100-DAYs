package com.Ravi;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimes {
    public static void main(String[] args) {
       // int [][] arr = new int [3][3];//no. of rows is mandotry , no of columns is not.!
//        int[][] arr = new int[3][];
//        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.toString(arr2D));
        int[][] arr = new int[3][3];
//        System.out.println(arr.length); //no. of rows
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= in.nextInt();
                
            }

        }
//        for (int row = 0; row < arr.length; row++) {
//            // for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(arr[row][col]+ " ");
//            }
//            System.out.println();
//
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
    }
}
