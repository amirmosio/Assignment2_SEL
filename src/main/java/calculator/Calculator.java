package calculator;

import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrtOfAFraction(double a, double b) {
        if (b == 0) {
            return 0;
        } else if (a * b >= 0) {
            return Math.sqrt(a / b);
        }
        return 0;
    }
}
