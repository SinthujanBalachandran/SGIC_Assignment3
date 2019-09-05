package Q3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FindDistance {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindDistance window = new FindDistance();
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
	public FindDistance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("DISTANCE BETWEEN CITY");
		label.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label.setBounds(79, 11, 250, 33);
		frame.getContentPane().add(label);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(43, 76, 48, 14);
		frame.getContentPane().add(lblFrom);

		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(209, 76, 48, 14);
		frame.getContentPane().add(lblTo);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(43, 105, 140, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Jaffna");
		comboBox.addItem("Kilinochi");
		comboBox.addItem("Vavunia");
		comboBox.addItem("Colombo");

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(209, 105, 140, 22);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Jaffna");
		comboBox_1.addItem("Kilinochi");
		comboBox_1.addItem("Vavunia");
		comboBox_1.addItem("Colombo");

		JLabel output = new JLabel("");
		output.setBounds(114, 171, 311, 14);
		frame.getContentPane().add(output);

		JButton btnNewButton = new JButton("GET DISTANCE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String from = (String) comboBox.getSelectedItem();
				String to = (String) comboBox_1.getSelectedItem();
				String Jaffna = null, Kilinochi = null, Vavuniya = null, Colombo = null;
				
				
				
//				if (from.equals(Jaffna) && to.equals(Jaffna)) {
//					String result= distances[0][1];
//
//				}

			}
		});
		btnNewButton.setBounds(370, 105, 123, 23);
		frame.getContentPane().add(btnNewButton);

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
}
