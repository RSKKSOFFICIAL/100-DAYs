package com.Basic;

import java.util.Scanner;

public class UsrInp_till0Great {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int Greatest = Integer.MIN_VALUE;
        do {
            a = in.nextInt();
            if (a > Greatest) {
                Greatest = a;
            }
        } while (a != 0);
        System.out.println(Greatest);
    }
}
