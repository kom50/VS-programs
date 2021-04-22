import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MainFile extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MainFile frame = new MainFile();
	}

	/**
	 * Create the frame.
	 */
	JTextArea textArea = new JTextArea();
	String initialText = new String();
	String nowText;

	Container contentPane;
	boolean isFileSave = false;

	public MainFile() {
		setTitle("TextEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				if (!isFileSave) {
					int i = JOptionPane.showConfirmDialog(MainFile.this, "Do you want to save this file?");
					if (i == JOptionPane.YES_OPTION) {
						System.out.println("Hello save");
					}
				}
			}
		});
		setBounds(100, 100, 800, 500);
		contentPane = this.getContentPane();
		// SplashScreen sc = new SplashScreen(this, "Hello Bro");
		setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.GRAY);
		menuBar.setBackground(new Color(248, 248, 255));
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setForeground(Color.GRAY);
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textArea.getText().equals("") && !isFileSaved) {
					int m = JOptionPane.showConfirmDialog(MainFile.this, "Do you want to save this file.?", "New File",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (m == JOptionPane.YES_OPTION) {
						isFileSaved = true;
						saveDialogBox();
					} else if (m == JOptionPane.NO_OPTION) {
						isFileSaved = false;
						textArea.setText("");
					}
				}
			}
		});
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnFile.add(mntmNew);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveDialogBox();
			}
		});
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);

		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveDialogBox();
			}
		});
		mnFile.add(mntmSaveAs);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmNewMenuItem = new JMenuItem("Page Setpup...");
		mnFile.add(mntmNewMenuItem);

		JMenuItem mntmPrint = new JMenuItem("Print...");
		mntmPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnFile.add(mntmPrint);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setForeground(Color.GRAY);
		menuBar.add(mnEdit);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Undo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			boolean b = false;

			public void actionPerformed(ActionEvent e) {

				System.out.println(b + "  " + nowText + "  " + initialText);
				if (b == false) {
					textArea.setText(initialText);
					b = true;
				} else {
					textArea.setText(nowText);
					b = false;
				}
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmNewMenuItem_1);

		JSeparator separator_2 = new JSeparator();
		mnEdit.add(separator_2);

		JMenuItem mntmCut = new JMenuItem("Cut");
		mntmCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initialText = textArea.getText();
				textArea.cut();
				nowText = textArea.getText();
			}
		});
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCut);

		JMenuItem mntmCopy = new JMenuItem("Copy");
		mntmCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.copy();
			}
		});
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopy);

		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.paste();
			}
		});
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);

		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuffer sb = new StringBuffer(textArea.getText());
				String sText = textArea.getSelectedText();
				sb.delete(sb.indexOf(sText), sb.indexOf(sText) + sText.length());
				textArea.setText(sb + "");
			}
		});
		mntmDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnEdit.add(mntmDelete);

		JSeparator separator_3 = new JSeparator();
		mnEdit.add(separator_3);

		JMenuItem mntmFind = new JMenuItem("Find");
		mntmFind.setEnabled(false);

		mntmFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog d1 = new JDialog(MainFile.this, "Find");
				d1.setVisible(true);
				System.out.println("X " + MainFile.this.getBounds().x);
				d1.setBounds(MainFile.this.getBounds().x + 60,
						MainFile.this.getBounds().y + MainFile.this.getSize().height / 2, 370, 140);
				JLabel f = new JLabel("Find what: ");
				JTextField tf = new JTextField(15);
				JButton findBtn = new JButton("Find sext");
				JButton cancelBtn = new JButton("Cancel");
				findBtn.setBackground(Color.white);
				cancelBtn.setBackground(Color.white);

				JCheckBox c1 = new JCheckBox("Match Case");

				JRadioButton r1 = new JRadioButton("Up");
				JRadioButton r2 = new JRadioButton("Down");
				ButtonGroup bg = new ButtonGroup();
				bg.add(r1);
				bg.add(r2);
				JPanel direction = new JPanel();
				direction.setBorder(BorderFactory.createTitledBorder("Direction"));
				direction.add(r1);
				direction.add(r2);

				d1.getContentPane().setLayout(new GridBagLayout());
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.insets = new Insets(5, 5, 5, 5);
				gbc.fill = GridBagConstraints.HORIZONTAL;
				gbc.gridx = 0;
				gbc.gridy = 0;
				d1.getContentPane().add(f, gbc);
				gbc.gridx = 1;
				gbc.gridy = 0;
				d1.getContentPane().add(tf, gbc);
				gbc.gridx = 2;
				gbc.gridy = 0;
				d1.getContentPane().add(findBtn, gbc);

				gbc.gridx = 0;
				gbc.gridy = 1;
				d1.getContentPane().add(c1, gbc);

				gbc.gridx = 1;
				gbc.gridy = 1;
				d1.getContentPane().add(direction, gbc);

				// Add Cancel Button
				gbc.gridx = 2;
				gbc.gridy = 1;
				d1.getContentPane().add(cancelBtn, gbc);

				cancelBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						d1.dispose();
					}
				});

				d1.validate();
				d1.pack();

			}
		});
		mntmFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnEdit.add(mntmFind);

		JMenuItem mntmFindNext = new JMenuItem("Find Next");
		mntmFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnEdit.add(mntmFindNext);

		JMenuItem mntmReplace = new JMenuItem("Replace...");
		mntmReplace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog d1 = new JDialog(MainFile.this, "Replace");
				d1.setVisible(true);
				System.out.println("X " + MainFile.this.getBounds().x);
				d1.setBounds(MainFile.this.getBounds().x + 60,
						MainFile.this.getBounds().y + MainFile.this.getSize().height / 2, 370, 140);
				JLabel f = new JLabel("Find what: ");
				JTextField tf = new JTextField(15);

				JLabel rLabel = new JLabel("Replace with: ");
				JTextField rField = new JTextField(15);

				JButton findBtn = new JButton("Find Next");
				JButton replaceBtn = new JButton("Replace");
				JButton replaceAllBtn = new JButton("Replace All");
				JButton cancelBtn = new JButton("Cancel");
				findBtn.setBackground(Color.white);
				replaceBtn.setBackground(Color.white);
				replaceAllBtn.setBackground(Color.white);
				cancelBtn.setBackground(Color.white);

				JCheckBox c1 = new JCheckBox("Match Case");

				d1.getContentPane().setLayout(new GridBagLayout());
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.insets = new Insets(2, 2, 2, 2);
				gbc.fill = GridBagConstraints.HORIZONTAL;
				gbc.gridx = 0;
				gbc.gridy = 0;
				d1.getContentPane().add(f, gbc);
				gbc.gridx = 1;
				gbc.gridy = 0;
				d1.getContentPane().add(tf, gbc);
				gbc.gridx = 2;
				gbc.gridy = 0;
				d1.getContentPane().add(findBtn, gbc);
				//
				gbc.gridx = 0;
				gbc.gridy = 1;
				d1.getContentPane().add(rLabel, gbc);
				gbc.gridx = 1;
				gbc.gridy = 1;
				d1.getContentPane().add(rField, gbc);
				gbc.gridx = 2;
				gbc.gridy = 1;
				d1.getContentPane().add(replaceBtn, gbc);

				gbc.gridx = 2;
				gbc.gridy = 2;
				d1.getContentPane().add(replaceAllBtn, gbc);

				gbc.gridx = 2;
				gbc.gridy = 3;
				d1.getContentPane().add(cancelBtn, gbc);

				gbc.gridx = 0;
				gbc.gridy = 3;
				d1.getContentPane().add(c1, gbc);

				cancelBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						d1.dispose();
					}
				});

				d1.validate();
				d1.pack();

			}
		});
		mntmReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnEdit.add(mntmReplace);

		JMenuItem mntmGoTo = new JMenuItem("Go To...");
		mntmGoTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  new GotoDialog().setVisible(true);
			}
		});
		mntmGoTo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnEdit.add(mntmGoTo);

		JSeparator separator_4 = new JSeparator();
		mnEdit.add(separator_4);

		JMenuItem mntmSelectAll = new JMenuItem("Select All");
		mntmSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.selectAll();
			}
		});
		mntmSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnEdit.add(mntmSelectAll);
		final LocalDateTime t1 = LocalDateTime.now();
		JMenuItem mntmTimeDate = new JMenuItem("Time/ Date");
		mntmTimeDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = textArea.getSelectedText();
				StringBuffer sb = new StringBuffer(textArea.getText());
				if (t != null) {
					sb.delete(sb.indexOf(t), (sb.indexOf(t) + t.length()));
				}
				textArea.setText(sb + " " + t1.toString().substring(11, 16) + " " + t1.toString().substring(0, 10));
			}
		});
		Calendar now = Calendar.getInstance();
		System.out.println(t1.toString().substring(11, 16) + "  " + t1.toString().substring(0, 10));

		// t1 = LocalDateTime.now();
		System.out.println(t1);

		mntmTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnEdit.add(mntmTimeDate);

		JMenu mnFormat = new JMenu("Format");
		mnFormat.setForeground(Color.GRAY);
		menuBar.add(mnFormat);

		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Word Wrap");
		mnFormat.add(chckbxmntmNewCheckItem);

		JMenuItem mntmFont = new JMenuItem("Font...");
		mntmFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FontDialog dialog = new FontDialog();
				dialog.setVisible(true);
			}
				
		});
		mnFormat.add(mntmFont);

		JMenu mnView = new JMenu("View");
		mnView.setForeground(Color.GRAY);
		menuBar.add(mnView);

		JCheckBoxMenuItem chckbxmntmStatusBar = new JCheckBoxMenuItem("Status Bar");
		mnView.add(chckbxmntmStatusBar);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.GRAY);
		menuBar.add(mnHelp);

		JMenuItem mntmAboutDeveloper = new JMenuItem("About Developer");
		mntmAboutDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog d1 = new JDialog(MainFile.this, "About Developer");
				d1.setVisible(true);
				System.out.println("X " + MainFile.this.getBounds().x);
				d1.setBounds(MainFile.this.getBounds().x + 60,
						MainFile.this.getBounds().y + MainFile.this.getSize().height / 2, 400, 240);
				JLabel msg = new JLabel("Hello Bro ", JLabel.CENTER);
				// msg.setAlignmentX(CENTER_ALIGNMENT);

				JButton cancelBtn = new JButton("Ok");
				// cancelBtn.setPreferredSize(new Dimension(40, 20));
				cancelBtn.setBackground(Color.white);
				/*
				 * d1.getContentPane().setLayout(new GridBagLayout()); GridBagConstraints gbc =
				 * new GridBagConstraints(); gbc.insets = new Insets(2, 2, 2, 2); gbc.fill =
				 * GridBagConstraints.HORIZONTAL;
				 * 
				 * gbc.gridx = 0; gbc.gridy = 2; d1.getContentPane().add(msg, gbc);
				 * 
				 * gbc.gridx = 0; gbc.gridy = 5; d1.getContentPane().add(cancelBtn, gbc);
				 */

				d1.getContentPane().add(cancelBtn, BorderLayout.SOUTH);
				d1.getContentPane().add(msg, BorderLayout.CENTER);
				cancelBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						d1.dispose();
					}
				});

				d1.validate();
				// d1.pack();

			}
		});
		mnHelp.add(mntmAboutDeveloper);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 15));
		getContentPane().add(panel, BorderLayout.SOUTH);

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		textArea.setFont(new Font("Arial", Font.PLAIN, 13));
		textArea.setSelectedTextColor(Color.white);
		textArea.setSelectionColor(new Color(30, 144, 255));
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (textArea.getText() == null) {
					mntmFind.setEnabled(false);
				} else
					mntmFind.setEnabled(true);
				isFileSaved = false;
				System.out.println(e.getKeyCode());
				/*
				 * if(e.getKeyCode() == 17 && e.getKeyCode() == 65) { textArea.selectAll(); }
				 * if(e.getKeyCode() == 17 && e.getKeyCode() == 68) { textArea.paste(); }
				 * if(e.getKeyCode() == 17 && e.getKeyCode() == 86) { textArea.copy(); }
				 */
				/*
				 * if(e.getKeyCode() == 17 && e.getKeyCode() == 78) { // new
				 * MainFile().openFile(); } if(e.getKeyCode() == 17 && e.getKeyCode() == 79) {
				 * new MainFile().openFile(); }
				 */
			}
		});
		textArea.setFocusable(true);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);

		validate();
	}

	String filePath;
	boolean isFileSaved = false;

	void openFile() {
		JFileChooser fc = new JFileChooser();

		fc.setBackground(Color.WHITE);
		int i = fc.showOpenDialog(MainFile.this);
		if (i == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			filePath = f.getPath();
			isFileSaved = true;
			try {
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String s1 = "";
				String s2 = new String();
				while ((s1 = br.readLine()) != null)
					s2 += s1 + "\n";
				textArea.setText(s2);
				br.close();
			} catch (Exception er) {
				er.printStackTrace();
			}
		}
		setTitle("Text Editor - " + filePath.substring(filePath.lastIndexOf('\\') + 1));
		System.out.println("Open file  " + filePath);
	}

	void saveDialogBox() {
		JFileChooser fc = new JFileChooser();

		int i = fc.showSaveDialog(MainFile.this);
		fc.setBackground(Color.WHITE);
		if (i == JFileChooser.APPROVE_OPTION) {
			isFileSaved = true;
			File f = fc.getSelectedFile();
			filePath = f.getPath();
			System.out.println(filePath + "   ");
			filePath += ".txt";
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
				// String s1 = "";
				String s2 = "";
				s2 = textArea.getText();
				bw.write(s2);
				bw.close();
			} catch (Exception er) {
				er.printStackTrace();
			}
		}
	}

}
