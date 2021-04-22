import java.io.*;
class WriteConsole {
   public static void main(String []args) throws IOException{
       BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
       br.write("Hello Console");
   }
}