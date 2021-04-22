import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriteData {                                                                                    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out);
        out.println("Hello Print Stream class (^.^)");

        PrintWriter out1 = new PrintWriter(System.out);
        out1.write("Hello print write class (*_*)");
        out1.flush();
        FileWriter out2 = null;
        try {
            File file = new File("test.ser");
            file.setExecutable(true);
            out2 = new FileWriter(file);
            out2.write("Hello print write class");
            out2.write("\n2nd line");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                out2.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String str = reader.readLine();
            System.out.println("File data : " + str + " \n 2nd  " + reader.readLine().trim());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
