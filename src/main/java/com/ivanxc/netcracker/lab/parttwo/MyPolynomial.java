package com.ivanxc.netcracker.lab.parttwo;

import java.math.BigDecimal;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        for(int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0)
                return i;
        }
        return 0;
    }

    public double evaluate(double x) {
        double result = coeffs[0];
        for(int i = 1; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxLength = Math.max(coeffs.length, right.coeffs.length);
        double[] resultCoeffs = new double[maxLength];
        System.arraycopy(coeffs, 0, resultCoeffs, 0, coeffs.length);

        for(int i = 0; i < right.coeffs.length; i++) {
            resultCoeffs[i] += right.coeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiple(MyPolynomial right) {
        double[] resultCoeffs = new double[coeffs.length + right.coeffs.length - 1];

        for(int i = 0; i < coeffs.length; i++) {
            for(int j = 0; j < right.coeffs.length; j++) {
                resultCoeffs[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }

    @Override
    public String toString() {
        String polynomial = String.valueOf(coeffs[0]);
        for(int i = 1; i < coeffs.length; i++) {
            double coeff = coeffs[i];
            String sign =
                (BigDecimal.valueOf(coeff)
                    .compareTo(BigDecimal.valueOf(0.0)) >= 0 ? "+" : "");
            polynomial += sign + coeffs[i] + "x^" + i;
        }
        return polynomial;
    }
}
