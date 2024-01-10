package com.Ravi;
import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        int a = in.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int c = a*i;
            System.out.println(a+"*"+i+"="+c);

        }
    }
}
