package com.Ravi;
import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a= in.nextInt();
        System.out.println("Enter 2nd Number");
        int b= in.nextInt();
        int Smaller;
        if (a>b){
             Smaller = b;
        }else {
             Smaller = a;
        }
        int HCF =1;
        for (int i = 1; i <= Smaller; i++) {
            if (a%i==0 && b%i ==0){
                HCF = i;
            }
        }
        System.out.println("HCF is "+HCF);
        int LCM = 1;
        LCM = (a*b)/HCF;
        System.out.println("LCM is"+LCM);
//        int Greater;
//        if (a>b){
//            Greater = a;
//        }else {
//            Greater = b;
//        }
//        int LCM =0;
//        for (int i = Greater; ; i+=Greater) {
//            if (i%a==0 && i%b ==0){
//                LCM = i;
//                break;
//            }
//        }
//        System.out.println("LCM is "+LCM);
//        int HCF = 1;
//        HCF = (a*b)/LCM;
//        System.out.println("HCF is"+HCF);
    }
}
