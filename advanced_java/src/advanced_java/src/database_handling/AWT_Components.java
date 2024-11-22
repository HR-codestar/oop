/*
package database_handling;
import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AWT_Components{
	public static void main(String[] args) {
		final Frame frame = new Frame("vice city");
		frame.setSize(1000,1000);
		
		frame.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		
		
		Label label = new Label("vice city : loading....");
		label.setBounds(40,90,200,100);
		
		Button button = new Button("Start");
		button.setBounds(50,90,80,30);
		
		Button button1 = new Button("loadgame");
		button.setBounds(50,80,80,30);
		
		Button button2 = new Button("newgame");
		button.setBounds(50,100,80,30);
		
		frame.add(label);
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		
		frame.setVisible(true);
	}
}
*/

package database_handling;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Components {
    public static void main(String[] args) {
        final Frame frame = new Frame("vice city");
        frame.setSize(700, 700);
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

         // Using null layout to use setBounds

        Label label = new Label("vice city : loading....");
        label.setBounds(40, 30, 200, 100);

        Button button = new Button("Start game");
        button.setBounds(50, 250, 100, 30);

        Button button1 = new Button("Load game");
        button1.setBounds(50, 300, 100, 30);

        Button button2 = new Button("New game");
        button2.setBounds(50, 350, 100, 30);
        
        Checkbox checkbox = new Checkbox("agree to all the terms and conditions");
        checkbox.setBounds(50,200,300,20);
        
        Label l = new Label("do you want to save the changes ? ");
        l.setBounds(50,400,300,30);
        
        CheckboxGroup radiocheck = new CheckboxGroup();
        Checkbox c1 = new Checkbox("yes",radiocheck,false);
        c1.setBounds(50,433,100,21);
        Checkbox c2 = new Checkbox("no",radiocheck,false);
        c2.setBounds(150,433,100,21);
        
        List list = new List();
        list.setBounds(50,500,100,100);
        list.add("skins");
        list.add("weapons");
        list.add("vehicles");
        
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(690,10,10,700);
        
        //Scrollbar scrollbar1 = new Scrollbar();
        //scrollbar1.setBounds(690,10,10,30);

        frame.add(label);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(checkbox);
        frame.add(c2);
        frame.add(c1);
        frame.add(l);
        frame.add(list);
        frame.add(scrollbar);
        //frame.add(scrollbar1);

        frame.setVisible(true);
    }
}
/*
package database_handling;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Components {
    public static void main(String[] args) {
        final Frame frame = new Frame("vice city");
        frame.setSize(700, 700);
        frame.setLayout(null); // Set layout to null to use absolute positioning

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Using null layout to use setBounds
        Label label = new Label("vice city : loading....");
        label.setBounds(40, 30, 200, 100);

        Button button = new Button("Start game");
        button.setBounds(50, 250, 100, 30);

        Button button1 = new Button("Load game");
        button1.setBounds(50, 300, 100, 30);

        Button button2 = new Button("New game");
        button2.setBounds(50, 350, 100, 30);

        Checkbox checkbox = new Checkbox("agree to all the terms and conditions");
        checkbox.setBounds(50, 200, 300, 20);

        Label l = new Label("do you want to save the changes?");
        l.setBounds(50, 650, 300, 30);

        CheckboxGroup radiocheck = new CheckboxGroup();
        Checkbox c1 = new Checkbox("yes", radiocheck, false);
        c1.setBounds(50, 690, 100, 20);
        Checkbox c2 = new Checkbox("no", radiocheck, false);
        c2.setBounds(150, 690, 100, 20);

        frame.add(label);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(checkbox);
        frame.add(c2);
        frame.add(c1);
        frame.add(l);

        frame.setVisible(true);
    }
}
*/
