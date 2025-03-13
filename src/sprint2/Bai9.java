
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai9 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Sắp xếp 2 số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Số thứ nhất:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Số thứ hai:");
        JTextField textB = new JTextField();
        JLabel resultLabel = new JLabel("Thứ tự giảm dần:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        JButton btnSort = new JButton("Sắp xếp");

        // Xử lý sự kiện nút sắp xếp
        btnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int A = Integer.parseInt(textA.getText());
                    int B = Integer.parseInt(textB.getText());
                    
                    if (A >= B) {
                        resultField.setText(A + " - " + B);
                    } else {
                        resultField.setText(B + " - " + A);
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(btnSort);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}