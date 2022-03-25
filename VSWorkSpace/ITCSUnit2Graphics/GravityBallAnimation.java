//required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("unused")
//Change the name of the class from AnimationShell to the name of your class
public class GravityBallAnimation extends JPanel {

	//set the initial width and height of your image
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 800;
    private static final int deltaTime = 10;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private GravityBall ball; //change this to whatever object(s) you are animating

	//Constructor required by BufferedImage
	public GravityBallAnimation() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();

        //ball = new GravityBall();
        ball = new GravityBall(0, 0, 80, Color.RED);
        ball.setInitialVelocity(10, 45);
        ball.setXAcceleration(0);
        ball.setYAcceleraction(9.8);

				
		/*Code to setup the objects you will animate goes here
		        All objects declared above should be initialized here
			    ex. cloud = new Cloud(100, 100, 250, 70, Color.WHITE);
			        cloud.setXSpeed(2);
		*/
		
		

		//set up and start the Timer
		timer = new Timer(deltaTime, new TimerListener());
		timer.start();

	}
	
	//TimerListener class that is called repeatedly by the timer
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			/* Move the objects that need to be animated
			 * 		 Draw your ENTIRE scene
			 * 		 Don't forget to call repaint!
			 */
            g.setColor(Color.gray);
            g.fillRect(0, 0, WIDTH, HEIGHT);
			ball.launch(WIDTH, HEIGHT, deltaTime);
			ball.draw(g);

             
			
			repaint(); //leave this alone, it MUST  be the last thing in this method
		}
		
	}

	//do not modify this
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Haha ball go brrrrrrrrrrrrr");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GravityBallAnimation());
		frame.setVisible(true);
	}
}