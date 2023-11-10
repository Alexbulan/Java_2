package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;

public class FontBoxes {
    static JFrame frame = new JFrame("JTextArea");
    static String[] fonts = new String[]{"Times New Roman", "MS Sans Serif", "Courier New"};
    static String[] colors = new String[]{"Blue", "Red", "Black"};
    static JTextArea textArea = new JTextArea();
    static JComboBox<String> fontsBox = new JComboBox<String>(fonts);
    static JComboBox<String> colorsBox = new JComboBox<String>(colors);

    public FontBoxes(){
        fontsBox.addActionListener(e -> {
            String selectFont = (String) fontsBox.getSelectedItem();
            textArea.setFont(new Font(selectFont, Font.PLAIN, 30));
//            switch (selectFont){
//                case "Times New Roman":
//                    textArea.setFont(new Font("Times New Roman", Font.PLAIN, 40));
//                    break;
//                case "MS Sans Serif":
//                    textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 40));
//                    break;
//                case "Courier New":
//                    textArea.setFont(new Font("Courier New", Font.PLAIN, 40));
//                    break;
//                default:
//                    break;
//            }
        });
        colorsBox.addActionListener(e -> {
            String selectColor = (String) colorsBox.getSelectedItem();
            switch (selectColor){
                case "Blue":
                    textArea.setForeground(Color.blue);
                    break;
                case "Red":
                    textArea.setForeground(Color.red);
                    break;
                case "Black":
                    textArea.setForeground(Color.black);
                    break;
                default:
                    break;
            }
        });

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 160);
        frame.setLocationRelativeTo(null);
        fontsBox.setSelectedIndex(0);
        colorsBox.setSelectedIndex(0);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JPanel boxes = new JPanel();
        boxes.setLayout(new GridLayout(1, 2));
        JPanel text = new JPanel();

        text.add(textArea);
        boxes.add(colorsBox);
        boxes.add(fontsBox);
        panel.add(text);
        panel.add(boxes);

        frame.add(panel);
        frame.setVisible(true);

    }
}
