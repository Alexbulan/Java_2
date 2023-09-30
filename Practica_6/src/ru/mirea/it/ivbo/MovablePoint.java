package ru.mirea.it.ivbo;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint:" +
                "\nx=" + x +
                ",\ny=" + y +
                ",\nxSpeed=" + xSpeed +
                ",\nySpeed=" + ySpeed;
    }

    @Override
    public void moveUp() {
        this.x += xSpeed;
    }

    @Override
    public void moveDown() {
        this.x -= xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y -= ySpeed;
    }

    @Override
    public void moveRight() {
        this.y += ySpeed;
    }
}
