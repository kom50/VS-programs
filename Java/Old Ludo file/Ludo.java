import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
public class Ludo extends JFrame implements ActionListener{
    JLabel []redB, greenB, blueB, yellowB;
    JPanel []greenLine, redLine, blueLine, yellowLine;
    JPanel [] p55, p33, p22;
    JButton b1;
    public Ludo(){
        super("Ludo Game");
        setVisible(true);
        setBounds(20, 5, 634, 758);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1, 1));
        
        //Top North
        JPanel pTop = new JPanel();
        pTop.setPreferredSize(new Dimension(650, 50));
       // pTop.setBackground(Color.white);
        pTop.setBorder(new LineBorder(Color.red, 2));
        JLabel h1 = new JLabel("LUDO GAME");
        h1.setFont(new Font("Algerian", Font.BOLD, 32));
        pTop.add(h1);

        add(pTop, BorderLayout.NORTH);
        //Bottom
        JPanel pBottom = new JPanel();
        pBottom.setPreferredSize(new Dimension(650, 80));
       // pTop.setBackground(Color.white);
        pBottom.setBorder(new LineBorder(Color.red, 2));
        JLabel h2 = new JLabel("Om Prakash");
        h2.setFont(new Font("Algerian", Font.BOLD, 16));
        //pBottom.add(h2);
        add(pBottom, BorderLayout.SOUTH);
        add(new JPanel(), BorderLayout.EAST);
        add(new JPanel(), BorderLayout.WEST);
 
        b1 = new JButton("start");
        b1.setBackground(Color.cyan);
        b1.setPreferredSize(new Dimension(65, 60));
        pBottom.add(b1);
        b1.addActionListener(this);

        //Center Panel
        JPanel pc = new JPanel();
        pc.setLayout(new FlowLayout(1));
       // pc.setBackground(Color.red);
        //pc.setPreferredSize(new Dimension(650, 700));
        JPanel p1 = new JPanel();
        //p1.setLayout(new GridLayout(3, 3));
        p1.setLayout(null);
        p1.setPreferredSize(new Dimension(583   , 583));
        //p1.setSize(580, 600);
        p1.setBackground(Color.black);
        p1.setBorder(new LineBorder(Color.black, 2));

        JPanel p11[] = new JPanel[9];
        for(int i = 0; i < p11.length; i++){
            p11[i] = new JPanel();
            //p11[i].setPreferredSize(new Dimension(50,50));
            p1.add(p11[i]);
        }
        
        p11[0].setBounds(2, 2, 220, 220);
        p11[1].setBounds(220, 2, 140, 220);
        p11[2].setBounds(360, 2, 220, 220);
        
        p11[3].setBounds(2, 220, 220, 140);
        p11[4].setBounds(220, 220, 140, 140);
        
        p11[4].setLayout(new GridLayout(1, 1));
        JLabel ll = new JLabel(new ImageIcon("center2.png"));
       // ll.setPreferredSize(new Dimension(142, 142));
        //ll.setFont(new Font("Arial", Font.BOLD, 22));
        
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
        
        add(pc, BorderLayout.CENTER );
        pc.add(p1); 
        //Add Four Box in Box 1st red
        JPanel l1[] = new JPanel[4];
        redB = new JLabel[4]; //Buttons icon 
        for(int i = 0; i < l1.length; i++){
          l1[i] = new JPanel();
          l1[i].setLayout(new GridLayout(1, 1));
          l1[i].setBackground(Color.white);
          l1[i].setPreferredSize(new Dimension(50, 50));

          //Icons
          redB[i] = new JLabel(new  ImageIcon("red1.png"));
          l1[i].add(redB[i]);
        }
        p11[0].setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        p11[0].add(l1[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 1;
        p11[0].add(l1[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 0;
        p11[0].add(l1[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 1;
        p11[0].add(l1[3], gbc);
        
        //End
        //green Box
        JPanel l11[] = new JPanel[4];
        //icons
        greenB = new JLabel[4];
        for(int i = 0; i < l11.length; i++){
            l11[i] = new JPanel();
            l11[i].setBackground(Color.white);
            l11[i].setPreferredSize(new Dimension(50, 50));    
            l11[i].setLayout(new GridLayout(1, 1));
            //add icons
            
          greenB[i] = new JLabel(new  ImageIcon("green.png"));
          greenB[i].setVerticalAlignment(JLabel.CENTER);
          l11[i].add(greenB[i]);
        }

        p11[2].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        p11[2].add(l11[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 1;
        p11[2].add(l11[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 0;
        p11[2].add(l11[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 1;
        p11[2].add(l11[3], gbc);
        //End

        //Blue Box
        JPanel l22[] = new JPanel[4];
        blueB = new JLabel[4];
        for(int i = 0; i < l11.length; i++){
            l22[i] = new JPanel();
            l22[i].setBackground(Color.white);
            l22[i].setPreferredSize(new Dimension(50, 50));
            l22[i].setLayout(new GridLayout(1, 1));
            //add icons
            
          blueB[i] = new JLabel(new  ImageIcon("blue.png"));
          l22[i].add(blueB[i]);    
        }
        p11[6].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        p11[6].add(l22[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 1;
        p11[6].add(l22[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 0;
        p11[6].add(l22[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 1;
        p11[6].add(l22[3], gbc);
        //End

        //Yellow Box
        JPanel l33[] = new JPanel[4];
        yellowB = new JLabel[4];
        for(int i = 0; i < l11.length; i++){
            l33[i] = new JPanel();
            l33[i].setBackground(Color.white);
            l33[i].setLayout(new GridLayout(1, 1));
            l33[i].setPreferredSize(new Dimension(50, 50));
            //add icons
            
          yellowB[i] = new JLabel(new  ImageIcon("yellow.png"));
          l33[i].add(yellowB[i]);    
        }
        p11[8].setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        p11[8].add(l33[0], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 1;
        p11[8].add(l33[1], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 0;
        p11[8].add(l33[2], gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1; gbc.gridy = 1;
        p11[8].add(l33[3], gbc);
        //End

        //add red and green 
        p11[1].setLayout(new GridLayout(6, 3, 2, 2));
        p22 = new JPanel[18];
        for(int i = 0; i < p22.length; i++){
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
        JLabel ic = new JLabel(new  ImageIcon("3.png"));
        p22[5].add(ic);
        JLabel icc = new JLabel(new  ImageIcon("3.png"));
        p22[6].add(icc);

        JPanel pl = p22[8];
        pl.add(blueB[0]);

        //red Box and Blue Box
        p11[3].setLayout(new GridLayout(3, 6, 2, 2));
        p33 = new JPanel[18];
        for(int i = 0; i < p22.length; i++){
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
        //star Icon add
        JLabel ic1 = new JLabel(new  ImageIcon("3.png"));
        JLabel ic11 = new JLabel(new  ImageIcon("3.png"));
        p33[1].add(ic1);
        p33[14].add(ic11);
       
        //Yellow box and green Box
        p11[5].setLayout(new GridLayout(3, 6, 2, 2));
        JPanel p44[] = new JPanel[18];
        for(int i = 0; i < p22.length; i++){
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

        JLabel ic2 = new JLabel(new  ImageIcon("3.png"));
        p44[16].add(ic2, 0);
        JLabel ic22 = new JLabel(new  ImageIcon("3.png"));
        p44[3].add(ic22, 0);
        
        //blue box and Yellow box  
        p11[7].setLayout(new GridLayout(6, 3, 2, 2));
        p55 = new JPanel[18];
        for(int i = 0; i < p22.length; i++){
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
        
        JLabel ic3 = new JLabel(new  ImageIcon("3.png"));
        p55[12].add(ic3);
        JLabel ic33 = new JLabel(new  ImageIcon("3.png"));
        p55[11].add(ic33);
       // p11[4].setBackground(Color.white);
 //   }
    // line move button 
    greenLine = new JPanel[57];
    redLine = new JPanel[57];
    blueLine = new JPanel[57];
    yellowLine = new JPanel[57];
    // for(int i = 0; i <greenLine.length; i++){
    //     greenLine[i] = new JPanel();
    //     redLine[i] = new JPanel();
    //     blueLine[i] = new JPanel();
    //     yellowLine[i] = new JPanel();
    // }
    greenLine[0] = p22[5]; greenLine[1] = p22[8]; greenLine[2] = p22[11]; greenLine[3] = p22[14]; greenLine[4] = p22[17];
    greenLine[5] = p44[0]; greenLine[6] = p44[1]; greenLine[7] = p44[2]; greenLine[8] = p44[3]; greenLine[9] = p44[4];
    greenLine[10] = p44[5]; greenLine[11] = p44[11]; greenLine[12] = p44[17]; greenLine[13] = p44[16]; greenLine[14] = p44[15];
    greenLine[15] = p44[14]; greenLine[16] = p44[13]; greenLine[17] = p44[12]; 
    int j, k = 18;
    for( j = 2; j <= 17; j = j + 3){
        greenLine[k] = p55[j];
        k++;
    }
    System.out.println("x : "+k);
    greenLine[k++] = p55[16];
    for(j = 15; j >= 0; j = j - 3){
        greenLine[k] = p55[j];
        k++;
    } 
    System.out.println("x  1 : "+k);
    for(j = 17; j >= 12; j = j - 1){
        greenLine[k] = p33[j];
        k++;
    }
    greenLine[k++] = p33[6];
    System.out.println("x 2 : "+k);
    for(j = 0; j <= 5; j = j + 1){
        greenLine[k] = p33[j];
        k++;
    }
    System.out.println("Value of k : "+k);
    for(j = 15; j >= 0; j = j - 3){
        greenLine[k] = p22[j];
        k++;
    }
    System.out.println("Value of k : "+k);

    for(j = 1; j <= 16; j = j + 3){
        greenLine[k] = p22[j];
        k++;
    }
    System.out.println("Value of k : "+k);
	validate();
}

public void actionPerformed(ActionEvent e)
	{
        if(e.getSource() == b1){
           System.out.println("Button is clicked");
           for(int i = 0 ; i < greenLine.length- 1; i++){
            //delay1(99099);
            Timer t1 = new Timer(10000, this);
            t1.start();    
            greenLine[i].add(greenB[2]);
            greenLine[i].setBackground(Color.white);
                
           }
	  //	int  a=Integer.parseInt(t1.getText());
		//int b=Integer.parseInt(t2.getText());
       }
    }

    public void delay1(long f){
        for(int i = 0; i < f * 999; i++){
            for(int j = 0; j < 999910; j++){}
        }
    }
    
    public static void main(String []args){
        new Ludo();
    }
}