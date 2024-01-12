package com.Ravi;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        float a = in.nextFloat();
        System.out.println("Enter 2nd number");
        float b = in.nextFloat();
        if(a>b){
            System.out.println(a+" is greater");
        }else {
            System.out.println(b+" is greater");
        }
    }
}
