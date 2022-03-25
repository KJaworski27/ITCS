//required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("unused")

//Change the name of the class from AnimationShell to the name of your class
public class JumpingBallAnimation extends JPanel {

	//set the initial width and height of your image
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private ArrayList<JumpingBall> jumpingBall = new ArrayList<JumpingBall>(); //change this to whatever object(s) you are animating
    private Ball ball;
	private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};
	int totalHits;

	private int addTotalHits(ArrayList<JumpingBall> jb)
	{
		int total = 0;
		for(JumpingBall j : jb)
		{
			total += j.getHits();
		}
		return total;
	}
	public static Color randCol()
    {
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random()*256));
    }

	//Constructor required by BufferedImage
	public JumpingBallAnimation() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();

		for(int i = 0; i < 5; i ++)
		{
			
			jumpingBall.add(new JumpingBall(50, 50, 50, colors[i]));

		}

		ball = new Ball(125, 125, 120, Color.magenta);
		ball.setRandomSpeed(10);
        
		totalHits = 0;
		/*Code to setup the objects you will animate goes here
		        All objects declared above should be initialized here
			    ex. cloud = new Cloud(100, 100, 250, 70, Color.WHITE);
			        cloud.setXSpeed(2);
		*/
		
		

		//set up and start the Timer
		timer = new Timer(10, new TimerListener());
		timer.start();

	}
	
	//TimerListener class that is called repeatedly by the timer
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			/* TODO: Move the objects that need to be animated
			 * 		 Draw your ENTIRE scene
			 * 		 Don't forget to call repaint!
			 */

            g.setColor(Color.GRAY);
            g.fillRect(0, 0, WIDTH, HEIGHT);
			for(int i = 0; i < jumpingBall.size(); i++)
			{
				boolean removeObject = false;

				if(jumpingBall.get(i).intersectsWith(ball))
				{
					jumpingBall.get(i).move(WIDTH, HEIGHT);
					totalHits += 1;
					if(jumpingBall.get(i).getHits() >= 5)
					{
						jumpingBall.get(i).setX(100000);
						jumpingBall.remove(i);
						removeObject = true;
					}else
					{
					}
				}
				if(!removeObject)
				{
					jumpingBall.get(i).draw(g);
				}
				
				
			}
			
			ball.move(WIDTH, HEIGHT);
			ball.draw(g);

			g.setFont(new Font("Roboto", 0, 25));
            g.setColor(Color.BLACK);
            g.drawString("Hits = " + totalHits, 100, 100);
			repaint(); //leave this alone, it MUST  be the last thing in this method
		}
		
	}

	//do not modify this
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Haha peyton Manning go brrrrrrrrrrr");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JumpingBallAnimation()); //Change this to the name of your class!
		frame.setVisible(true);
	}

}