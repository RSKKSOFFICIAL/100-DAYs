package com.Ravi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("enter number 1");
                int num1 = in.nextInt();
                System.out.println("enter number 2");
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2 ;
                }if (op == '-'){
                    ans = num1 - num2 ;
                }if (op == '*'){
                    ans = num1 * num2 ;
                }if (op == '/'){
                    ans = num1 / num2 ;
                }
            } else if (op == 'x' || op == 'X') {
                break;
                
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }

    }
}
