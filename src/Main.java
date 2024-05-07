import java.awt.BorderLayout;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame startMenu = new JFrame();
        JPanel panel = new JPanel();
        startMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startMenu.setSize(300,200);
        System.out.println("Welcome to the TTT game! Press 1 to play, 2 to exit.");
        startMenu.setLocationRelativeTo(null);
        JButton login = new JButton("Login");
        JButton register = new JButton("Register");
        panel.add(login);
        panel.add(register);
        startMenu.setVisible(true);
        while (true) {

            Scanner menu = new Scanner(System.in);
            byte menu1 = menu.nextByte();
            switch (menu1) {
                case 1:
                    //start
                case 2:
                    break;
                case 3:
                    new Terminate();
            }
        }
    }
}