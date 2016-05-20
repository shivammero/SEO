package src.speed;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageSpeed {

	private JFrame frame;
	private JTextField textField;
	final JFileChooser browse = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageSpeed window = new PageSpeed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PageSpeed() {
		
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
		} catch (ClassNotFoundException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
		} catch (ClassNotFoundException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			JFrame frame = new JFrame();
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, e1);
			e1.printStackTrace();
		}
	
		
		textField = new JTextField();
		textField.setBounds(96, 72, 460, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 browse.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			 int returnVal = browse.showOpenDialog(frame);
			 textField.setText(browse.getSelectedFile().getAbsolutePath());
			}
		});
		btnBrowse.setBounds(630, 76, 89, 23);
		frame.getContentPane().add(btnBrowse);
		
		JButton btnMinifyHtml = new JButton("Minify HTML");
		btnMinifyHtml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMinifyHtml.setBounds(52, 164, 198, 23);
		frame.getContentPane().add(btnMinifyHtml);
		
		JButton btnMinifyJs = new JButton("Minify JS");
		btnMinifyJs.setBounds(52, 282, 198, 23);
		frame.getContentPane().add(btnMinifyJs);
		
		JButton btnMinifyCss = new JButton("Minify CSS");
		btnMinifyCss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMinifyCss.setBounds(52, 224, 198, 23);
		frame.getContentPane().add(btnMinifyCss);
	}
}
