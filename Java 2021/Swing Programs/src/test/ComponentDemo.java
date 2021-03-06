package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;

public class ComponentDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentDemo frame = new ComponentDemo();
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
	public ComponentDemo() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Java", "JavaFX", "JavaScript", "HTML", "CSS", "jQuery"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(168, 65, 168, 30);
		contentPane.add(comboBox);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(tglbtnNewToggleButton.getText());
				if(tglbtnNewToggleButton.isSelected()) {
					System.out.println("Off");
					tglbtnNewToggleButton.setText("Off");
					
				}
				else {
					System.out.println("On");
					tglbtnNewToggleButton.setText("ON");
					
				}
			}
		});
		tglbtnNewToggleButton.setBounds(173, 117, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(411, 22, 276, 186);
		contentPane.add(textPane);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(30, 187, 177, 146);
		contentPane.add(editorPane);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.setBounds(160, 24, 160, 30);
		contentPane.add(spinner);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(451, 259, 186, 68);
		contentPane.add(scrollPane);
		
		JList<Object> list = new JList<>();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel<Object>() {
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Java", "JavaFX", "JavaScript", "HTML", "CSS", "jQuery"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.List<Object> l = list.getSelectedValuesList();
				System.out.println(l);
			}
		});
		btnNewButton.setBounds(496, 355, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(236, 279, 186, 68);
		contentPane.add(scrollPane_1);
		
		JList<Object> list_1 = new JList<Object>();
		list_1.setBounds(217, 190, 184, 66);
		contentPane.add(list_1);
		list_1.setDragEnabled(true);
		list_1.setDoubleBuffered(true);
		list_1.setModel(new AbstractListModel<Object>() {
			private static final long serialVersionUID = 1L;
			JLabel[] values = new JLabel[] {new JLabel("Java"), new JLabel("JavaFX"),new JLabel("JavaScript")};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setBounds(30, 395, 200, 26);
		contentPane.add(slider);
	}
}
