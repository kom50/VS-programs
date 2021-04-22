import javax.swing.*;
import java.awt.*;
class MyPanel extends  JPanel {
    public MyPanel(){
        setBounds(10, 30, 300, 400);
        setBackground(Color.red);
        add(new JLabel("Hello Friends :("));
        
    }
}