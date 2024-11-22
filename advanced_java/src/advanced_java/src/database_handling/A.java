package database_handling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class A {
		public static void main(String[] args) {
			JFrame jframe = new JFrame(); 
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(10,2,10,10));
			
			jframe.setSize(500,500);
			jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
			jframe.setLocationRelativeTo(null);
			JLabel name = new JLabel("name :");
			JLabel age = new JLabel("age :");
			JLabel password = new JLabel("password :");
			JLabel interests = new JLabel("interests :");
			
			final JTextField namefield = new JTextField();
			final JTextField agefield = new JTextField();
			//JTextFieldfield = new JTextField();
			final JPasswordField passwordfield = new JPasswordField();
			JTextField interestfield = new JTextField();
			
			
			JLabel gender = new JLabel("gender :");
		    CheckboxGroup Interests = new CheckboxGroup();
		    Checkbox c1 = new Checkbox("male",Interests,false);
		    Checkbox c2 = new Checkbox("Female",Interests,false);
			ButtonGroup buttons = new ButtonGroup();				// <-- incomplete
			JRadioButton bu1 = new JRadioButton("Male");
			JRadioButton bu2 = new JRadioButton("Female");
			buttons.add(bu1);
			buttons.add(bu2);
			
		    JLabel gender1 = new JLabel("");
		    
		    JButton b1 = new JButton("Submit");
		    b1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				
					String name = namefield.getText();
					int age = Integer.parseInt(agefield.getText());
					char[] password = passwordfield.getPassword();
					String gender = bu1.isSelected()?"male":"Female";
				}
		    	
		    	
		    });
		    
		    
		    panel.add(name);
			panel.add(namefield);
			panel.add(age);
			panel.add(agefield);
			panel.add(password);
			panel.add(passwordfield);
			panel.add(gender);
			panel.add(bu1);
			panel.add(bu2);
			panel.add(interests);
			//panel.add(Interests);
			
			
			
			
			
			
			jframe.add(panel);
			
			jframe.setVisible(true);
			
		}

	}

