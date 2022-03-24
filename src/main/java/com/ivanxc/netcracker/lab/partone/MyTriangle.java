package com.ivanxc.netcracker.lab.partone;

import java.math.BigDecimal;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v1.distance(v3);
        double side3 = v2.distance(v3);
        return side1 + side2 + side3;
    }

    public String getType() {
        BigDecimal side1 = BigDecimal.valueOf(v1.distance(v2));
        BigDecimal side2 = BigDecimal.valueOf(v1.distance(v3));
        BigDecimal side3 = BigDecimal.valueOf(v2.distance(v3));

        boolean allSidesEqual = side1.equals(side2) && side2.equals(side3);
        boolean anyTwoSidesEqual =
            side1.equals(side2) || side1.equals(side3) || side2.equals(side3);

        if (allSidesEqual) {
            return "Equilaterial";
        } else if (anyTwoSidesEqual && !allSidesEqual) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
            "v1=" + v1 +
            ", v2=" + v2 +
            ", v3=" + v3 +
            ']';
    }
}
