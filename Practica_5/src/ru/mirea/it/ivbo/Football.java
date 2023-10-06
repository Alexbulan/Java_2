package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {
    private int milan = 0;
    private int real = 0;
    private String winner;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;


    private void update() {
        label1.setText("Result: " + milan + " X " + real);
        label2.setText("Last Scorer: " + winner);
        if(milan == real) label3.setText("Winner: " + "DRAW");
        else label3.setText("Winner: " + winner);

    }
    public Football(){
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JPanel panel= new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize( new Dimension(200,200));
        label1 = new JLabel("Result: " + milan + " X " + real);
        JButton button1 = new JButton("AC Milan");
        button1.setBackground(Color.RED);
        JButton button2 = new JButton("Real Madrid");
        button2.setBackground(Color.GRAY);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                winner = "AC Milan";
                update();
                }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                winner = "Real Madrid";
                update();
            }
        });
        panel.add(button1);
        panel.add(button2);
        label2 = new JLabel(" ");
        label3 = new JLabel("Winner: DRAW");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        Football football = new Football();
    }
}
