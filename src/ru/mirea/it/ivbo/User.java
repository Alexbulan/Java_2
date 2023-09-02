package ru.mirea.it.ivbo;

public class User {

    static int counter = 0;

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
        counter++;
        this.username = "Default";
        this.password = "Default";
    }

    public User(String username, String password) {
        counter++;
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {

    }
}
