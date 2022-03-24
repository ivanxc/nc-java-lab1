package com.ivanxc.netcracker.lab.parttwo;

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
    public String toString() {
        return "Container[(" + + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
