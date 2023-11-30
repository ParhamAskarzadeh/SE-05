package calculator;

import java.text.DecimalFormat;

public class Calculator {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public double radical(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        double temp = (double) a / b;
        return Double.parseDouble(decfor.format(Math.sqrt(temp)));
    }


    public double calculate(int a, int b) throws Exception {
        return radical(a, b);
    }
}
