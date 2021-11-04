package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int ones=0, tens=0, hundreds=0;
        Scanner s =new Scanner(System.in);
        System.out.println("enter number:");
        int num = s.nextInt();
        ones = num % 10;
        num /= 10;  //num = num /10;
        tens = num % 10;

    }
}
