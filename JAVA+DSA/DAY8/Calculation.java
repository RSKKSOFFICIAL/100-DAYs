//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.Ravi;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Float a=null;
        Float b=null;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter 1st Number");

        if(in.hasNextFloat()){
            a = in.nextFloat();
            System.out.println("Please Enter 2nd Number");
            if (in.hasNextFloat()){
                b = in.nextFloat();
            }
            System.out.println("Choose a Opeator you want to perform +,-,/,* ");
            String c = in.next();
            if (c.equals("+")){
                float Sum = a+b;
                System.out.println("Sum is "+Sum);
            } else if(c.equals("-")){
                float Subtract = b-a;
                System.out.println("Subtraction is "+Subtract);
            }else if(c.equals("*")){
                float Multiply = a*b;
                System.out.println("Subtraction is "+Multiply);
            }else if(c.equals("/")){
                float Division = b/a;
                System.out.println("Subtraction is "+Division);
            }
        }else {
            System.out.println("Please Enter a Number");
        }

    }
}
