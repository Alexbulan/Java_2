package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CalculatorUI extends JFrame {
    private boolean isResult = false;
    private JTextArea input = new JTextArea();
    private final Excception exception;


    public void setText(String in) {
        input.setText(in);
    }

    public String getText() {
        return input.getText();
    }

    public CalculatorUI(Excception exception) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        this.exception = exception;

        Font font = input.getFont();
        float size = 30.0f;
        input.setFont(font.deriveFont(size));
        input.setLineWrap(true);
        input.setWrapStyleWord(false);
        input.setEditable(false);


        GridLayout main = new GridLayout(1, 2);
        JPanel mainPanel = new JPanel(main);

        GridLayout UI = new GridLayout(2, 1);
        JPanel UIPanel = new JPanel(UI);

        JButton[] numberButtons = new JButton[10];
        for (int i = 1; i < 10; i++)
            numberButtons[i] = new JButton(String.valueOf(10-i));
        numberButtons[0] = new JButton(String.valueOf(0));
        JButton equalsButton = new JButton("=");
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton divButton = new JButton("/");
        JButton mulButton = new JButton("*");
        JButton pointButton = new JButton("_");
        JButton deleteButton = new JButton("<");
        JButton clearButton = new JButton("C");

        for (int i = 1; i < 10; i++) {
            int finalI = 10-i;
            numberButtons[i].addActionListener(e -> {
                if (isResult) {
                    setText("");
                    isResult = false;
                }
                setText(getText() + finalI);
            });
        }
        numberButtons[0].addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + 0);
        });

        equalsButton.addActionListener(e -> {
            String str = getText();
            if (!Objects.equals(str, "")) {
                try {
                    exception.calc(str);
                } catch (noResultException ex) {
                    JOptionPane.showMessageDialog(this,
                            ex.getMessage());
                    exception.clearResult();
                }
                update(exception.getResult());
                isResult = true;
            }
        });


        addButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + "+");
        });

        subButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + "-");
        });

        mulButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + "*");
        });

        divButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + "/");
        });

        pointButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            setText(getText() + " ");
        });

        deleteButton.addActionListener(e -> {
            if (isResult) {
                setText("");
                isResult = false;
            }
            StringBuilder in = new StringBuilder(getText());
            in.deleteCharAt(in.length() - 1);
            setText(String.valueOf(in));
        });

        clearButton.addActionListener(e -> {
            setText("");
        });

        GridLayout buttons = new GridLayout(6, 3);
        JPanel buttonsPanel = new JPanel(buttons);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(deleteButton);
        buttonsPanel.add(mulButton);
        buttonsPanel.add(divButton);
        buttonsPanel.add(subButton);
        buttonsPanel.add(addButton);
        for (int i = numberButtons.length - 1; i >= 1; i--) {
            buttonsPanel.add(numberButtons[i]);
        }
        buttonsPanel.add(pointButton);
        buttonsPanel.add(numberButtons[0]);
        buttonsPanel.add(equalsButton);

        UIPanel.add(new JScrollPane(input));
        UIPanel.add(buttonsPanel);

        mainPanel.add(UIPanel);

        this.add(mainPanel);
        this.setVisible(true);
    }

    public void update(double result) {
        input.setText(String.valueOf(result));
    }
}
