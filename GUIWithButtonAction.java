import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIWithButtonAction {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWithButtonAction window = new GUIWithButtonAction();
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
	public GUIWithButtonAction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//final String inputvalue=" ";
		
		JButton btnHello = new JButton("Display");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
		      System.out.println( "This Mouse press Action works" );
			}
		});
		btnHello.setBounds(276, 219, 117, 29);
		frame.getContentPane().add(btnHello);
		
		JLabel lblEnterTextTo = new JLabel("Enter Text to Display:");
		lblEnterTextTo.setBounds(38, 163, 141, 16);
		frame.getContentPane().add(lblEnterTextTo);
		
		JTextField txtTest = new JTextField();
		txtTest.setBounds(179, 158, 214, 29);
		frame.getContentPane().add(txtTest);
		//inputvalue= txtTest.getText();
		
		txtTest.setColumns(10);
	}
}
