package com.Ravi;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
//        int a = in.nextInt();
        System.out.println(isArmstrong(n));
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i)){
                System.out.println(i+ " ");
            }

        }
    }
    //print all the 3 digitts armsstrong number
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0 ;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum += rem*rem*rem;
        }
        if (sum ==original){
            return true;
        }
        return false;
    }
    // prime
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c ==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}