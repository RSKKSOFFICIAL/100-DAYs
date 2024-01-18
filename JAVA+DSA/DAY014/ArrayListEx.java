package com.Ravi;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(87);
//        list.add(97);
//        list.add(57);
//        list.add(77);
//        System.out.println(list.contains(77));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());


        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));


        }
        System.out.println(list);

    }
}
