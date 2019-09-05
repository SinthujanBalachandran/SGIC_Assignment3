package Q3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Distance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance window = new Distance();
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
	public Distance() {
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
		
		JLabel lblDistanceBetweenCity = new JLabel("DISTANCE BETWEEN CITY");
		lblDistanceBetweenCity.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDistanceBetweenCity.setBounds(84, 31, 284, 26);
		frame.getContentPane().add(lblDistanceBetweenCity);
		
		JButton btnEnterDistance = new JButton("Enter Distance");
		btnEnterDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterDistance frameEnter = new EnterDistance();
				frameEnter.frame.setVisible(true);
			}
		});
		btnEnterDistance.setBounds(28, 117, 158, 23);
		frame.getContentPane().add(btnEnterDistance);
		
		JButton btnNewButton = new JButton("Find Distance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindDistance fd = new FindDistance();
				fd.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(224, 117, 158, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
