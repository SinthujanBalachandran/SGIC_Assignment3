package Q1_Part_A;


import javax.swing.*;



import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;


public class Q1_Swing implements ActionListener {
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4; 
	JLabel l1,l2,l3,l4,l5;
	
	public Q1_Swing() {
		JFrame f = new JFrame();
		l1=new JLabel("SIMPLE CALCULATOR");
		l1.setBounds(75,50,200,20);
		l2=new JLabel("First Number");
		l2.setBounds(50,100,100,20);
		
		
		tf1=new JTextField();  
        tf1.setBounds(200,100,100,20);
        
        l3=new JLabel("Second Number");
		l3.setBounds(350,100,100,20);
        tf2=new JTextField();  
        tf2.setBounds(500,100,100,20);  
        
        
		b1 = new JButton("ADD");
		b1.setBounds(50,200,100,20);
		b2 = new JButton("SUBTRACT");
		b2.setBounds(200,200,100,20);
		b3 = new JButton("MULTIPLY");
		b3.setBounds(350,200,100,20);
		b4 = new JButton("DIVIDE");
		b4.setBounds(500,200,100,20);
		
		tf3=new JTextField();
		tf3.setBounds(400,300,200,20);
        
       
        
        b1.addActionListener(this); 
        b2.addActionListener( this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2); f.add(l1);f.add(l2);f.add(l3);f.add(b3);f.add(b4);
        f.setSize(1000,400);
        f.setLayout(null);
        f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		int c=0;
		
		if(e.getSource()==b1) {
			c=a+b;
			
		}else if(e.getSource()==b2) {
			c=a-b;
		}else if(e.getSource()==b3) {
			c=a*b;
		}else if(e.getSource()==b4) {
			c=a/b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
		 
		
 
	}
	public static void main(String args[]) {
		new  Q1_Swing();
		
	}
	
	
     
	
}
