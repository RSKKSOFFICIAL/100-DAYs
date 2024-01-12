package com.Ravi;

import java.util.Scanner;

public class INRTOUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount");
        float INR = in.nextFloat();
        float USD = INR/82;
        System.out.println(INR+ " = "+USD+ "$");

    }
}
