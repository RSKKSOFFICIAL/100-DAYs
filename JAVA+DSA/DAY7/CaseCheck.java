package com.Ravi;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // check wether it's upper case or lower case
        // && and
        // || or
        if(ch >='a' && ch <= 'z'){

            System.out.println("It's Lowercase");
        } else if (ch >= 'A' && ch <= 'Z'){

            System.out.println("It's Uppercase");
        }
        else {

            System.out.println("Enter a alphabet");
        }

    }
}
