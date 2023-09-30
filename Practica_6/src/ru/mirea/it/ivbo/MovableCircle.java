package ru.mirea.it.ivbo;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

    }

    @Override
    public String toString() {
        return "MovableCircle:" +
                "\nradius=" + radius +
                ",\ncenter=" + center;
    }

    @Override
    public void moveUp() {
        this.center.x += center.xSpeed;
    }

    @Override
    public void moveDown() {
        this.center.x -= center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.y -= center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.y += center.ySpeed;
    }
}
