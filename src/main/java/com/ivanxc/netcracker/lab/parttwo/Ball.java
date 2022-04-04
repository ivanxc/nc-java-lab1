package com.ivanxc.netcracker.lab.parttwo;

import java.util.Objects;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) throws IllegalArgumentException {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double directionInRadian = Math.toRadians(direction);
        xDelta = (float)(speed * Math.cos(directionInRadian));
        yDelta = (float)(-speed * Math.sin(directionInRadian));
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        if (direction < -180 || direction > 180) {
            throw new IllegalArgumentException("Direction must be between -180 and 180 degrees");
        }
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return Float.compare(ball.x, x) == 0 && Float.compare(ball.y, y) == 0
            && radius == ball.radius && Float.compare(ball.xDelta, xDelta) == 0
            && Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = Float.hashCode(x);
        result = 31 * result + Float.hashCode(y);
        result = 31 * result + Integer.hashCode(radius);
        result = 31 * result + Float.hashCode(xDelta);
        result = 31 * result + Float.hashCode(yDelta);
        return result;
    }

    @Override
    public String toString() {
        return "Ball[" + "(" + x + "," + y + "),speed=("
            + xDelta + "," + yDelta + ")]";
    }
}
