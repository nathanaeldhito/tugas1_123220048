/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220048_kuis;



/**
 *
 * @author Loq Gaming
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login() {
        setTitle("LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("LOGIN:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"User and password"});
        JButton button = new JButton("Next");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) comboBox.getSelectedItem();
                Hitungsiku Hitungsiku  = new Hitungsiku(selectedCategory);
                Hitungsiku .setVisible(true);
                dispose();
            }
        });

        panel.add(label);
        panel.add(comboBox);
        panel.add(button);

        add(panel);
    }
}