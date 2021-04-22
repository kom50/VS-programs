import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator extends JFrame implements ActionListener{
    JButton jb[];
    JTextField text;
    String [] icon;
    char[] op;
    public Calculator(){
      super("Calculator");
      setVisible(true);
      setBounds(100, 10, 300, 480);
      setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.insets = new Insets(2, 2, 2, 2);
      op = new char[]{'%', '/', '*', '-', '+', '.'};
      icon = new String[]{"pw", "C", "<-", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+","%", "0", ".", "="};
      jb = new JButton[20];
      for(int i = 0; i < jb.length; i++){
          jb[i] = new JButton();
          jb[i].setBackground(Color.white);
          jb[i].setForeground(Color.blue);
          jb[i].setPreferredSize(new Dimension(60, 60));
          jb[i].setFont(new Font("Arial", Font.BOLD, 18));
          jb[i].addActionListener(this);
      }
      int l = 0;
      for(int i = 1; i < 6; i++){
          for(int j = 0; j <  4; j++){
          jb[l].setText(icon[l]);
               gbc.fill = GridBagConstraints.HORIZONTAL;     
               gbc.gridx = j; gbc.gridy = i; 
               add(jb[l], gbc);
               l++;
               
          }
      }
      
      text = new JTextField();    
      text.setEditable(false);
      text.setHorizontalAlignment(JTextField.RIGHT  );
      text.setBackground(Color.white);
      text.setPreferredSize(new Dimension(200, 40));
      text.setFont(new Font("Arial", Font.BOLD, 18));
      gbc.fill = GridBagConstraints.HORIZONTAL;  
      gbc.gridx = 0; gbc.gridy = 0;  gbc.gridwidth = 4;
      add(text, gbc);        
      setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e){
        String s;
        Object obj = (Object)e.getSource();
        for(int i = 3; i < jb.length - 1;i++){
            if(obj == jb[i]){
                if(i != 3 && i != 7 && i != 11 && i != 15 && i != 16 && i != 18)
                  text.setText(text.getText()+jb[i].getText());
                
            }
            
        }
        if(obj == jb[0]){
            if(!text.getText().isEmpty()){
                text.setText(String.valueOf((Integer.parseInt(text.getText())) * (Integer.parseInt(text.getText()))));
            }
        }
        if(obj == jb[2]){
            s = text.getText();
            if(!s.isEmpty()){
              text.setText(s.substring(0,s.length() - 1 ));
            }
        }
        if(obj == jb[1]){
            s = text.getText();
            text.setText("");
        }
        if(obj == jb[18]){
            s = text.getText();
            if(!s.isEmpty()){
                if(s.charAt(s.length() - 1) != '.' && s.lastIndexOf(".", s.length() - 2) == -1){
                    s = s.substring(0, s.length());
                    text.setText(s + ".");
                    System.out.println("Hello");
                }else if(s.lastIndexOf(".", s.length() - 1) == -1){
                    s = s.substring(0, s.length());
                    text.setText(s + ".");
                    System.out.println("Hello om");
                }
            }else{
                text.setText(s + "0.");
            }
            
        }
        if(obj == jb[3]){
            //boolean f = false;
            s = text.getText();
            if(!s.isEmpty()  && s.charAt(0) != '-'){
                if(isDigit(s.charAt(s.length() - 1))){
                    s = s.substring(0, s.length());
                    text.setText(s + "/");
                }else{
                    s = s.substring(0, s.length() - 1);
                    text.setText(s + "/");
                }
            }
        }
        if(obj == jb[7]){
            //boolean f = false;
            s = text.getText();
            if(!s.isEmpty() && s.charAt(0) != '-' ){
                if(isDigit(s.charAt(s.length() - 1))){
                    s = s.substring(0, s.length());
                    text.setText(s + "*");
                }else{
                    s = s.substring(0, s.length() - 1);
                    text.setText(s + "*");
                }
            }
        }
        if(obj == jb[11]){
            //boolean f = false;
            s = text.getText();
            if(!s.isEmpty()){
                if(isDigit(s.charAt(s.length() - 1))){
                    s = s.substring(0, s.length());
                    text.setText(s + "-");
                }else{
                    s = s.substring(0, s.length() - 1);
                    text.setText(s + "-");
                }
              }
            if(s.isEmpty())
                text.setText(s + "-");
        }
        if(obj == jb[15]){
            boolean f = false;
            s = text.getText();
            if(!s.isEmpty() && s.charAt(0) != '-'){
                if(isDigit(s.charAt(s.length() - 1))){
                    s = s.substring(0, s.length());
                    text.setText(s + "+");
                }else{
                    s = s.substring(0, s.length() - 1);
                    text.setText(s + "+");
                }
              }
        }
        if(obj == jb[16]){
            boolean f = false;
            s = text.getText();
            if(!s.isEmpty() && s.charAt(0) != '-'){
                for(int i = 0; i < op.length; i++){
                  if(s.charAt(s.length() - 1) == op[i]){
                       f = true;    
                  } 
                }
                if(f == false)
                    text.setText(s + "%");
               }
        }               
        if(obj == jb[icon.length- 1]){
             if(!text.getText().isEmpty()){
                  System.out.println(operation('*', "34", "2")+"  "+(-5 + 4));
                  eval(text.getText());
             }
        }
        
  }
  void eval(String exp){
      String lop = new String(), 
      rop = new String(), 
      leftstr = new String(),
      rightstr = new String();
     // newstr = new String();
      int index = 0;
      String s = new String();
      int lst = -1;
       for(int j = 0; j < op.length; j++){
          index = getIndex(exp, 0); 
          System.out.println("Index : "+index);   
          if(index == 0)
              index = getIndex(exp, 1); 
          if(index != -1){ // index == 0
                int i;
                //Left side expression 
                lop = "";
             //  if(index != 0){
                for(i = index - 1; i >= 0; i--){
                    if(isDigit(exp.charAt(i))){
                      lop = lop + exp.charAt(i);
                       lst = i;
                     }
                     else if(i == 0){
                        if(exp.charAt(0) == '-'){
                           lop = lop + exp.charAt(i);
                           lst = i;
                           System.out.println("Hello lop : "+lop);
                        }
                     }
                     else
                        break;
                }
                if( i != 0){
                    leftstr = exp.substring(0, lst);
                }
              // }
               //Right side expression
               rop = "";
               for(i = index + 1; i < exp.length(); i++){
                 if(isDigit(exp.charAt(i))){
                     rop = rop + exp.charAt(i);
                     lst = i;
                 }else{
                    break;
                 }
               }        
               if( i != exp.length() - 1){
                  rightstr = exp.substring(index + 2);
               }
          }
         else
             break;
         
         s = operation(exp.charAt(index), reverse(lop), rop);
         System.out.println(exp+"   "+ index+"  "+ reverse(lop)+"   "+ rop+" result : "+s+" left : "+leftstr+" right : "+rightstr);
         if(getIndex(leftstr, 0) != -1 && getIndex(rightstr, 0) != -1){
             exp = leftstr + s + rightstr;
             System.out.println("1 : "+exp+"   "+ index+"  "+ reverse(lop)+"   "+ rop+" result : "+s+"  left : "+leftstr+" right : "+rightstr);
         }
         else if(getIndex(leftstr, 0) == -1 && getIndex(rightstr, 0) != -1){
             exp = s + rightstr;
             System.out.println("2 : "+exp+"   "+ index+"  "+ reverse(lop)+"   "+ rop+" result : "+s+" left : "+leftstr+" right : "+rightstr);
         }
         else if(getIndex(leftstr, 0) != -1 && getIndex(rightstr, 0) == -1){
             exp =  leftstr +s ;
             System.out.println("3 : "+exp+"   "+ index+"  "+ reverse(lop)+"   "+ rop+" result : "+s+" left : "+leftstr+" right : "+rightstr);
         }
         System.out.println("Str : "+exp+" s :  "+s);
       }
      text.setText(s);  
  }
  int getIndex(String exp, int p){
      boolean f = false;
      int in = 0;
      for(int i = 0; i < op.length; i++){
        in = exp.indexOf(op[i], p);
        if(in != -1){
           
           f = true;
            break;
         }
      }
      if(f == true)
         return in;
      else
         return -1;
      
  }
  String reverse(String s){
      String rev = new String();
      for(int i = 0; i < s.length(); i++)
          rev = rev+s.charAt(s.length() - 1 - i);
      return rev;
  }
  boolean isDigit(char ch){     
      //System.out.println("ch : "+ch);
      if(ch >= 48 && ch <= 57 || ch == '.')
          return true;
      else
        return false;
  }
  String operation(char op, String lSideop, String rSideop){
       float result = 0;
       switch(op){
           case '/' : result = Float.parseFloat(lSideop) / Float.parseFloat(rSideop);
                      break;
           case '*' : result = Float.parseFloat(lSideop) * Float.parseFloat(rSideop);
                      break;
           case '%' : result = Float.parseFloat(lSideop) % Float.parseFloat(rSideop);
                      break;
           case '+' : result = Float.parseFloat(lSideop) + Float.parseFloat(rSideop);
                      break;
           case '-' : result = Float.parseFloat(rSideop) - Float.parseFloat(lSideop);
                      break;   
       }
       String d = String.valueOf(result);
       int a = d.indexOf(".");
      // System.out.println("Index : "+a);
       if(d.charAt(a + 1) == '0' )
          return String.valueOf((int)result);
       else 
           return String.valueOf(result); 
  }
  public static void main(String []args){
      new Calculator();
  }
}
