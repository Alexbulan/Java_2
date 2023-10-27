package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Random random = new Random();
        Graphics2D graphics2D = (Graphics2D) graphics;
        for (int i = 0; i < 20; i++) {
            int flag = random.nextInt(2);
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            switch (flag){
                case 0:
                    Rectangle rect = new Rectangle(random.nextInt(850), random.nextInt(450), random.nextInt(150), random.nextInt(150), color);
                    rect.print(graphics2D);
                case 1:
                    Circle circle = new Circle(random.nextInt(850), random.nextInt(450), random.nextInt(50), color);
                    circle.print(graphics2D);
            }

        }
    }
}
