package ru.mirea.it.ivbo;

import javax.swing.*;

public class Frame extends JFrame {
    Panel panel;

    public Frame() {
        panel = new Panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
