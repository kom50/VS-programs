package animation;

//Java sample code to get the list of
//installed Look and Feel themes, here is a sample code:
import javax.swing.UIManager;

public class LookAndFeelDemo {
	public static void main(String[] a) {
		UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo look : looks) {
			System.out.println(look.getClassName());
		}
	}
}

/*
	javax.swing.plaf.metal.MetalLookAndFeel
	javax.swing.plaf.nimbus.NimbusLookAndFeel
	com.sun.java.swing.plaf.motif.MotifLookAndFeel
	com.sun.java.swing.plaf.windows.WindowsLookAndFeel
	com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel

*/