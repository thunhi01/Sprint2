import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai10 {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Kiểm tra số nguyên tố");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel labelNumber = new JLabel("Nhập số:");
        JTextField textNumber = new JTextField();
        JLabel resultLabel = new JLabel("Kết quả:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        JButton btnCheck = new JButton("Kiểm tra");

        // Xử lý sự kiện nút kiểm tra
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textNumber.getText());
                    
                    if (isPrime(number)) {
                        resultField.setText(number + " là số nguyên tố");
                    } else {
                        resultField.setText(number + " không phải số nguyên tố");
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Vui lòng nhập số nguyên hợp lệ");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelNumber);
        frame.add(textNumber);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(btnCheck);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
