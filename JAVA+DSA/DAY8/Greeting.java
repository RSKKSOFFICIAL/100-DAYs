//Take name as input and print a greeting message for that particular name.
package com.Ravi;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Name");
        if (in.hasNextLine()) {
            String name = in.nextLine();
            System.out.println("Hello, welcome "+name);
        }else {
            System.out.println("Please Enter a Name");
        }
    }

}
