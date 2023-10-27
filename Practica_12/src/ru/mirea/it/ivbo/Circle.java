package ru.mirea.it.ivbo;

import java.awt.*;

public class Circle extends Shape{
    int radius;

    public Circle(int x, int y, int radius, Color color) {
        this.posX = x;
        this.posY = y;
        this.radius = radius;
        this.color = color;
    }
    public void print(Graphics2D graph){
        graph.setColor(color);
        graph.fillOval(posX, posY, radius, radius);
    }
}
