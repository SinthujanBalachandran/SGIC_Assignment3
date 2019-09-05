package Q2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BMI_Calculator_AWT extends Frame {
	Label lHeadding;
	Label lHeight, lWeight, lResult;
	TextField tfHeight, tfWeight;
	Button bCalculate;

	public BMI_Calculator_AWT() {
		Frame main = new Frame("BMI Calculator");
		lHeadding = new Label("BMI CALCULATOR");
		lHeadding.setFont(new Font("Lucida",Font.PLAIN,24));
		lHeadding.setBounds(200, 50, 250, 20);

		lHeight = new Label("Height (m) :");
		lHeight.setBounds(50, 100, 100, 20);
		tfHeight = new TextField();
		tfHeight.setBounds(150, 100, 200, 20);

		lWeight = new Label("Weight (kg) :");
		lWeight.setBounds(50, 150, 100, 20);
		tfWeight = new TextField();
		tfWeight.setBounds(150, 150, 200, 20);

		bCalculate = new Button("Calculate");
		bCalculate.setBounds(250, 200, 100, 20);

		lResult = new Label("Your Result");
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
				

				BMI = weight / (height*height);

				String ResultString = String.valueOf(BMI);

				if (BMI < 16) {
					lResult.setText(ResultString + "  You are thin");
				} else if (BMI >= 16 && BMI <= 23) {
					lResult.setText(ResultString + "  You are normal");

				}else if(BMI>23) {
					lResult.setText(ResultString+"   You are obese");

				}
				
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

	}

	public static void main(String args[]) {
		new BMI_Calculator_AWT();
	}
}
