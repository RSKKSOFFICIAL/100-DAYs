package com.Ravi;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        int sum =0;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number or X to exit");
            if (in.hasNextInt()){
                int a = in.nextInt();
                sum +=a ;
            }else {
                String input = in.next();
                if (input.equals("x") || input.equals("X")){
                    break;
                }else {
                    System.out.println("Invalid Input.please enter a number or 'x' to exit");
                }
            }
        }
        System.out.println(sum);
    }
}
