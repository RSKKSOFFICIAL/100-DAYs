package com.Ravi;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        // Q. Find the Largest No. between 3 numbers

        float max = num1 ;
        if (num2 > max) {
            max = num2 ;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println(max);

    }
}
