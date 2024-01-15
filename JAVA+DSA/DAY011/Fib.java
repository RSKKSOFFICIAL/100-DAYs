package com.Basic;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the no. till which you want the fibonacci series");
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        if (a == 0){
            return;
        }
        if (a==1){
            System.out.println(b);
            return;
        }
        if (a==2){
            System.out.println(b);
            System.out.println(c);
            return;
        }
        System.out.println(b);
        System.out.println(c);
        int count =3;
        while (count <= a){
            int temp = c;
            c = c+b;
            b = temp;
            count++;
            System.out.println(c);
        }

    }
}
