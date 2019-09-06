package Q4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class TaskSchedular extends JFrame {

	private JPanel contentPane;
	private JTextField taskInput;
	private JTextField timeInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskSchedular frame = new TaskSchedular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TaskSchedular() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskSchedul = new JLabel("TASK SCHEDULAR");
		lblTaskSchedul.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTaskSchedul.setBounds(108, 11, 216, 28);
		contentPane.add(lblTaskSchedul);
		
		JLabel lblTask = new JLabel("Task");
		lblTask.setBounds(46, 67, 48, 14);
		contentPane.add(lblTask);
		
		JLabel lblNewLabel = new JLabel("Elapsed Time");
		lblNewLabel.setBounds(171, 67, 97, 14);
		contentPane.add(lblNewLabel);
		
		taskInput = new JTextField();
		taskInput.setBounds(10, 92, 119, 20);
		contentPane.add(taskInput);
		taskInput.setColumns(10);
		
		timeInput = new JTextField();
		timeInput.setColumns(10);
		timeInput.setBounds(158, 92, 119, 20);
		contentPane.add(timeInput);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 171, 414, 28);
		contentPane.add(panel);
		
		JLabel lblTaskout = new JLabel("taskout");
		panel.add(lblTaskout);
		
		JLabel lblTimeout = new JLabel("timeout");
		panel.add(lblTimeout);
		
		JButton btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
		JCheckBox chckbxComplete = new JCheckBox("Complete");
		panel.add(chckbxComplete);
		
		panel.add(lblTaskout);
		panel.add(lblTimeout);
		panel.add(btnDelete);
		panel.add(chckbxComplete);
		contentPane.add(panel);
		panel.setVisible(false);
		
		
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
				
				String task = taskInput.getText();
				String time = timeInput.getText();
				
				ArrayList<String> alTask = new ArrayList<String>();
				alTask.add(task);
				lblTaskout.setText(alTask.get(0));
				
				ArrayList<String> alElapsedTime = new ArrayList<String>();
				alElapsedTime.add(time);
				
			}
		});
		btnNewButton.setBounds(300, 91, 89, 23);
		contentPane.add(btnNewButton);
		
		chckbxComplete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					if(chckbxComplete.isSelected()) {
						
						panel.setBackground(Color.GREEN);
					}else {
						
					}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		
		
	}
	
	public void create_panal() {
		
	}
}
