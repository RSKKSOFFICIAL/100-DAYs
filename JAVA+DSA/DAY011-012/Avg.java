package com.Basic;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n,sum=0;
        System.out.println("Enter numbers for Average . press 0 for exit");
        int count =0;
        do{
            n = in.nextInt();
            sum = sum +n;
            count++;
        }while (n != 0);
        Float Average = sum/(count-1);

        System.out.println("Average is "+Average);
    }
}
