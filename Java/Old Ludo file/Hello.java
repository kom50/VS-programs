import javax.swing.*;
public class Hello extends JFrame{
  Hello(){
    JOptionPane.showConfirmDialog(Hello.this, "Do you want to Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    setBounds(10, 10, 300, 400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String []args) {
	 new Hello();
  }
}
