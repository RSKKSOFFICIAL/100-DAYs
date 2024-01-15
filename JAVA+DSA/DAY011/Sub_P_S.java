package com.Basic;

import java.util.Scanner;

public class Sub_P_S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
//        int temp = a;
//        int count = 0;
//        while (temp > 0){
//            temp = temp/10;
//            count++;
//        } // for counting no. of digits
        int Multiply =1;
            int Sum = 0;
            while (a > 0) {
                int remainder = a % 10;
                Multiply = Multiply*remainder;
                Sum = Sum+remainder;
                a = a/10;
            }
            int Result = Multiply-Sum;
            System.out.println(Multiply+"-"+Sum+"="+Result);
    }
}
