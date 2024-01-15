package com.Ravi;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The no. Of Series For Fibonacci");
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            if (n == 0) {
                return;
            }
            if (n == 1) {
                System.out.println(a);
                return;
            }
            if (n == 2) {
                System.out.println(a);
                System.out.println(b);
                return;
            }
            System.out.println(a);
            System.out.println(b);
            int count = 3;
            while (count <= n) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
                System.out.println(b);
            }
        } else {
            System.out.println("Please Enter a Integer");
        }
    }
}
