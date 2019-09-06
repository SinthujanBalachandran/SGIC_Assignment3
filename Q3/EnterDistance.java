package Q3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EnterDistance {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnterDistance window = new EnterDistance();
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
	public EnterDistance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISTANCE BETWEEN CITY");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(153, 8, 250, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblJaffna = new JLabel("Jaffna");
		lblJaffna.setBounds(10, 86, 48, 14);
		frame.getContentPane().add(lblJaffna);
		
		JLabel lblKilinochi = new JLabel("Kilinochi");
		lblKilinochi.setBounds(10, 111, 58, 14);
		frame.getContentPane().add(lblKilinochi);
		
		JLabel lblVavuniya = new JLabel("Vavuniya");
		lblVavuniya.setBounds(10, 136, 58, 14);
		frame.getContentPane().add(lblVavuniya);
		
		JLabel lblColombo = new JLabel("Colombo");
		lblColombo.setBounds(10, 161, 58, 14);
		frame.getContentPane().add(lblColombo);
		
		JLabel label = new JLabel("Jaffna");
		label.setBounds(117, 52, 48, 14);
		frame.getContentPane().add(label);
		
		JTextPane textPanej2j = new JTextPane();
		textPanej2j.setBounds(97, 80, 79, 20);
		frame.getContentPane().add(textPanej2j);
		
		JTextPane textPanek2j = new JTextPane();
		textPanek2j.setBounds(97, 105, 79, 20);
		frame.getContentPane().add(textPanek2j);
		
		JTextPane textPanev2j = new JTextPane();
		textPanev2j.setBounds(97, 130, 79, 20);
		frame.getContentPane().add(textPanev2j);
		
		JTextPane textPanec2j = new JTextPane();
		textPanec2j.setBounds(97, 155, 79, 20);
		frame.getContentPane().add(textPanec2j);
		
		JTextPane textPanej2k = new JTextPane();
		textPanej2k.setBounds(193, 80, 79, 20);
		frame.getContentPane().add(textPanej2k);
		
		JTextPane textPanek2k = new JTextPane();
		textPanek2k.setBounds(193, 105, 79, 20);
		frame.getContentPane().add(textPanek2k);
		
		JTextPane textPanev2k = new JTextPane();
		textPanev2k.setBounds(193, 130, 79, 20);
		frame.getContentPane().add(textPanev2k);
		
		JTextPane textPanec2k = new JTextPane();
		textPanec2k.setBounds(193, 155, 79, 20);
		frame.getContentPane().add(textPanec2k);
		
		JTextPane textPanej2v = new JTextPane();
		textPanej2v.setBounds(292, 80, 79, 20);
		frame.getContentPane().add(textPanej2v);
		
		JTextPane textPanek2v = new JTextPane();
		textPanek2v.setBounds(292, 105, 79, 20);
		frame.getContentPane().add(textPanek2v);
		
		JTextPane textPanev2v = new JTextPane();
		textPanev2v.setBounds(292, 130, 79, 20);
		frame.getContentPane().add(textPanev2v);
		
		JTextPane textPanec2v = new JTextPane();
		textPanec2v.setBounds(292, 155, 79, 20);
		frame.getContentPane().add(textPanec2v);
		
		JLabel label_1 = new JLabel("Kilinochi");
		label_1.setBounds(202, 52, 70, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Vavuniya");
		label_2.setBounds(305, 52, 66, 14);
		frame.getContentPane().add(label_2);
		
		JTextPane textPanej2c = new JTextPane();
		textPanej2c.setBounds(394, 80, 79, 20);
		frame.getContentPane().add(textPanej2c);
		
		JTextPane textPanek2c = new JTextPane();
		textPanek2c.setBounds(394, 105, 79, 20);
		frame.getContentPane().add(textPanek2c);
		
		JTextPane textPanev2c = new JTextPane();
		textPanev2c.setBounds(394, 130, 79, 20);
		frame.getContentPane().add(textPanev2c);
		
		JTextPane textPanec2c = new JTextPane();
		textPanec2c.setBounds(394, 155, 79, 20);
		frame.getContentPane().add(textPanec2c);
		
		JLabel label_3 = new JLabel("Colombo");
		label_3.setBounds(410, 52, 69, 14);
		frame.getContentPane().add(label_3);
		
		JButton btnEnterData = new JButton("Enter Data");
		btnEnterData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String j2j=textPanej2j.getText();
				String j2k=textPanej2k.getText();
				String j2v=textPanej2v.getText();
				String j2c=textPanej2c.getText();
				
				String k2j=textPanek2j.getText();
				String k2k=textPanek2k.getText();
				String k2v=textPanek2v.getText();
				String k2c=textPanek2c.getText();
				
				String v2j=textPanev2j.getText();
				String v2k=textPanev2k.getText();
				String v2v=textPanev2v.getText();
				String v2c=textPanev2c.getText();
				
				String c2j=textPanec2j.getText();
				String c2k=textPanec2k.getText();
				String c2v=textPanec2v.getText();
				String c2c=textPanec2c.getText();
				
				
				
				
			String distances [][] = {{j2j,j2k,j2v,j2c},{k2j,k2k,k2v,k2c},{v2j,v2k,v2v,v2c},{c2j,c2k,c2v,c2c}};
				
			}
		
		});
		btnEnterData.setBounds(384, 202, 89, 23);
		frame.getContentPane().add(btnEnterData);
	}
}
