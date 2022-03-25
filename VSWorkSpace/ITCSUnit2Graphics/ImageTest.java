//regular graphics imports
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//new required import statements
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

//don't forget to extend JPanel!
@SuppressWarnings({"serial", "unused"})
public class ImageTest extends JPanel {

	//constants for width and height of the frame
	private static final int WIDTH = 800;
	private static final int HEIGHT = 500;
	
	//field for the bufferedImage we are building
	private BufferedImage bufferedImage;
	
	//constructor for our panel object
	//when using BufferedImage, all draw code should go here
	public ImageTest() {
		//initialize bufferedImage object, this will always be the same
		bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		//retrieve the graphics object from the bufferedImage object
		Graphics g = bufferedImage.getGraphics();
		
		//draw the background to fill the entire frame
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		//create an ImageIcon object and give it the filename of your image
		//SAVE IMAGES TO THE PROJECT FOLDER NOT SRC FOLDER
		ImageIcon image = new ImageIcon("Images/mrhot.png");
		
		//draw the image on the screen
		//In this case the width and height of the image are half that of the screen
		//and the x, y are set so that the image is centered
		g.drawImage(image.getImage(),WIDTH/4, HEIGHT/4, WIDTH/2, HEIGHT/2, null);
		
	}
	
	//places the bufferedImage we created on the panel
	//this will always  be the same and should be the ONLY thing in paintComponent
	public void paintComponent(Graphics g) {
		g.drawImage(bufferedImage, 0, 0, getWidth(), getHeight(), null);
	}
	
	//same main method as usual
	public static void main(String[] args) {
		JFrame frame = new JFrame("Moose Picture");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ImageTest());
		frame.setVisible(true);
	}

}
