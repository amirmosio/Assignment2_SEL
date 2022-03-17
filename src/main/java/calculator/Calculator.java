package calculator;

import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrtOfAFraction(double a, double b) throws Exception {

        if (a * b > 0 || (a * b == 0 && a >= 0)) {
            if (b == 0) {
                return Double.POSITIVE_INFINITY;
            } else {
                return Math.sqrt(a / b);
            }
        }
        throw new Exception("sqrt of negative number");
    }
}
