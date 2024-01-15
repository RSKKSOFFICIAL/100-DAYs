//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.Ravi;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Principal");
        if(in.hasNextFloat()) {
            float P = in.nextFloat();
            System.out.println("Please Enter Time");
            if(in.hasNextFloat()){
            float T = in.nextFloat();
            System.out.println("Please Enter Rate");
            if(in.hasNextFloat()){
            float R = in.nextFloat();
            float SI = (P*T*R)/100 ;
            System.out.println("Simple Intrest" +SI);
        }else {
                System.out.println("Please Enter a Number");
            }
    }}}
}
