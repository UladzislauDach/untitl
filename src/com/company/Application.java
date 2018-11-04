package com.company;

import java.util.Scanner;

public class Application {
    double a, b;


    public static void main(String[] args) {
        Application theApp = new Application();
        theApp.runTheApp();
        String sim;
    }

    public void runTheApp() {
        Scanner sim = new Scanner(System.in);
        char c = sim.next().charAt(0);

        Scanner vlaue = new Scanner(System.in);
        a = vlaue.nextDouble();
        b = vlaue.nextDouble();
        Calculator calc = new Calculator(a, b);

        if (c == '+') {
            double res2 = calc.calculateSum(a, b);
            System.out.println("Сумма " + res2);
        }
        if (c == '-') {
            double res3 = calc.calculateDif(a, b);
            System.out.println("Разность " + res3);
        }
        if (c == '*') {
            double res4 = calc.calculateTim(a, b);
            System.out.println("Умножение " + res4);
        }
        if (c == '/') {
            double res5 = calc.calculateDiv(a, b);
            System.out.println("Деление " + res5);
        } else System.out.println("Incorrect enter");

    }
}
