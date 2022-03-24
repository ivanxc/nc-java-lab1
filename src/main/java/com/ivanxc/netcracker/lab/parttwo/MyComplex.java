package com.ivanxc.netcracker.lab.parttwo;

import java.math.BigDecimal;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return (Math.atan2(imag, real));
    }

    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.real - this.imag * right.imag;
        double imag = this.real * right.imag + this.imag * right.real;
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double realNumerator = this.real * right.real + this.imag * right.imag;
        double imagNumaretor = this.imag * right.real - this.real * right.imag;
        double real = realNumerator / denominator;
        double imag = imagNumaretor / denominator;
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public boolean isReal() {
        return BigDecimal.valueOf(0.0).equals(BigDecimal.valueOf(imag));
    }

    public boolean isImaginary() {
        return !BigDecimal.valueOf(0.0).equals(BigDecimal.valueOf(imag));
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    public boolean equals(double real, double imag) {
        return equals(new MyComplex(real, imag));
    }

    public boolean equals(MyComplex another) {
        if (this == another) {
            return true;
        }
        if (another == null || getClass() != another.getClass()) {
            return false;
        }
        BigDecimal realAsBigDecimal = BigDecimal.valueOf(real);
        BigDecimal imagAsBigDecimal = BigDecimal.valueOf(imag);

        BigDecimal anotherRealAsBigDecimal = BigDecimal.valueOf(another.real);
        BigDecimal anotherImagAsBigDecimal = BigDecimal.valueOf(another.imag);

        return realAsBigDecimal.equals(anotherRealAsBigDecimal)
            && imagAsBigDecimal.equals(anotherImagAsBigDecimal);
    }

    @Override
    public String toString() {
        return "(" + real +
            (BigDecimal.valueOf(imag).compareTo(BigDecimal.valueOf(0.0)) >= 0 ? "+" : "")
            + imag + "i" + ")";
    }
}
