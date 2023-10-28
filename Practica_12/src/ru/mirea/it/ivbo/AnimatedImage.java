package ru.mirea.it.ivbo;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AnimatedImage {
    public static void main(String[] args) throws InterruptedException {
        ImageIcon icon = new ImageIcon("C:/Users/vladi/Java 2c/Java_RTU_MIREA/frame/1.png");
        JFrame frame = new JFrame("Animated Image");
        JLabel label = new JLabel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setIcon(icon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        int image = 1;
        while (true) {
            label.setIcon(new ImageIcon("C:/Users/vladi/Java 2c/Java_RTU_MIREA/frame/"+ (image % 13) + ".png"));
            image += 1;
            TimeUnit.MICROSECONDS.sleep(360000);
        }
    }
}
