package com.Ravi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID= in.nextInt();
        String Department = in.next();
        switch (EmpID) {
            case 1:
                System.out.println("Ravi Shankar");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("NO Department Found");
                }
                break;
            default:
                System.out.println("Enter Correct Name");
                }
        }
    }

