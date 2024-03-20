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

public class Hitungsiku2 extends JFrame {
    public Hitungsiku2() {
        setTitle("Hasil Akhir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        
        JButton modifyButton = new JButton("alas dantinggi");
        JButton exitButton = new JButton("Keluar");

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(null, "Menampilkan Hasil Akhir", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hitungsiku Hitungsiku = new Hitungsiku(""); 
                Hitungsiku.setVisible(true);
                dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

       
        panel.add(modifyButton);
        panel.add(exitButton);

        add(panel);
    }
}