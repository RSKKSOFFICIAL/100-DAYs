package com.Basic;

import java.util.Scanner;

public class UsrInp_till0SUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int sum = 0;
        do{
            a  = in.nextInt();
            sum = sum+a;
        }while (a != 0);
        System.out.println(sum);
    }
}
