//import java.util.*;

import javax.swing.*;
import java.awt.event.*;
// class Help extends TimerTask{
//     JFrame f1 = new JFrame();
//     f1.setVisible(true);
// //    f1.setBounds(12, 33, 300, 300);
//     static int i = 1;
//     public void run(){
//         System.out.println("Time : "+i++);
//     }
// }
public class TimerDemo {
    static int i = 0;
    public static void main(String []args){
        
        Timer t1 = new Timer(1, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.out.println("Bro Code : "+i);
                i = i + 1;
            }
        });
        t1.start();
        t1.restart();
     //   TimerTask task = new Help();
       // t1.schedule(task, 100, 100);
        System.out.println("Hello Bro Code");
    }
}