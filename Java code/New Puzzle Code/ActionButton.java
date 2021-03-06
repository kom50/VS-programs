import java.awt.event.*;
import javax.swing.*;

class ActionButton extends MouseAdapter {

    JLabel[] b1;

    int x, y, blankY = 300, blankX = 300;

    ActionButton() {

    }

    void addButton(JLabel[] b1) {
        this.b1 = new JLabel[b1.length];
        for (int i = 0; i < this.b1.length; i++) {
            this.b1[i] = new JLabel();
            this.b1[i] = b1[i];
        }
    }

    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        JLabel b = (JLabel) obj;
        int tempX = 0, tempY = 0;

        int index = -1;
        switch (b.getName()) {
        case "b0":
            index = 0;
            break;
        case "b1":
            index = 1;
            break;
        case "b2":
            index = 2;
            break;
        case "b3":
            index = 3;
            break;
        case "b4":
            index = 4;
            break;
        case "b5":
            index = 5;
            break;
        case "b6":
            index = 6;
            break;
        case "b7":
            index = 7;
            break;
        // case "b8":
        // index = 8;
        // break;
        }
        System.out.println("Name :->  " + index);

        x = (int) b1[index].getLocation().getX();
        y = (int) b1[index].getLocation().getY();
        tempX = blankX - x;
        tempY = blankY - y;
        if (((tempX == -100 || tempX == 100) && tempY == 0) || ((tempY == -100 || tempY == 100) && tempX == 0)) {
            b1[index].setLocation(blankX, blankY);
            blankX = x;
            blankY = y;
        }
    }
}