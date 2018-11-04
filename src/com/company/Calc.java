package com.company;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner Calc1 = new Scanner(System.in);
        double firstNumber, secondNumber, result;
        System.out.println("Enter first number");
        firstNumber = Calc1.nextDouble();
        System.out.println("Enter second number");
        secondNumber = Calc1.nextDouble();
        result = firstNumber + secondNumber;
        System.out.println(result);

    }
}
