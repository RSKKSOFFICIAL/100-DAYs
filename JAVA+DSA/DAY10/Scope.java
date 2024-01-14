package com.Ravi;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println(a);
        //block
        {
            a = 56;
            int c = 99;
            System.out.println(a);
            //value intialised in this block will remain in block
        }
        System.out.println(a);
//        System.out.println(c); // cannot use outside the block
        int i=1 ;
        for (i = 1; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);
    }

    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
