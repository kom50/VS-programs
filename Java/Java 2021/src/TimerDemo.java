import java.util.Timer;
import java.util.TimerTask;
import static java.lang.System.*;

class TimerDemo{
	public static void main(String args[]) {
		Timer t1 = new Timer();
		t1.scheduleAtFixedRate(new TimerTask() {
			 int i = 0;
			 public void run() {
				 out.println("Hello Timer "+(i++));
			 }
		 }, 0, 1000);
		

	}
}