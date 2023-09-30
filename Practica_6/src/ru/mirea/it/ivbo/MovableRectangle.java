package ru.mirea.it.ivbo;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle:" +
                "\ntopLeft=" + topLeft +
                ",\nbottomRight=" + bottomRight;
    }

    @Override
    public void moveUp() {
        this.topLeft.x += topLeft.xSpeed;
        this.bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.y += topLeft.ySpeed;
        this.bottomRight.y += bottomRight.ySpeed;
    }
}
