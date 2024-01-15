package com.Basic;
import java.util.Scanner;

public class Aot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base of Triangle");
        int b = in.nextInt();
        System.out.println("Enter height of Trianlge");
        int h = in.nextInt();
        double a = 0.5*b*h;
        System.out.println("Area of Triangle" +a);
    }
}
