package com.Ravi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//        String a = "kunal";
//        String b = "kunal";
//        System.out.println(a == b);
//        if (fruit.equals("Mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("Apple")){
//            System.out.println("fruit");
//        }
        switch (fruit){
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("A sweet reed fruits");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruits");
                break;
            default:
                System.out.println("Please Enter a valid fruit");

        }
    }
}