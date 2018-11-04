package com.company;
public class Calculator {
    private double first;
    private double second;

    public Calculator (double first, double second) {
        this.first = first;
        this.second = second;
    }
    public double calculateSum(double a, double b) {
        double summ = a + b;
        return summ;
    }
    public double calculateDif(double a, double b) {
        double dif = a - b;
        return dif;
    }
    public double calculateTim(double a, double b) {
        double dif = a * b;
        return dif;
    }
    public double calculateDiv(double a, double b) {
        double dif = a / b;
        return dif;
    }
}