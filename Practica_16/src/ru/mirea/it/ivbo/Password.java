package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
    JLabel passwordLabel, userLabel;
    JTextField userField;
    JPasswordField passwordField;
    JButton checkButton;

    public Password(){
        setTitle("Password application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        JPanel user = new JPanel();
        user.setLayout(new GridLayout(1, 1));
        JPanel passw = new JPanel();
        passw.setLayout(new GridLayout(1, 1));
        JPanel checkb = new JPanel();
        checkb.setLayout(new GridLayout(1, 1));
        userLabel = new JLabel("Username");
        user.add(userLabel);
        userField = new JTextField(20);
        user.add(userField);
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(20);
        passw.add(passwordLabel);
        passw.add(passwordField);
        checkButton = new JButton("Check");
        checkButton.addActionListener(e -> {
            String password = new String(passwordField.getPassword());
            String username = userField.getText();
            if(isValidPassword(password) && isValidUserName(username)){
                JOptionPane.showMessageDialog(this, "Password and username is valid!");
            }else if(!isValidPassword(password) && !isValidUserName(username)){
                JOptionPane.showMessageDialog(this, "Username and password is invalid!");
            }else if(!isValidPassword(password)){
                JOptionPane.showMessageDialog(this, "Password is invalid!");
            }else{
                JOptionPane.showMessageDialog(this, "Username is invalid!");
            }
        });
        checkb.add(checkButton);
        panel.add(user);
        panel.add(passw);
        panel.add(checkb);
        add(panel);
        pack();
        setVisible(true);
    }
    boolean isValidPassword(String password){
        return password.matches("^(?=.*[a-zA-Z])(?=.*\\d).{7,30}$");
    }
    boolean isValidUserName(String username){
        return username.matches("^(?=.*[a-zA-Z])(?=.*\\d).{3,100}$");
    }
}
