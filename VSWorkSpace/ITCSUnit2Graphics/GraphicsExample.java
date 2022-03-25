//Required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//make sure the class extends jPanel
public class GraphicsExample extends JPanel {

	//this method "paints" things onto the panel 
	public void paintComponent (Graphics g)	{
		//start by setting the pen color
		//then draws a rectangle the size of the screen to serve as the background 
		g.setColor(Color.RED.darker());
		g.fillRect(0, 0, 600, 600);
		
		//change the color, then draw two more rectangles 
		g.setColor(new Color(255, 51, 255)); 
		g.fillRect(300, 300, 100, 100); //location (300, 300) with width/height of 100
		g.fillRect(50, 50, 200, 100); //location (50, 50) with width 200 height 100
		
		//change color and draw an oval at (200, 200) with a width and height of 100
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 100, 100);
		
		//draw a line from (10, 10) to (500, 500)
		//notice we did not set the color again, so it will be the same color as the circle
		g.drawLine(10, 10, 500, 500);
		
		//Sets the font and color, then draws some text on the screen
		g.setFont(new Font("Arial", Font.BOLD, 50));
		g.setColor(new Color(255, 150, 0));
		g.drawString("Graphics Example", 50, 550);
		
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
		frame.setContentPane(new GraphicsExample());
		frame.setVisible(true);
	}


}