//Required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//make sure the class extends jPanel
public class HelloGraphics extends JPanel {

    public int xVal = 0;
	//this method "paints" things onto the panel 
	public void paintComponent (Graphics g)	{
        //Draws a red oval
        g.setColor(Color.RED);
		g.fillOval(10, 10, 25, 25);
		
        //Draws a unique color square
        g.setColor(new Color(176, 11, 105));
        g.fillRect(50, 50, 200, 200);

        //Draws vertical and horizontal line
        g.setColor(Color.BLACK);
        g.drawLine(300, 0, 300, 600);
        g.drawLine(0, 300, 600, 300);

        //Makes a string
        g.setFont(new Font("Roboto", 0, 25));
        g.setColor(Color.YELLOW);
        g.drawString("super cool awesome and amazing graphics", 100, 100);

        //Draws three horizontal circles
        g.setColor(Color.GREEN);
        for(int i = 0; i < 3; i ++)
        {
            g.fillOval(xVal, 300, 100, 100);
            xVal += 100;
        }
	}

	//Driver
	public static void main (String[] args) {
		//creates a frame and sets it's properties
		JFrame frame = new JFrame("Hello ITCS!!!!!");
		frame.setSize(600, 600);
		frame.setLocation(50, 0);

		//tells the java program to exit when the graphics window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//put the panel on the frame and make it visible 
		frame.setContentPane(new HelloGraphics());
		frame.setVisible(true);
	}
}