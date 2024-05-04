package org.example.exception;

public class Calc {
    public int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }

        return a / b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();

//        int a = 5;
//        int b = 0;
//
//        if (b == 0) {
//            System.out.println("b is zero");
//            System.exit(1);
//        }
//
//        calc.divide(a, b);

        try {
            int result = calc.divide(5, 2);
            System.out.println("result = " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("You can't divide by zero");
        } finally {
            System.out.println("In the end");
        }

    }
}
