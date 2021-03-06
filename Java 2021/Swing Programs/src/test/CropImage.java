package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.LineBorder;

public class CropImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropImage frame = new CropImage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CropImage() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(119, 23, 300, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setForeground(Color.BLACK);
		
		ArrayList<Point> loc = new ArrayList<Point>();
		loc.add(new Point(0, 0));
		loc.add(new Point(100, 0));
		loc.add(new Point(200, 0));
		loc.add(new Point(0, 100));
		loc.add(new Point(100, 100));
		loc.add(new Point(200, 100));
		loc.add(new Point(0, 200));
		loc.add(new Point(100, 200));
		loc.add(new Point(200, 200));
		
		JLabel label[] = new JLabel[9];
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();			
				
				FileFilter filter = new FileFilter() {
					
					@Override
					public boolean accept(File pathname) {
						return pathname.getPath().endsWith(".png") || pathname.getPath().endsWith(".jpg") || pathname.getPath().endsWith(".bmp") ;
					}

					@Override
					public String getDescription() {
						return null;
					}
				}; 
				
				fileChooser.setFileFilter(filter);
				
				fileChooser.showOpenDialog(CropImage.this);
				File file = fileChooser.getSelectedFile();
								
				String path = file.getPath();
				
				BufferedImage img = null;
				try {
					img = ImageIO.read(file);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				BufferedImage bimg = resizeImage(img, 300, 300, BufferedImage.TYPE_INT_ARGB);
				
				BufferedImage mainImg = cropImage(bimg, 0, 0, 300, 300);
				BufferedImage cropImg;
				
				JLabel label1 = new JLabel(new ImageIcon(mainImg));
				label1.setBounds(0, 0, 300, 300);
				
				for (int i = 0; i < 9; i++) {
					cropImg = cropImage(mainImg, (int)loc.get(i).getX(), (int)loc.get(i).getY(), 100, 100);
					
					label[i] = new JLabel(new ImageIcon(cropImg));
					label[i].setLocation(loc.get(i));
					label[i].setSize(100, 100);
					label[i].setBorder(BorderFactory.createLineBorder(Color.black, 1, false));
					panel.add(label[i]);
				}
				
				
				System.out.println(path+""+file);
				
				panel.validate();
				panel.repaint();
			}
		});
		btnUpload.setBorderPainted(false);
		btnUpload.setBackground(Color.WHITE);
		btnUpload.setBounds(224, 358, 105, 32);
		contentPane.add(btnUpload);
		
		
	}
	
	
	
	private BufferedImage cropImage(BufferedImage bufferedImage, int x, int y, int w, int h) {
		return bufferedImage.getSubimage(x, y, w, h);
	}
	
	
	private BufferedImage resizeImage(BufferedImage bImg, int  w, int h, int type) {
		BufferedImage reImag = new BufferedImage(w, h, type);
		Graphics2D g2d = reImag.createGraphics();
		g2d.drawImage(bImg, 0, 0, w, h, null);
		g2d.dispose();
		return reImag;
	}
}
