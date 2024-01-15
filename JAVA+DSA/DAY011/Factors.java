package com.Basic;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no. for knowing the Factors");
        int a = in.nextInt();
        for (int i = 1; i < a ; i++) {
            if (a % i ==0){
                System.out.println(i);
            }
        }
    }
}
