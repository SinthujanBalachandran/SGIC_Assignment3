package Q1_Part_B;

import java.awt.*;


import java.awt.event.*;

import javax.swing.*;




public class Q2_Swing extends Frame implements ActionListener {
	
		JTextField tf1,tf2,tf3;
		JButton b1; 
		JLabel l1,l2,l3,l4,l5;
		JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;

		public Q2_Swing() {
			Frame f= new Frame("CheckboxGroup Example");  
			l1=new JLabel("SIMPLE CALCULATOR");
			l1.setBounds(500,50,200,20);
			
			l2=new JLabel("First Number");
			l2.setBounds(50,100,100,20);
			tf1=new JTextField();  
	        tf1.setBounds(200,100,100,20);
	        
	        l3=new JLabel("Second Number");
			l3.setBounds(350,100,100,20);
	        tf2=new JTextField();  
	        tf2.setBounds(500,100,100,20);  
	        
	        
			b1 = new JButton("Answer");
			b1.setBounds(200,300,100,20);
			
			
			tf3=new JTextField();
			tf3.setBounds(400,400,200,20);
			
			 CheckboxGroup cbg = new CheckboxGroup();  
		        Checkbox checkBox1 = new Checkbox("Add", cbg, false);    
		        checkBox1.setBounds(50,200,50,20);    
		        Checkbox checkBox2 = new Checkbox("Subtract", cbg, false);    
		        checkBox2.setBounds(200,200,50,20);    
		        Checkbox checkBox3 = new Checkbox("Multiply", cbg, false);    
		        checkBox3.setBounds(350,200,50,20);  
		        Checkbox checkBox4 = new Checkbox("Divide", cbg, false);    
		        checkBox4.setBounds(500,200,50,20);  
	        
	        
	      
	        
	        
	        add(tf1);add(tf2);add(tf3);add(b1); add(l1);add(l2);add(l3);add(checkBox1);add(checkBox2);add(checkBox3);add(checkBox4);
	        
	        setSize(1000,500);
	        setLayout(null);
	        setVisible(true);
	        
	        
	        
	        addWindowListener(new WindowAdapter(){  
	            public void windowClosing(WindowEvent e) {  
	                dispose();  
	            }  
	        });  
	        
	        
	        
	       
	        
	        
	        
	        b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = 0;
			
			if(checkBox1.getState()==true) {
				c=a+b;
			} else if (checkBox2.getState()==true) {
				c=a-b;
			}else if(checkBox3.getState()==true) {
				c=a*b;
			}else if(checkBox4.getState()==true) {
				c=a/b;
			}
			String result = String.valueOf(c);
			tf3.setText(result);
			
			
			
			
		}
	        });
		}
		public static void main(String args[]) {
			new Q2_Swing();
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}