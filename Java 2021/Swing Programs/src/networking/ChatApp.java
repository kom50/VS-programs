package networking;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import code.HintTextField;
import code.OnDrag;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ChatApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel mainPanel;
	private JPanel optionPanel;
	private JButton btnClientChat;
	private JButton btnServerChat;
    private String app;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatApp frame = new ChatApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JPanel chatPanel;
	
	
	public ChatApp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 381);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChatApplication = new JLabel("Chat Application");
		lblChatApplication.setFont(new Font("Century", Font.BOLD, 18));
		lblChatApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblChatApplication.setBounds(10, 11, 454, 28);
		contentPane.add(lblChatApplication);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(10, 38, 455, 332);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		optionPanel = new JPanel();
		optionPanel.setBounds(0, 0, 455, 332);
		optionPanel.setLayout(null);
		
		mainPanel.add(optionPanel);
	
		
		btnClientChat = new JButton("Client Chat");
		btnClientChat.setBackground(Color.WHITE);
		btnClientChat.setForeground(Color.BLACK);
		btnClientChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chatPanel.setVisible(true);
				optionPanel.setVisible(false);
				app = "client";
			}
		});
		btnClientChat.setBounds(151, 114, 137, 42);
		optionPanel.add(btnClientChat);
		
		btnServerChat = new JButton("Server Chat");
		btnServerChat.setBackground(Color.WHITE);
		btnServerChat.setForeground(Color.BLACK);
		btnServerChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chatPanel.setVisible(true);
				optionPanel.setVisible(false);
				app = "server";
				
			}
		});
		btnServerChat.setBounds(151, 177, 137, 42);
		optionPanel.add(btnServerChat);
		
		chatPanel = new JPanel();
		chatPanel.setBounds(0, 0, 454, 332);
		chatPanel.setLayout(null);
		chatPanel.setVisible(false);
		
		mainPanel.add(chatPanel);
		
		JPanel chatbox = new JPanel();
		chatbox.setBounds(0, 0, 454, 281);
		chatPanel.add(chatbox);
		chatbox.setFont(new Font("Consolas", Font.BOLD, 16));
		chatbox.setBackground(new Color(230, 230, 250));
		
		//
		new OnDrag(chatbox, this);
		chatbox.setLayout(null);

		HintTextField msgField = new HintTextField("Type a message");
		msgField.setBounds(0, 292, 367, 40);
		chatPanel.add(msgField);
		
		JButton button = new JButton("Send");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Server server = null;
				Client client = null;

				try {
					server = new Server();
					client = new Client();
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				if(app.equals("server")) {
					String m = server.readMessage();
					
					JLabel m1  = new JLabel(m);
					chatbox.add(m1);
					
//					System.out.println("clint Msg : "+m);
					//server.sendMessage(msgField.getText());
					
				}else {
					client.sendMessage(msgField.getText());
				//	String m = client.readMessage();
				//	JLabel m1  = new JLabel(m);
				//	chatbox.add(m1);

//					System.out.println("Server Msg : "+m);
				}
			}
		});
		button.setBounds(377, 292, 79, 40);
		chatPanel.add(button);
		button.setBackground(new Color(0, 102, 255));
	}
}


