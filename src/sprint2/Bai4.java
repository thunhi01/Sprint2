/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprint2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author M.S.I
 */
public class Bai4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tìm số nhỏ nhất");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 1));
        
        JTextField txtA = new JTextField();
        JTextField txtB = new JTextField();
        JButton btnFindMin = new JButton("Tìm số nhỏ nhất");
        JLabel lblResult = new JLabel("Kết quả: ", SwingConstants.CENTER);
        
        btnFindMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double min = Math.min(a, b);
                    lblResult.setText("Số nhỏ nhất: " + min);
                } catch (NumberFormatException ex) {
                    lblResult.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
        
        frame.add(txtA);
        frame.add(txtB);
        frame.add(btnFindMin);
        frame.add(lblResult);
        
        frame.setVisible(true);
    }
}


