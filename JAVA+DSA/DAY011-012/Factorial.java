package com.Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = in.nextInt();
        int Fact = 1;
        if (n == 0){
            System.out.println("0");
        }else {
            for (int i = 1; i<=n; i++){
                Fact = Fact*i;
            }
            System.out.println("Factorial of "+n+ "= "+Fact);
        }
    }
}
