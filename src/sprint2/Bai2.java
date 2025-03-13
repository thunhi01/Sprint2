package bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tìm số lớn nhất");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel labelA = new JLabel("Nhập số A:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Nhập số B:");
        JTextField textB = new JTextField();
        JButton btnFindMax = new JButton("Tìm số lớn nhất");
        JLabel resultLabel = new JLabel("Kết quả: ");
        
        btnFindMax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double max = Math.max(a, b);
                    resultLabel.setText("Kết quả: " + max);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(btnFindMax);
        frame.add(resultLabel);
        
        frame.setVisible(true);
    }
}
