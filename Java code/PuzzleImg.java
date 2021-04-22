import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

class PuzzleImg extends Frame {
    private JLabel b1[];

    public PuzzleImg() {
        setTitle("Number Puzzle Game in JAVA Using AWT");
        setBounds(200, 100, 500, 600);
        setLayout(null);
        setVisible(true);

        b1 = new JLabel[9];
        Font f1 = new Font("Serif", Font.BOLD, 28);

        ImageIcon img[] = new ImageIcon[9];
        for (int i = 0; i < img.length; i++) {
            img[i] = new ImageIcon("photo/" + (1 + i) + ".jpg");
            b1[i] = new JLabel(img[i]);
        }

        for (int i = 0; i < b1.length; i++) {
            b1[i].setName("b" + i);
            b1[i].setSize(100, 100);
            b1[i].setBackground(Color.RED);
            b1[i].setFont(f1);
            b1[i].setForeground(Color.WHITE);
        }

        b1[0].setLocation(100, 100);
        b1[1].setLocation(200, 100);
        b1[2].setLocation(300, 100);
        b1[3].setLocation(100, 200);
        b1[4].setLocation(200, 200);
        b1[5].setLocation(300, 200);
        b1[6].setLocation(100, 300);
        b1[7].setLocation(200, 300);

        // b1[8].setLocation(300,300);
        for (int i = 0; i < b1.length - 1; i++)
            add(b1[i]);

        // ActionButton class extends MouseAdapter class
        ActionButton actionButton = new ActionButton();
        actionButton.addButton(b1);
        for (int i = 0; i < b1.length - 1; i++) {
            b1[i].addMouseListener(actionButton);
        }
        addWindowListener(new CloseWin());
        this.validate();
        // pack();
    }

    class CloseWin extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            Window obj = (Window) e.getSource();
            obj.dispose();
        }
    }

    public static void main(String[] args) {
        new PuzzleImg();
    }
}