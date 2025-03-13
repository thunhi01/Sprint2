import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai8 {
    // Hàm tìm USCLN (Ước số chung lớn nhất)
    public static int uscln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Hàm tìm BSCNN (Bội số chung nhỏ nhất)
    public static int bscnn(int a, int b) {
        return Math.abs(a * b) / uscln(a, b);
    }

    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Tìm BSCNN của 2 số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Số thứ nhất:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Số thứ hai:");
        JTextField textB = new JTextField();
        JLabel resultLabel = new JLabel("BSCNN:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        JButton btnCalculate = new JButton("Tìm BSCNN");

        // Xử lý sự kiện nút tính BSCNN
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int A = Integer.parseInt(textA.getText());
                    int B = Integer.parseInt(textB.getText());
                    
                    int result = bscnn(A, B);
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Vui lòng nhập số nguyên hợp lệ");
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
        frame.add(btnCalculate);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}

