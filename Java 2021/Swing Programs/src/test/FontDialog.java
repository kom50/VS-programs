package test;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
@SuppressWarnings("serial")
public class FontDialog extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	String font = null;
	int fsize = 14, style = 1;
	Font f1;
//	public static void main(String[] args) {
//		try {
//			FontDialog dialog = new	FontDialog(null); 
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true); 
//			}
//	    catch (Exception e) { 
//	    	e.printStackTrace();
//	    } 
//	 }
	
	 
	public FontDialog(JTextArea text) {
		setAutoRequestFocus(false);
		setType(Type.UTILITY);
		setTitle("Font\r\n\t");
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 480);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						text
						text.setFont(f1);
						FontDialog.this.dispose();
					}
				});
				
				okButton.setBackground(Color.WHITE);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						FontDialog.this.dispose();
					}
				});
				
				cancelButton.setBackground(Color.WHITE);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblFont = new JLabel("Font:");
			lblFont.setBounds(10, 11, 104, 19);
			panel.add(lblFont);
			
			JLabel lblNewLabel = new JLabel("Font Style:");
			lblNewLabel.setBounds(187, 13, 104, 14);
			panel.add(lblNewLabel);
			{
				JLabel lblSize = new JLabel("Size:");
				lblSize.setBounds(349, 13, 46, 14);
				panel.add(lblSize);
			}
			
			textField = new JTextField("Adobe Caslon Pro");
			textField.setBounds(10, 30, 165, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField("Regular");
			textField_1.setBounds(186, 30, 146, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField("14");
			textField_2.setBounds(346, 30, 75, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			
			
			JList<String> fonts = new JList<String>();
			
			fonts.setBounds(171, 49, -161, 112);
			
			fonts.setListData(new String[] {"Adobe Caslon Pro", "Consolas", "Adobe Garamond Pro",
					"Agency FB", "Algerian", "Arial", "Arial Rounded MT", "Arial Unicode MS", "Arno Pro",
					"Arno Pro Caption", "Arno Pro Display", "Arno Pro SmText", "Arno Pro Subhead", "Baskerville Old Face",
					"Bauhaus 93", "Bell Gothic Std", "Bell MT", "Berlin Sans FB", "Bernard MT", "Bickham Script Pro",
					"Birch Std", "Blackadder ITC", "Blackoak Std"});
			JScrollPane scrollPane = new JScrollPane(fonts);
			scrollPane.setBounds(10, 51, 165, 112);
			panel.add(scrollPane);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(186, 51, 146, 112);
			panel.add(scrollPane_1);
			
			JList<String> styles = new JList<>();
			styles.setListData(new String[] {"Regular", "Italic", "Bold", "Bold Italic"});
			scrollPane_1.setViewportView(styles);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(346, 51, 75, 112);
			panel.add(scrollPane_2);
			
			JList<String> size = new JList<>();
			size.setListData(new String[] {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"});
			scrollPane_2.setViewportView(size);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Sample", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(187, 174, 234, 83);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JLabel sampleTest = new JLabel("AaBbZzYy");
			sampleTest.setFont(new Font("Tahoma", Font.PLAIN, 12));
			sampleTest.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(sampleTest, BorderLayout.CENTER);
			
			JLabel lblNewLabel_2 = new JLabel("Scripts:");
			lblNewLabel_2.setBounds(187, 280, 46, 14);
			panel.add(lblNewLabel_2);
			
			JComboBox<String> comboBox = new JComboBox<>();
			
			comboBox.setModel(new DefaultComboBoxModel(scripts.values()));
			comboBox.setBounds(187, 296, 234, 22);
			panel.add(comboBox);
			
			
			
			fonts.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					font = fonts.getSelectedValue();
					System.out.println("Hello item select "+font);
					textField.setText(font);
					f1 = new Font(font, style, fsize);
					sampleTest.setFont(f1);					
				}
			});
			styles.addListSelectionListener(new ListSelectionListener() {
				int style = 1;
				public void valueChanged(ListSelectionEvent e) {
					switch(styles.getSelectedValue()) {
						case "Regular":
							  style = 0;
							  break;
						case "Bold":
								style = 1;
								break;
						case "Italic":
								style = 2;
								break;
						case "Bold Italic":
							    style = 3;
							    break;
					}
					System.out.println("Selected Item is "+styles.getSelectedValue());
					textField_1.setText(styles.getSelectedValue());		
					if(style == 3)
						f1 = new Font(font, Font.BOLD | Font.ITALIC, fsize);						
					else
						f1 = new Font(font, style, fsize);
					sampleTest.setFont(f1);
				}
			});
			size.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					fsize =Integer.parseInt(size.getSelectedValue());
					System.out.println("Hello item select "+size.getSelectedValue());
					textField_2.setText(size.getSelectedValue());	
					f1 = new Font(font, style, fsize);
					sampleTest.setFont(f1);
				}
			});
			
		}
	}
	enum scripts {
		Western, Greek, Turkish,Baltic, Central_European ,Cyrillic, Vietnamese
	}
}
