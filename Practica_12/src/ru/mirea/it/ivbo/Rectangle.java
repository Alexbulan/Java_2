package ru.mirea.it.ivbo;

import java.awt.*;

public class Rectangle extends Shape{
    int a;
    int b;

    public Rectangle(int x, int y, int a, int b, Color color) {
        this.posX = x;
        this.posY = y;
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public void print(Graphics2D graph){
        graph.setColor(color);
        graph.fillRect(posX, posY, a, b);
    }
}
