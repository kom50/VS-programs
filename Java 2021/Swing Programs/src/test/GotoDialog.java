package test;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GotoDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GotoDialog dialog = new GotoDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GotoDialog() {
		setAlwaysOnTop(true);
		setTitle("Go To Line");
		setBounds(100, 100, 273, 149);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Line number:");
			lblNewLabel.setBounds(10, 0, 124, 14);
			panel.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setText("1");
			textField.setBounds(10, 19, 227, 20);
			panel.add(textField);
			textField.setColumns(10);
			{
				JButton gotoButton = new JButton("Go To");
				gotoButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						GotoDialog.this.dispose();
					}
				});
				gotoButton.setBackground(Color.WHITE);
				gotoButton.setBounds(70, 66, 84, 23);
				panel.add(gotoButton);
				gotoButton.setActionCommand("OK");
				getRootPane().setDefaultButton(gotoButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GotoDialog.this.dispose();
					}
				});
				cancelButton.setBackground(Color.WHITE);
				cancelButton.setBounds(163, 66, 73, 23);
				panel.add(cancelButton);
				cancelButton.setActionCommand("Cancel");
			}
		}
	}
}
