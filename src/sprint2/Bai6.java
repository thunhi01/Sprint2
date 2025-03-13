package sprint2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai6 {
    public static void main(String[] args) {
        // Tạo cửa sổ giao diện
        JFrame frame = new JFrame("Sắp xếp tăng dần");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Nhập A:");
        JTextField txtA = new JTextField();
        JLabel labelB = new JLabel("Nhập B:");
        JTextField txtB = new JTextField();
        JButton btnSapXep = new JButton("Sắp xếp");
        JLabel labelKQ = new JLabel("Kết quả:");
        JLabel result = new JLabel();

        // Xử lý sự kiện khi nhấn nút sắp xếp
        btnSapXep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    if (a > b) {
                        result.setText(b + " , " + a);
                    } else {
                        result.setText(a + " , " + b);
                    }
                } catch (NumberFormatException ex) {
                    result.setText("Lỗi nhập liệu");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(txtA);
        frame.add(labelB);
        frame.add(txtB);
        frame.add(btnSapXep);
        frame.add(labelKQ);
        frame.add(result);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
