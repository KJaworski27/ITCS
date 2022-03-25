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

import java.awt.GradientPaint; //new required import
import java.awt.Graphics2D;

@SuppressWarnings("serial")

public class Falcon9LiftOff extends JPanel {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private Falcon9 falcon9;
	private Star[] star = new Star[50];

	//Constructor required by BufferedImage
	public Falcon9LiftOff() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
        falcon9 = new Falcon9(WIDTH / 2, HEIGHT - 100, 80, 200, 0.01);
		for(int i = 0; i < star.length; i ++)
		{
			star[i] = new Star(WIDTH, HEIGHT);
		}
        ///falcon9.draw(g);
        //falcon9.setBase(Color.RED);
        //falcon9.setEndCol(Color.RED);
		falcon9.setAltitude(HEIGHT - falcon9.getHeight() / 2);
		//falcon9.setY(HEIGHT - falcon9.getHeight() / 2);
		//falcon9.setFixedOffset(falcon9.getY());
		
        //falcon9.setAltitude((int) (falcon9.getHeight()- falcon9.getY()));
		// convert g into a graphics2d object
		
		
					
		
		//set up and start the Timer
		timer = new Timer((int) (falcon9.getDeltaTime() * 1000), new TimerListener());//(int) (falcon9.getDeltaTime() * 1000)
		timer.start();

	}
	
	//TimerListener class that is called repeatedly by the timer
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Graphics2D g2D = (Graphics2D) g;
			
			GradientPaint blueToOrange = new GradientPaint(0, 2 * HEIGHT / 8, new Color(0, 0, 153), 0, HEIGHT, new Color(3, 123, 252));
			g2D.setPaint(blueToOrange);
			g2D.fillRect(0, 0, WIDTH, HEIGHT);
            //g.setColor(Color.GRAY);
			for(int i = 0; i < star.length; i ++)
			{
				star[i].move(HEIGHT);
				star[i].draw(g);
				star[i].setySpeed((int) (falcon9.getyVelocity      () / 100));
			}
            //g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(new Color(0, 176, 15));
			g.fillRect(0, HEIGHT - 100 + (int) (falcon9.getAltitude() / 105), WIDTH, HEIGHT);

            falcon9.move(HEIGHT);
            falcon9.draw(g);


			g.setFont(new Font("Roboto", 0, 15));
       		g.setColor(Color.BLUE);
        	g.drawString("Time elaspsed: " + falcon9.getTimeElapsed(), 15, 25);
			g.drawString("Y acceleration: " + (int) falcon9.getyAcceleration(), 15, 45);
			g.drawString("Y Velocity: " + (int) falcon9.getyVelocity(), 15, 65);
			g.drawString("Altitude: " + (int) falcon9.getAltitude(), 15, 85);

			
			

			
			repaint(); //leave this alone, it MUST  be the last thing in this method
		}
		
	}

	//do not modify this
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Matthew Stafford's interception count keeps rising forever");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Falcon9LiftOff());
		frame.setVisible(true);
	}

}