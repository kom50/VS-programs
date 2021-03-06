package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

class Server{
	ServerSocket serverSocket;
	DataInputStream dis;
	DataOutputStream dos;
	Socket socket;
	
	public Server() throws UnknownHostException, IOException{
		 serverSocket = new ServerSocket(6666);
		 socket = serverSocket.accept();
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