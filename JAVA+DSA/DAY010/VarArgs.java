package com.Ravi;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5);
        multiple(2,3, "kunal","ravi");

    }

    static void multiple(int a,int b, String ...v){
        System.out.println(a+ " " +b+ " " +Arrays.toString(v));


    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
