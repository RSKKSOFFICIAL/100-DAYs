package com.Ravi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number");
        int lower = in.nextInt();
        System.out.println("Enter last Number");
        int upper = in.nextInt();
        for (int i = lower; i <= upper ; i++) {
            int num = i;
            int sum = 0;
            while (num >0){
                int remainder = num % 10;
                sum = sum + (remainder * remainder * remainder);
                num = num/10;
            }
            if (sum == i){
            System.out.println(sum);
        }
        }

    }
}
