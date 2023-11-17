package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabClassUI extends JFrame {
    LabClass labClass;
    JButton searchButton;
    JTextField[] textField = new JTextField[6];
    public LabClassUI(Student[] students) {
        super("Students");
        labClass = new LabClass(students);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        String[] sr = {"Name", "Surname"};

        searchButton = new JButton("Search student");
        for (int i = 0; i < 2; i++) {
            this.textField[i] = new JTextField(sr[i]);
        }

        searchButton.addActionListener(e -> {
            try {
                String name = textField[0].getText();
                String surname = textField[1].getText();

                if (Objects.equals(name, "") || Objects.equals(surname, ""))
                    throw new EmptyStringException();
                else {
                    Student student = labClass.searchStudent(name, surname);
                    JOptionPane.showMessageDialog(this, student);
                }
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            updateUI();
        });

        updateUI();
    }

    public void updateUI() {
        JPanel main_panel = new JPanel();
        GridLayout container_layout = new GridLayout(1, 2);
        main_panel.setLayout(container_layout);

        JPanel student_panel = new JPanel();
        GridLayout student_container = new GridLayout(labClass.students.length,1);
        student_panel.setLayout(student_container);

        JPanel UI_panel = new JPanel();
        GridLayout container_UI = new GridLayout(3, 1);
        UI_panel.setLayout(container_UI);

        for(int i = 0; i < labClass.students.length;i++){
            JTextField jTextField = new JTextField(String.valueOf(labClass.students[i]));
            student_panel.add(jTextField);
        }
        for (int i = 0; i < 2; i++) {
            UI_panel.add(textField[i]);
        }

        JPanel searchPanel = new JPanel(new GridLayout(1, 2));
        searchPanel.add(searchButton);
        UI_panel.add(searchPanel);

        main_panel.add(UI_panel);
        main_panel.add(student_panel);
        this.getContentPane().removeAll();
        this.repaint();
        this.add(main_panel);
        this.setVisible(true);
    }
}