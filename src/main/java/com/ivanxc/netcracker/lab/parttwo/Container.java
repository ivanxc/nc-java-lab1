package com.ivanxc.netcracker.lab.parttwo;

import java.util.Objects;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    public boolean collides(Ball ball) {
        float extremePointLeft = ball.getX() - ball.getRadius();
        float extremePointRight = ball.getX() + ball.getRadius();
        float extremePointTop = ball.getY() - ball.getRadius();
        float extremePointBottom = ball.getY() + ball.getRadius();
        if (extremePointLeft >= x1 && extremePointRight <= x2 &&
            extremePointTop >= y1 && extremePointBottom <= y2) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Container container = (Container) o;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(x1);
        result = 31 * result + Integer.hashCode(x2);
        result = 31 * result + Integer.hashCode(y1);
        result = 31 * result + Integer.hashCode(y2);
        return result;
    }

    @Override
    public String toString() {
        return "Container[(" + + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
