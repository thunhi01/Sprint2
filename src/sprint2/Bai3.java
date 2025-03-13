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
public class Bai3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kiểm tra số đối xứng");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));
        
        JTextField txtNumber = new JTextField();
        JButton btnCheck = new JButton("Kiểm tra");
        JLabel lblResult = new JLabel("Kết quả: ", SwingConstants.CENTER);
        
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numStr = txtNumber.getText();
                if (isPalindrome(numStr)) {
                    lblResult.setText("Đối xứng");
                } else {
                    lblResult.setText("Không đối xứng");
                }
            }
        });
        
        frame.add(txtNumber);
        frame.add(btnCheck);
        frame.add(lblResult);
        
        frame.setVisible(true);
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


