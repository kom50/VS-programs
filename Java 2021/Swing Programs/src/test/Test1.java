package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
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
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				System.out.println(e.getDot());
				System.out.println(textField.getCaret().getMark());
			}
		});
		textField.setBounds(190, 11, 115, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 230, 133);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		/*
		 * textArea.addInputMethodListener(new InputMethodListener() { public void
		 * caretPositionChanged(InputMethodEvent event) {
		 * System.out.println(event.getCommittedCharacterCount());
		 * System.out.println(textArea.getCaret().getMark()); } public void
		 * inputMethodTextChanged(InputMethodEvent event) {
		 * System.out.println(event.getWhen());
		 * System.out.println(textArea.getCaret().getMark()); } });
		 */
		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				System.out.println("Caret "+e.getMark());
				System.out.println("Caret "+e.getDot());
				System.out.println(textArea.getCaret().getMark());
			}
		});
		scrollPane.setViewportView(textArea);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Pressed "+e.getKeyCode()+" "+KeyEvent.VK_ENTER);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Released "+e.getKeyCode());
				System.out.println("Editor Pane "+" "+editorPane.getCaret().getMagicCaretPosition());
				Point caretPoint = editorPane.getCaret().getMagicCaretPosition();
				if(caretPoint != null)
				   System.out.println(caretPoint.getX() / 3 +" "+(caretPoint.getY() / 16 - 2));
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Key Typed "+e.getID()+" "+e.getKeyCode());
			}
			
		});
		editorPane.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				System.out.println("Editor Pane "+e.getDot()+" "+editorPane.getCaret().getMagicCaretPosition());
				Point caretPoint = editorPane.getCaret().getMagicCaretPosition();
				if(caretPoint != null)
				   System.out.println(caretPoint.getX() / 3 +" "+(caretPoint.getY() / 16 - 2));
			}
		});
		editorPane.setBounds(262, 51, 193, 133);
		contentPane.add(editorPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(276, 210, 179, 110);
		contentPane.add(textPane);
	}
}
