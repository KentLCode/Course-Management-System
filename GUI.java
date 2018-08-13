import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	/*
	 * This simple application creates a GUI
	 * With three GUI objects:
	 *  a. Three text fields
	 *  b. Two button actions
	 *  
	 *  This was authored by Bingnan (Kent) Li
	 *  Updates made by Mike Little
	 *  
	 *  This is part of our Course Management System team project
	 *  
	 */
	//declare class variables heres
	private JFrame frame;
	private JTextField txtFld_StudID;
	private JTextField txtFld_StudFNme;
	private JTextField txtFld_StudLstNme;

	//----------------------------------------------------------------------------------------
	/**
	 * Launch the application.
	 * This is the main method! 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//----------------------------------------------------------------------------------------
	
	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}
	
	//----------------------------------------------------------------------------------------
	/**
	 * Initialize the contents of the frame.
	 * This sets up the frame contents of the GUI.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    //////These are the field labels.
		
		//this is the label "Student Information"
		JLabel lblNewLabel = new JLabel("Student Information");
		lblNewLabel.setBounds(139, 23, 148, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//this is the label "Student  ID"
		JLabel lblNewLabel_1 = new JLabel("Student  ID");
		lblNewLabel_1.setBounds(27, 69, 99, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		//this is the label "Student First Name"
		JLabel lblNewLabel_2 = new JLabel("Student First Name");
		lblNewLabel_2.setBounds(27, 111, 139, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		//this is the label "Student Last Name"
		JLabel lblNewLabel_3 = new JLabel("Student Last Name");
		lblNewLabel_3.setBounds(27, 153, 139, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	    //////These are the text-fields for the entry of text
		
		//this is the text entry field for "Student  ID"
		txtFld_StudID = new JTextField();
		txtFld_StudID.setBounds(223, 64, 169, 26);
		frame.getContentPane().add(txtFld_StudID);
		txtFld_StudID.setColumns(10);
		
		//this is the text entry field for "Student  first Name"
		txtFld_StudFNme = new JTextField();
		txtFld_StudFNme.setBounds(223, 106, 169, 26);
		frame.getContentPane().add(txtFld_StudFNme);
		txtFld_StudFNme.setColumns(10);
		
		//this is the text entry field for "Student  Last Name"
		txtFld_StudLstNme = new JTextField();
		txtFld_StudLstNme.setBounds(223, 148, 169, 26);
		frame.getContentPane().add(txtFld_StudLstNme);
		txtFld_StudLstNme.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				//retrieve the student ID and display to the console
				String StudID = txtFld_StudID.getText();
				System.out.print("This is the StudentID: ");
				System.out.println(StudID );
				
				//retrieve the student ID and display to the console
				String StudFNme = txtFld_StudFNme.getText();
				System.out.print("This is the StudentID: ");
				System.out.println(StudFNme );				
				
				//retrieve the student ID and display to the console
				String StudLstNme = txtFld_StudLstNme.getText();
				System.out.print("This is the StudentID: ");
				System.out.println(StudLstNme );				
				
			}
		});
		btnAdd.setBounds(275, 204, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.print("this is the cancel Button");
				
			}
		});
		btnCancel.setBounds(27, 204, 117, 29);
		frame.getContentPane().add(btnCancel);
	}
	//----------------------------------------------------------------------------------------
} //close class GUI
