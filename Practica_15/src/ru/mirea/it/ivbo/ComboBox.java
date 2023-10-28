package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ComboBox extends JFrame {
    String[] countries = { "Australia", "China", "England", "Russia"};
    ComboBox(){
        super("Combo Box");
        setSize(500, 150);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel info = new JLabel();
        GridLayout layout = new GridLayout(2, 1);
        panel.add(info);
        JComboBox<String> jComboBox = new JComboBox<>(countries);
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> jCombo = (JComboBox<String>) e.getSource();
                switch ((String) Objects.requireNonNull(jCombo.getSelectedItem())) {
                    case "Australia" -> info.setText("The capital of Australia is Canberra. Largest cites are Sydney and Melbourne.");
                    case "China" -> info.setText("The capital of China is Beijing. It is the world's second-most-populous country!");
                    case "England" -> info.setText("England is part of the United Kingdom. The capital of England is London.");
                    case "Russia" -> info.setText("Russia's capital and largest city is Moscow. Official and national language is Russian.");
                }

            }
        });
        panel2.add(jComboBox);
        panel2.add(info);
        panel2.setLayout(layout);
        add(panel2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboBox();
    }
}
