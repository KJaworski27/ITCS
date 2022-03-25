//required import statements
import java.awt.Color;
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
public class HailHydra extends JPanel {

	//set the initial width and height of your image
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private Ball ball; //change this to whatever object(s) you are animating
    private ArrayList<JumpingBall> jumpingBall = new ArrayList<JumpingBall>();

	//Constructor required by BufferedImage
	public HailHydra() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();

		jumpingBall.add(new JumpingBall(100, 100, 200, Color.RED));
		jumpingBall.add(new JumpingBall(100, 400, 100, Color.BLUE));
		jumpingBall.add(new JumpingBall(100, 700, 50, Color.ORANGE));

        ball = new Ball(WIDTH / 2, HEIGHT/2, 140, Color.MAGENTA);
        ball.setRandomSpeed(10);

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
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, WIDTH, HEIGHT);
			/* TODO: Move the objects that need to be animated
			 * 		 Draw your ENTIRE scene
			 * 		 Don't forget to call repaint!
			 */
			
			for(int i = 0; i < jumpingBall.size(); i ++)
            {
                if(jumpingBall.get(i).intersectsWith(ball))
                {
                    jumpingBall.get(i).setX(WIDTH + 1000);
                    jumpingBall.add(new JumpingBall(
                        (int) (Math.random() * (WIDTH - jumpingBall.get(i).getRadius()) + jumpingBall.get(i).getRadius() / 2),
                        (int) (Math.random() * (HEIGHT - jumpingBall.get(i).getRadius()) + jumpingBall.get(i).getRadius() / 2),
                        jumpingBall.get(i).getDiameter() / 2, jumpingBall.get(i).getColor()));
                    jumpingBall.add(new JumpingBall(
                        (int) (Math.random() * (WIDTH - jumpingBall.get(i).getRadius()) + jumpingBall.get(i).getRadius() / 2),
                        (int) (Math.random() * (HEIGHT - jumpingBall.get(i).getRadius()) + jumpingBall.get(i).getRadius() / 2),
                        jumpingBall.get(i).getDiameter() / 2, jumpingBall.get(i).getColor()));
                    jumpingBall.remove(i);
                }
                
                if(jumpingBall.get(i).getDiameter() <= 10)
                {
                    jumpingBall.get(i).setX(WIDTH + 1000);
                    jumpingBall.remove(i);
                }else
                {
                    jumpingBall.get(i).draw(g);
                }
            }
			
            ball.move(WIDTH, HEIGHT);
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
		JFrame frame = new JFrame("HailHydraHailHydraHailHydraHailHydraHailHydraHailHydraHailHydraHailHydra");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new HailHydra()); //TODO: Change this to the name of your class!
		frame.setVisible(true);
	}

}