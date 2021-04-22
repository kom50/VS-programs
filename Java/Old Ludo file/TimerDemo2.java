import java.util.Timer;
import java.util.TimerTask;
class Help extends TimerTask{
    static int i = 1;
    public void run(){
        java.awt.Fra
        System.out.println("Time : "+i++);
    }
}
public class TimerDemo2 {
    static int i = 0;
    public static void main(String []args){
        
        Timer t1 = new Timer();
        TimerTask task = new Help();
        t1.schedule(task, 100, 100);
        System.out.println("Hello Bro Code");
    }
}