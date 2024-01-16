package com.Basic;
import java.util.Scanner;

public class Aoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        int r = in.nextInt();
        double a = 3.14*r*r;
        System.out.println("Area of Circle" +a);
    }
}
