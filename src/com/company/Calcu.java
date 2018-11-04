package com.company;
import java.util.Scanner;
public class Calcu {
    public static void main(String[] args) {
        Scanner vlaue = new Scanner(System.in);
        String one;
        int fn, sn;
        System.out.println("You want +, -, / or *?");
        one = vlaue.next();
        char a = one.charAt(0);
        System.out.println("Enter first number");
        fn = vlaue.nextInt();
        System.out.println("Enter second number");
        sn = vlaue.nextInt();
        if (a == '+') System.out.println("Sum = " + (fn + sn));
        if (a == '*') System.out.println("tim = " + (fn * sn));
        if (a == '-') System.out.println("dif = " + (fn - sn));
        if (a == '/') System.out.println("div = " + (fn / sn));
        else System.out.println("Incorrect value");
    }

    }

