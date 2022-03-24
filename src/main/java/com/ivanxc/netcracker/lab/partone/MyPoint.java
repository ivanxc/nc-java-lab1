package com.ivanxc.netcracker.lab.partone;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
