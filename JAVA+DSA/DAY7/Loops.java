package com.Ravi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Syntax of for loops;
        for(intialisation ; condition ; increment){
        //body
        }
         */
        // Q: print numbers from one to five
//        for (int i = 1; i <= 5; i += 1) {
//            System.out.println(i);
//
//        }
        // Q: print numbers from one to n
//        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//
//        }
        // Q: print Hello world n times

//        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("hello world");
//
//        }
        //while loops
        /*
        Syntax:
        while (condition){
        body
        }
         */
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }
        // do while
        /*
        do {
        //body
        }while(condition);

         */
        int n = 1;
        do{
            System.out.println("hello world");

        }while (n != 1);

    }
}
