package com.Ravi;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18,24,124,9,17,1,98};
       System.out.println(findNumbers(nums));
 //       System.out.println(digits(-236));
   //     System.out.println(digits(66236));

    }
//    static int findNumbers(int[] nums) {
//        //return (int)Arrays.stream(nums).filter(n -> (""+(int)n).length() % 2 == 0).count();
//        //return (int)Arrays.stream(nums).filter(n -> ((int)Math.log10(n)) % 2 == 1).count();
//        int count = 0;
//        for(int n : nums) {
//            if(((int)Math.log10(n)) % 2 == 1) {
//                ++count;
//            }
//        }
//        return count;
//    }
//    static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num: nums){
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
    static boolean even(int num){
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    static int digits1(int num){
        return (int) (Math.log10(num))+1;
    }
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 0;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
