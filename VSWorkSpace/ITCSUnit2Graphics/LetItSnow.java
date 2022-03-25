//Required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//make sure the class extends jPanel
@SuppressWarnings("unused")
public class LetItSnow extends JPanel {

    public static final int xFrameSize = 600;
    public static final int yFrameSize = 600;
	//this method "paints" things onto the panel 
	public void paintComponent (Graphics g)	{
		
		Snowflake[] flakes = new Snowflake[50];

		for (int i = 0; i < flakes.length; i ++) 
		{
			flakes[i] = new Snowflake((int) (Math.random() * xFrameSize), (int) (Math.random() * yFrameSize), Color.WHITE);

			flakes[i].draw(g);
		}
	}

	//Driver
	public static void main (String[] args) {

		
		
		//creates a frame and sets it's properties
		JFrame frame = new JFrame("Hello ITCS!!!!!");
		frame.setSize(xFrameSize, yFrameSize);
		frame.setLocation(50, 0);
		
		//tells the java program to exit when the graphics window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//put the panel on the frame and make it visible 
		frame.setContentPane(new LetItSnow());
		frame.setVisible(true);
	}
}