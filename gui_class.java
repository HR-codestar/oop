package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui_class extends JFrame implements ActionListener {
	public static void main (String[] args) {
		gui_class frame = new gui_class();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	JButton addn,subtract,divide,multiply;
	JTextField a,b;
	JTextArea result;
	public gui_class()
	{
		setLayout(new FlowLayout());
	JButton addn = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton divide = new JButton("divide");
	JButton multiply = new JButton("multiply");
	JTextField a = new JTextField();	
	JTextField b = new JTextField();
	JTextArea result = new JTextArea();
	
	addn.setBounds(10,10,250,450);
	subtract.setBounds(10,10,250,430);
	divide.setBounds(10,10,250,410);
	multiply.setBounds(10,10,250,370);
	
	
	a.setBounds(30,30,100,250);
	b.setBounds(30,30,100,270);
	result.setBounds(10,10,300,250);
	
	add(addn);
	add(subtract);
	add(divide);
	add(multiply);
	add(a);
	add(b);
	add(result);
	
	addn.addActionListener(this);
	subtract.addActionListener(this);
	divide.addActionListener(this);
	multiply.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(addn.isEnabled()) {
			double num1 = Double.parseDouble(a.getText());
            double num2 = Double.parseDouble(b.getText());
            double sum = num1 + num2;
            result.setText("Result: " + sum);
		}
		else if(divide.isEnabled()) {
			double num1 = Double.parseDouble(a.getText());
            double num2 = Double.parseDouble(b.getText());
            double sum = num1 / num2;
            result.setText("Result: " + sum);
		}
		else if(subtract.isEnabled()) {
			double num1 = Double.parseDouble(a.getText());
            double num2 = Double.parseDouble(b.getText());
            double sum = num1 - num2;
            result.setText("Result: " + sum);
		}
		else if(multiply.isEnabled()) {
			double num1 = Double.parseDouble(a.getText());
            double num2 = Double.parseDouble(b.getText());
            double sum = num1 * num2;
            result.setText("Result: " + sum);
		}
			
		
		
	}
}
