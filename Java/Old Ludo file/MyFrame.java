import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    JButton b1;

    public MyFrame() {
        setBounds(10, 30, 500, 500);
        setVisible(true);

        b1 = new JButton("Click");
        add(b1, BorderLayout.SOUTH);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked :)");
                MyPanel p1 = new MyPanel();
                add(p1, BorderLayout.CENTER);
            }
        });
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}