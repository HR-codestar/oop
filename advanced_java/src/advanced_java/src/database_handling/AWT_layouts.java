package database_handling;
import java.awt.*;
import java.awt.event.*;

public class AWT_layouts {
	public static void main(String[] args) {
		final Frame frame = new Frame("Vice City");
		frame.setSize(400,400);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
		
        
		//FlowLayout flow = new FlowLayout();
		//Panel flowpanel = new Panel(flow);
		//flowpanel.add(new Button("button1"));
		//flowpanel.add(new Button("button2"));
		//flowpanel.add(new Button("button3"));
		//flowpanel.add(new Button("button4"));
		//flowpanel.add(new Button("button5"));
		//flowpanel.add(new Button("button6"));
		//flowpanel.add(new Button("button7"));
		//flowpanel.add(new Button("button8"));
        
        BorderLayout bl = new BorderLayout();
        frame.setLayout(bl);
        
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        
        frame.add(b1,BorderLayout.WEST);
        frame.add(b2,BorderLayout.CENTER);
        frame.add(b3,BorderLayout.NORTH);
        frame.add(b4,BorderLayout.EAST);
        frame.add(b5,BorderLayout.SOUTH);
        
        
        /*GridLayout gl = new GridLayout(2,2); /*<- we canprovide the pattern of the 
        										data*/
        /*Panel gp = new Panel(bl);
        
        gp.add(new Button("button1"));
        gp.add(new Button("button2"));
        gp.add(new Button("button3"));
        gp.add(new Button("button4"));
        
        frame.add(gp);*/
		//frame.add(flowpanel); 
		frame.setVisible(true);
		
		//frame.setLayout(flow);
	}
}


