package com.Ravi;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]= 23;
//        arr[1]= 53;
//        arr[2]= 63;
//        arr[3]= 73;
//        arr[4]= 83;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[3]);
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//
//        }

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]+ " ");
//
//        }
//        for (int num : arr){
//            System.out.println(num + " ");
//        }
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
        str[1]="Ravi";
        System.out.println(Arrays.toString(str));

    }
}
