package com.Ravi;

public class Swap {
    public static void main(String[] args) {

        // swap number code
//        int temp = a;
//        a=b;
//        b= temp;
        swap(5,6);
//        System.out.println(a+ " " +b);
        String name = "Ravi shankar";
        changename(name);
        System.out.println(name);
    }
    static void changename(String name){
        name = "Rahul Rana";
    }
    static void swap(int a, int b){
        int temp = a;
        a=b;
        b= temp;
        System.out.println(a+ " " +b);

    }
}
