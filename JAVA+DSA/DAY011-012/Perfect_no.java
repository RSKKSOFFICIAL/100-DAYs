package com.Basic;

import java.util.Scanner;

public class Perfect_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum =0;
        if (a < 0){
            return;
        }else {
            for (int i = 1; i <= a/2; i++) {
                if(a%i ==0){
                    sum = sum +i;
                }
            }
            if(sum == a){
                System.out.println(a+ " is perfect number");
            }else {
                System.out.println(a+ " is not perfect number");
            }
        }
    }
}
