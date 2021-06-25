package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class Client{
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client() throws UnknownHostException, IOException{
		 socket = new Socket("localhost", 6666);
		 dis = new DataInputStream(socket.getInputStream());
		 dos = new DataOutputStream(socket.getOutputStream());
	}
    public void sendMessage(String msg) {
    	try {
			dos.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    public String readMessage() {
    	String msg = null ;
    	try {
			msg = dis.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return msg;
    }
}