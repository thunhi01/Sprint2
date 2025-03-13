package sprint2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai7 {
    public static void main(String[] args) {
        // Tạo cửa sổ giao diện
        JFrame frame = new JFrame("Đảo ngược hai số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Nhập A:");
        JTextField txtA = new JTextField();
        JLabel labelB = new JLabel("Nhập B:");
        JTextField txtB = new JTextField();
        JButton btnDaoNguoc = new JButton("Đảo ngược");
        JLabel labelKQ = new JLabel("Kết quả:");
        JLabel result = new JLabel();

        // Xử lý sự kiện khi nhấn nút đảo ngược
        btnDaoNguoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String a = txtA.getText();
                    String b = txtB.getText();
                    result.setText("A: " + b + " , B: " + a);
                } catch (Exception ex) {
                    result.setText("Lỗi nhập liệu");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(txtA);
        frame.add(labelB);
        frame.add(txtB);
        frame.add(btnDaoNguoc);
        frame.add(labelKQ);
        frame.add(result);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
