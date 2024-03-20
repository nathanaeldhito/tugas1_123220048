/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220048_kuis;

/**
 *
 * @author Loq Gaming
 */
import java.awt.PopupMenu;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hitungsiku extends JFrame {
    private String category;

    public Hitungsiku(String category) {
        this.category = category;
        setTitle("LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("username:");
        JTextField nameField = new JTextField(20);
        JLabel schoolLabel = new JLabel("password:");
        JTextField schoolField = new JTextField(20);
        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double score = Double.parseDouble(nameField.getText());
                if (score < 0 || score > 100) {
                    JOptionPane.showMessageDialog(null, "Nilai", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Sandi benar", "Info", JOptionPane.INFORMATION_MESSAGE);
                    Hitungsiku2 Hitungsiku2 = new Hitungsiku2();
                    Hitungsiku2.setVisible(true);
                    dispose();
                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(schoolLabel);
        panel.add(schoolField);
        
        panel.add(nextButton);

        add(panel);
    }
}