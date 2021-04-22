import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

public class Ludo1 extends JFrame {
    JLabel[] redB, greenB, blueB, yellowB;

    public Ludo1() {
        super("Ludo Game");
        setVisible(true);
        setBounds(20, 5, 634, 758);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1, 1));

        // Top North
        final JPanel pTop = new JPanel();
        pTop.setPreferredSize(new Dimension(650, 50));
        // pTop.setBackground(Color.white);
        pTop.setBorder(new LineBorder(Color.red, 2));
        final JLabel h1 = new JLabel("LUDO GAME");
        h1.setFont(new Font("Algerian", Font.BOLD, 32));
        pTop.add(h1);

        add(pTop, BorderLayout.NORTH);
        // Bottom
        final JPanel pBottom = new JPanel();
        pBottom.setPreferredSize(new Dimension(650, 80));
        // pTop.setBackground(Color.white);
        pBottom.setBorder(new LineBorder(Color.red, 2));
        final JLabel h2 = new JLabel("Om Prakash");
        h2.setFont(new Font("Algerian", Font.BOLD, 16));
        // pBottom.add(h2);
        add(pBottom, BorderLayout.SOUTH);
        add(new JPanel(), BorderLayout.EAST);
        add(new JPanel(), BorderLayout.WEST);

        final JButton b1 = new JButton("start");
        b1.setBackground(Color.cyan);
        b1.setPreferredSize(new Dimension(70, 50));
        pBottom.add(b1);

        // Center Panel
        final JPanel pc = new JPanel();
        pc.setLayout(new FlowLayout(1));
        // pc.setBackground(Color.red);
        // pc.setPreferredSize(new Dimension(650, 700));
        final JPanel p1 = new JPanel();
        // p1.setLayout(new GridLayout(3, 3));
        p1.setLayout(null);
        p1.setPreferredSize(new Dimension(583, 583));
        // p1.setSize(580, 600);
        p1.setBackground(Color.black);
        p1.setBorder(new LineBorder(Color.black, 2));

        final JPanel p11[] = new JPanel[9];
        for (int i = 0; i < p11.length; i++) {
            p11[i] = new JPanel();
            // p11[i].setPreferredSize(new Dimension(50,50));
            p1.add(p11[i]);
        }

        p11[0].setBounds(2, 2, 220, 220);
        p11[1].setBounds(220, 2, 140, 220);
        p11[2].setBounds(360, 2, 220, 220);

        p11[3].setBounds(2, 220, 220, 140);
        p11[4].setBounds(220, 220, 140, 140);

        p11[4].setLayout(new FlowLayout(1));
        final JLabel ll = new JLabel("LUDO (`.`)", JLabel.CENTER);
        ll.setPreferredSize(new Dimension(140, 140));
        ll.setFont(new Font("Arial", Font.BOLD, 22));
        p11[4].add(ll);

        p11[5].setBounds(360, 220, 220, 140);

        p11[6].setBounds(2, 360, 220, 220);
        p11[7].setBounds(220, 360, 140, 220);
        p11[8].setBounds(360, 360, 220, 220);

        p11[0].setBorder(new LineBorder(Color.black));
        p11[2].setBorder(new LineBorder(Color.black));
        p11[6].setBorder(new LineBorder(Color.black));
        p11[8].setBorder(new LineBorder(Color.black));

        p11[0].setBackground(Color.red);
        p11[1].setBackground(Color.black);
        p11[2].setBackground(Color.green);
        p11[3].setBackground(Color.black);
        p11[4].setBackground(Color.cyan);
        p11[5].setBackground(Color.black);
        p11[6].setBackground(Color.blue);
        p11[7].setBackground(Color.black);
        p11[8].setBackground(Color.YELLOW);

        add(pc, BorderLayout.CENTER);
        pc.add(p1);
        // Add Four Box in Box 1st
        final JPanel l1[] = new JPanel[4];
        redB = new JLabel[4]; // Buttons icon
        for (int i = 0; i < l1.length; i++) {
            l1[i] = new JPanel();
            l1[i].setLayout(new GridLayout(1, 1));
            l1[i].setBackground(Color.white);
            l1[i].setPreferredSize(new Dimension(50, 50));

            // Icons
            redB[i] = new JLabel(new ImageIcon("red1.png"));
            l1[i].add(redB[i]);
        }
        p11[0].setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p11[0].add(l1[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        p11[0].add(l1[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        p11[0].add(l1[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        p11[0].add(l1[3], gbc);

        // End
        final JPanel l11[] = new JPanel[4];
        // icons
        greenB = new JLabel[4];
        for (int i = 0; i < l11.length; i++) {
            l11[i] = new JPanel();
            l11[i].setBackground(Color.white);
            l11[i].setPreferredSize(new Dimension(50, 50));
            l11[i].setLayout(new GridLayout(1, 1));
            // add icons

            greenB[i] = new JLabel(new ImageIcon("green.png"));
            l11[i].add(greenB[i]);
        }
        p11[2].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p11[2].add(l11[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        p11[2].add(l11[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        p11[2].add(l11[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        p11[2].add(l11[3], gbc);
        // End

        final JPanel l22[] = new JPanel[4];
        blueB = new JLabel[4];
        for (int i = 0; i < l11.length; i++) {
            l22[i] = new JPanel();
            l22[i].setBackground(Color.white);
            l22[i].setPreferredSize(new Dimension(50, 50));
            l22[i].setLayout(new GridLayout(1, 1));
            // add icons

            blueB[i] = new JLabel(new ImageIcon("blue.png"));
            l22[i].add(blueB[i]);
        }
        p11[6].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p11[6].add(l22[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        p11[6].add(l22[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        p11[6].add(l22[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        p11[6].add(l22[3], gbc);
        // End
        final JPanel l33[] = new JPanel[4];
        yellowB = new JLabel[4];
        for (int i = 0; i < l11.length; i++) {
            l33[i] = new JPanel();
            l33[i].setBackground(Color.white);
            l33[i].setLayout(new GridLayout(1, 1));
            l33[i].setPreferredSize(new Dimension(50, 50));
            // add icons

            yellowB[i] = new JLabel(new ImageIcon("yellow.png"));
            l33[i].add(yellowB[i]);
        }
        p11[8].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p11[8].add(l33[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        p11[8].add(l33[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        p11[8].add(l33[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        p11[8].add(l33[3], gbc);
        // End

        // add red
        p11[1].setLayout(new GridLayout(6, 3, 2, 2));
        final JPanel p22[] = new JPanel[18];
        for (int i = 0; i < p22.length; i++) {
            p22[i] = new JPanel();
            p22[i].setPreferredSize(new Dimension(10, 10));
            p11[1].add(p22[i]);
        }
        p22[4].setBackground(Color.green);
        p22[5].setBackground(Color.green);
        p22[7].setBackground(Color.green);
        p22[10].setBackground(Color.green);
        p22[13].setBackground(Color.green);
        p22[16].setBackground(Color.green);
        final JLabel ic = new JLabel(new ImageIcon("3.png"));
        p22[5].add(ic);
        final JLabel icc = new JLabel(new ImageIcon("3.png"));
        p22[6].add(icc);

        p22[8].add(new JLabel(new ImageIcon("green.png")));
        //
        p11[3].setLayout(new GridLayout(3, 6, 2, 2));
        final JPanel p33[] = new JPanel[18];
        for (int i = 0; i < p22.length; i++) {
            p33[i] = new JPanel();
            p33[i].setPreferredSize(new Dimension(10, 10));
            p11[3].add(p33[i]);
        }
        p33[1].setBackground(Color.red);
        p33[7].setBackground(Color.red);
        p33[8].setBackground(Color.red);
        p33[9].setBackground(Color.red);
        p33[10].setBackground(Color.red);
        p33[11].setBackground(Color.red);
        // star Icon add
        final JLabel ic1 = new JLabel(new ImageIcon("3.png"));
        final JLabel ic11 = new JLabel(new ImageIcon("3.png"));
        p33[1].add(ic1);
        p33[14].add(ic11);
        //
        p11[5].setLayout(new GridLayout(3, 6, 2, 2));
        final JPanel p44[] = new JPanel[18];
        for (int i = 0; i < p22.length; i++) {
            p44[i] = new JPanel();
            p44[i].setPreferredSize(new Dimension(10, 10));
            p11[5].add(p44[i]);
        }
        p44[6].setBackground(Color.yellow);
        p44[7].setBackground(Color.yellow);
        p44[8].setBackground(Color.yellow);
        p44[9].setBackground(Color.yellow);
        p44[10].setBackground(Color.yellow);
        p44[16].setBackground(Color.yellow);

        final JLabel ic2 = new JLabel(new ImageIcon("3.png"));
        p44[16].add(ic2, 0);
        final JLabel ic22 = new JLabel(new ImageIcon("3.png"));
        p44[3].add(ic22, 0);

        //
        p11[7].setLayout(new GridLayout(6, 3, 2, 2));
        final JPanel p55[] = new JPanel[18];
        for (int i = 0; i < p22.length; i++) {
            p55[i] = new JPanel();
            p55[i].setPreferredSize(new Dimension(10, 10));
            p11[7].add(p55[i]);
        }
        p55[1].setBackground(Color.blue);
        p55[4].setBackground(Color.blue);
        p55[7].setBackground(Color.blue);
        p55[10].setBackground(Color.blue);
        p55[13].setBackground(Color.blue);
        p55[12].setBackground(Color.blue);

        final JLabel ic3 = new JLabel(new ImageIcon("3.png"));
        p55[12].add(ic3);
        final JLabel ic33 = new JLabel(new ImageIcon("3.png"));
        p55[11].add(ic33);
        // p11[4].setBackground(Color.white);
    }

    public void actionPerformed(final ActionEvent ae) {

    }

    public static void main(final String[] args) {
        new Ludo1();
    }
}