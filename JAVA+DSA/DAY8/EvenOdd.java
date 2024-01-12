package com.Ravi;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        if(in.hasNextInt()){
            int a = in.nextInt();
            if (a%2 ==0){
                System.out.println(a+" is even");
            } else {
                System.out.println(a+" is odd");
            }
        }else{
            System.out.println("Please Enter a number");
        }
    }
}
