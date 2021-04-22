    import javax.swing.*;
    import java.awt.*;
    class GraphicsDemo extends JFrame{
        
        public GraphicsDemo(){
            super("Graphics program in Swing");
            setBounds(60, 30, 400, 400);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            

            validate();
        }
        public void paint(Graphics g){

            g.setColor(new Color(122, 233, 90));
            g.drawRect(10, 70, 150, 120);

            g.drawString("Hello Graphics", 100, 50);

        }
        public static void main(String []args){
            new GraphicsDemo();
        }
    }