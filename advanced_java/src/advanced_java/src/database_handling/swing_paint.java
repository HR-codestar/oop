/*
package database_handling;
import javax.swing.*;
import java.awt.*;
	
	class CustomPaintComponent extends JPanel{
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillOval(50,100 ,50, 50);
			
		}
			
	
	}
	
	class CustomLookAndFeel{
		public static void setCustomLookAndFeel(){
			try {
				UIManager.setLookAndFeel ("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
	public class swing_paint{
		public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				CustomLookAndFeel.setCustomLookAndFeel();
				
				JFrame frame = new JFrame();
				frame.setSize(600,600);
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				CustomPaintComponent paint = new CustomPaintComponent();
				frame.add(paint);
				frame.setVisible(true);
			}
			);
			
		}
	}
*/
/*
package database_handling;

import javax.swing.*;
import java.awt.*;

class CustomPaintComponent extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(50, 100, 50, 50);
    }
}

class CustomLookAndFeel {
    public static void setCustomLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class swing_paint {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomLookAndFeel.setCustomLookAndFeel();

            JFrame frame = new JFrame();
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            CustomPaintComponent paint = new CustomPaintComponent();
            frame.add(paint);
            frame.setVisible(true);
        });
    }
}


*/

/*
package database_handling;
import javax.swing.*;
import java.awt.*;


public class swing_paint {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		frame.add(panel);
		 
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("file");
		
		JMenuItem open = new JMenuItem("open");
		JMenuItem add = new JMenuItem("add");
		JMenuItem save = new JMenuItem("save");
		
		file.add(open);
		file.add(add);
		file.add(save);
		
		menubar.add(file);
		
		panel.add(menubar);
		
	
		frame.setVisible(true);
		
		
	}

}
*/

package database_handling;

import javax.swing.*;
import java.awt.*;

class CustomPaintComponent extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(50, 100, 50, 50);
    }
}

class CustomLookAndFeel {
    public static void setCustomLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class swing_paint {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomLookAndFeel.setCustomLookAndFeel();
            
            JFrame frame = new JFrame();
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            CustomPaintComponent paint = new CustomPaintComponent();
            frame.add(paint);
            
            JMenuBar menubar = new JMenuBar();
            JMenu file = new JMenu("File");
            
            JMenuItem open = new JMenuItem("Open");
            JMenuItem add = new JMenuItem("Add");
            JMenuItem save = new JMenuItem("Save");
            
            file.add(open);
            file.add(add);
            file.add(save);
            
            menubar.add(file);
            frame.setJMenuBar(menubar);
            
            frame.setVisible(true);
        });
    }
}
