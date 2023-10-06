package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;

public class Image extends JFrame {
    String background_image_path;
    Image() {
        super("Image");
        setSize(500, 500);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        java.awt.Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g1.drawImage(img, 0, 0, 500, 500, this);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    public static void main(String[] args) {
        Image app = new Image();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
    }
}
