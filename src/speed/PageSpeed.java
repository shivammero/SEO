package src.speed;

import java.awt.EventQueue;
import java.io.*;
import java.util.ArrayList;
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
	ArrayList<String> css_files=new ArrayList<String>();
	ArrayList<String> js_files=new ArrayList<String>();
	ArrayList<String> html_files=new ArrayList<String>();
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
		//browse
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 browse.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				 int returnVal = browse.showOpenDialog(frame);
				 if(returnVal == JFileChooser.APPROVE_OPTION)
				 textField.setText(browse.getSelectedFile().getAbsolutePath());
				 else
					 textField.setText("No Folder Selected");
			 
			
			
			
			}
		});
		btnBrowse.setBounds(630, 76, 89, 23);
		frame.getContentPane().add(btnBrowse);
	// Html Button	
		JButton btnMinifyHtml = new JButton("Minify HTML");
		btnMinifyHtml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 minifyHtmlFunction(browse.getSelectedFile(),"html");
			}
		});
		btnMinifyHtml.setBounds(52, 164, 198, 23);
		frame.getContentPane().add(btnMinifyHtml);
   // Js Button
		JButton btnMinifyJs = new JButton("Minify JS");
		
		btnMinifyJs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				 minifyJsFunction(browse.getSelectedFile(),"js");
				 YuiAction yuiAction = new YuiAction(js_files);
					yuiAction.yui();
			}			
		});
		btnMinifyJs.setBounds(52, 282, 198, 23);
		frame.getContentPane().add(btnMinifyJs);
	// Css Button
		JButton btnMinifyCss = new JButton("Minify CSS");
		btnMinifyCss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				minifyCssFunction(browse.getSelectedFile(),"css");
				//System.out.println(css_files.get(2)); 
				 YuiAction yuiAction = new YuiAction(css_files);
				yuiAction.yui();
				 
			}
		});
		btnMinifyCss.setBounds(52, 224, 198, 23);
		frame.getContentPane().add(btnMinifyCss);
	}
	public void minifyHtmlFunction(File fileName, String extnsn){
		listFilesForFolder(  fileName , extnsn);	
		System.out.println(html_files);
	}
	public void minifyCssFunction(File fileName, String extnsn){
		listFilesForFolder(  fileName , extnsn);	
		System.out.println(css_files);
	}
	public void minifyJsFunction(File fileName, String extnsn){
		listFilesForFolder(  fileName , extnsn);	
		System.out.println(js_files);
	}
	public void listFilesForFolder(final File folder,String extnsn) {
		 
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry,extnsn);
	        } else {
	        	String tokens[]=fileEntry.getName().split("\\.(?=[^\\.]+$)");
	        	//System.out.println(tokens.length);

	        	
//	        	for(String s:tokens){
//	        		System.out.println(s);
//	        	}
	        	String ext=tokens[(tokens.length-1)];
	        	//System.out.println(extnsn.equals(ext));
	        	if(extnsn.equals(ext)){
	          //  System.out.println(fileEntry.getName());
	             if(ext.equals("js"))
	            	 js_files.add(fileEntry.toString());
	             else if(ext.equals("css"))
	            	 css_files.add(fileEntry.toString());
	             else if(ext.equals("html")||ext.equals("htm"))
	            	 html_files.add(fileEntry.toString());
	        	}
	        }
	    }
	}
}

