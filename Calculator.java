package com.shpp.p2p.cs.vkim.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("\n" + "The calculator can perform addition, subtraction, multiplication and division operations with TWO or THREE numbers" + "\n");
        Exceptions exc = new Exceptions();
        exc.isException();
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);

        // The result of the operation
        double result = 0;

        // The original input
        System.out.print("Enter an expression to compute: ");
        String userInput = input.nextLine();

        // The tokens that make up the input
        String[] tokens = userInput.split(" ");
        int t0 = Integer.parseInt(tokens[0]);
        int t2 = Integer.parseInt(tokens[2]);

        if (tokens.length == 3 && (t0 >= 1 && t0 <= 10) && (t2 >= 1 && t2 <= 10)) {
            //Determine the operator
            switch (tokens[1].charAt(0)) {
                case '+':
                    result = t0 + t2;
                    break;
                case '-':
                    result = t0 - t2;
                    break;
                case '*':
                    result = t0 * t2;
                    break;
                case '/':
                    result = (double)t0 / t2;
            }

            //Display result
            System.out.println(result);

        } else {
            char ch1 = tokens[1].charAt(0);
            char ch2 = tokens[3].charAt(0);
            int t4 = Integer.parseInt(tokens[4]);

            if (tokens.length == 5 && (t0 >= 1 && t0 <= 10) && (t2 >= 1 && t4 <= 10) && (t4 >= 1 && t4 <= 10)) {
                if (ch1 == '*' && ch2 == '*') {
                    result = t0 * t2 * t4;
                }
                if (ch1 == '*' && ch2 == '+') {
                    result = t0 * t2 + t4;
                }
                if (ch1 == '*' && ch2 == '-') {
                    result = t0 * t2 - t4;
                }
                if (ch1 == '*' && ch2 == '/') {
                    result = t0 * (double)t2 / t4;
                }

                if (ch1 == '/' && ch2 == '/') {
                    result = (double)t0 / t2 / t4;
                }
                if (ch1 == '/' && ch2 == '*') {
                    result = (double)t0 / t2 * t4;
                }
                if (ch1 == '/' && ch2 == '+') {
                    result = (double)t0 / t2 + t4;
                }
                if (ch1 == '/' && ch2 == '-') {
                    result = (double)t0 / t2 - t4;
                }

                if (ch1 == '+' && ch2 == '+') {
                    result = t0 + t2 + t4;
                }
                if (ch1 == '+' && ch2 == '-') {
                    result = t0 + t2 - t4;
                }
                if (ch1 == '+' && ch2 == '*') {
                    result = t2 * t4 + t0;
                }
                if (ch1 == '+' && ch2 == '/') {
                    result = (double)t2 / t4 + t0;
                }

                if (ch1 == '-' && ch2 == '-') {
                    result = t0 - t2 - t4;
                }
                if (ch1 == '-' && ch2 == '+') {
                    result = t0 - t2 + t4;
                }
                if (ch1 == '-' && ch2 == '*') {
                    result = -1 * (t2 * t4 - t0);
                }
                if (ch1 == '-' && ch2 == '/') {
                    result = -1 * ((double)t2 / t4 - t0);
                }

                //Display result
                System.out.println(result);
            } else {
                System.out.println("INCORRECT INPUT DATA");
            }
        }
    }
}
