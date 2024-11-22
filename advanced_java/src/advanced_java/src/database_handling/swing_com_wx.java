package database_handling;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class swing_com_wx {
	public static void main(String[] args) {
final JFrame jframe = new JFrame(); 
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10,2,10,10));
		
		jframe.setSize(500,500);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		
		final JLabel name = new JLabel("name :");
		final JLabel age = new JLabel("age :");
		final JLabel gender = new JLabel("gender");
		final JLabel password = new JLabel("password :");
		final JLabel interests = new JLabel("interests :");
		final JLabel not = new JLabel("");
		
		final JTextField namefield = new JTextField();
		final JTextField agefield = new JTextField();
		final JPasswordField passwordfield = new JPasswordField();
		
		
		final JCheckBox cb1 =new JCheckBox(" free fire ");
		final JCheckBox cb2 = new JCheckBox(" programming ");
		final JCheckBox cb3 = new JCheckBox(" football ");
		
		ButtonGroup buttons = new ButtonGroup();
		final JRadioButton male = new JRadioButton("male");
		final JRadioButton female = new JRadioButton("female");
		
		buttons.add(male);
		buttons.add(female);
		
		jframe.add(panel);
		
		panel.add(name);
		panel.add(namefield);
		panel.add(age);
		panel.add(agefield);
		panel.add(gender);
		panel.add(not);
		panel.add(male);
		panel.add(female);
		panel.add(password);
		panel.add(passwordfield);
		panel.add(interests);
		panel.add(cb3);
		panel.add(cb2);
		panel.add(cb1);
		
		
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			String name = namefield.getText();
			int age = Integer.parseInt(agefield.getText());
			char[] password = passwordfield.getPassword();
			String gender = male.isSelected()?"male":"female"; //<-- ternary condition operator
			String interests = "";
			if(cb1.isSelected()) {
				interests += cb1.getText();
			}
			if(cb2.isSelected()) {
				interests += cb2.getText();
			}
			if(cb3.isSelected()) {
				interests += cb3.getText();
			}
			
			
			String message = "hi mawa , nee peru "+name+" kada ne age "+age+" nuv "+gender+" vi ,nee interests "+interests;
		    JOptionPane.showMessageDialog(jframe,message,"successful",JOptionPane.INFORMATION_MESSAGE);
			
			}
		});
		
		panel.add(submit);
		jframe.setVisible(true);
	}


}
