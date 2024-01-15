package com.Ravi;
import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Ravi");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String ...name){
        System.out.println(Arrays.toString(name));

    }
}
