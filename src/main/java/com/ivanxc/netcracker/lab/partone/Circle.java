package com.ivanxc.netcracker.lab.partone;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(radius);
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Circle[" +
            "radius=" + radius +
            ", color='" + color + '\'' +
            ']';
    }
}
