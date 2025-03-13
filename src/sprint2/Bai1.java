package bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai1 extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnSolve;
    
    public Bai1() {
        setTitle("Giải phương trình bậc 1");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));
        
        add(new JLabel("Nhập A:"));
        txtA = new JTextField();
        add(txtA);
        
        add(new JLabel("Nhập B:"));
        txtB = new JTextField();
        add(txtB);
        
        btnSolve = new JButton("Giải");
        add(btnSolve);
        
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);
        
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveEquation();
            }
        });
        
        setVisible(true);
    }
    
    private void solveEquation() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            
            if (a == 0) {
                if (b == 0) {
                    txtResult.setText("Vô số nghiệm");
                } else {
                    txtResult.setText("Vô nghiệm");
                }
            } else {
                double x = -b / a;
                txtResult.setText("x = " + x);
            }
        } catch (NumberFormatException ex) {
            txtResult.setText("Lỗi nhập dữ liệu");
        }
    }
    
    public static void main(String[] args) {
        new Bai1();
    }
}
