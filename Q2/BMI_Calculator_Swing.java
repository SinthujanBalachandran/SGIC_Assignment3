package Q2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BMI_Calculator_Swing extends JFrame {
	JLabel lHeadding;
	JLabel lHeight, lWeight, lResult;
	JTextField tfHeight, tfWeight;
	JButton bCalculate;

	public BMI_Calculator_Swing() {
		JFrame main = new JFrame("BMI Calculator");
		lHeadding = new JLabel("BMI CALCULATOR");
		lHeadding.setBounds(200, 50, 200, 20);

		lHeight = new JLabel("Height (m) :");
		lHeight.setBounds(50, 100, 100, 20);
		tfHeight = new JTextField();
		tfHeight.setBounds(150, 100, 200, 20);

		lWeight = new JLabel("Weight (kg) :");
		lWeight.setBounds(50, 150, 100, 20);
		tfWeight = new JTextField();
		tfWeight.setBounds(150, 150, 200, 20);

		bCalculate = new JButton("Calculate");
		bCalculate.setBounds(250, 200, 100, 20);

		lResult = new JLabel("Your Result");
		lResult.setBounds(100, 250, 200, 20);

		add(lHeadding);
		add(lHeight);
		add(lWeight);
		add(lResult);
		add(tfHeight);
		add(tfWeight);
		add(bCalculate);
		setSize(600, 400);
		setLayout(null);
		setVisible(true);

		bCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double height = Double.parseDouble(tfHeight.getText());
				double weight = Double.parseDouble(tfWeight.getText());
				double BMI;

				BMI = weight / height;

				String ResultString = String.valueOf(BMI);

				if (BMI < 16) {
					lResult.setText(ResultString + "You are thin");
				} else if (BMI >= 16 && BMI <= 23) {
					lResult.setText(ResultString + "You are normal");

				} else if (BMI > 23) {
					lResult.setText(ResultString + "   You are obese");

				}

			}

		});

	}

	public static void main(String args[]) {
		new BMI_Calculator_AWT();
	}
}
