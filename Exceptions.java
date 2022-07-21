package com.shpp.p2p.cs.vkim.calculator;

public class Exceptions extends Calculator {
    public static void main(String[] args) {
        isException();
    }

    public static void isException() {
        try {
            Calculator calc = new Calculator();
            calc.calculate();
        } catch (Exception e) {
            System.out.println("INCORRECT INPUT DATA");
        }
    }
}
