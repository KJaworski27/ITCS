//required import statements
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
//Change the name of the class from AnimationShell to the name of your class
public class BouncingBall extends JPanel {

	//set the initial width and height of your image
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private static Ball[] ball = new Ball[25]; //change this to whatever object(s) you are animating
    
    public static Color randCol()
    {
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random()*256));
    }

	//Constructor required by BufferedImage
	public BouncingBall() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
        for(int i = 0; i < ball.length; i++)
        {
            ball[i] = new Ball(125, 125, (int) (Math.random() * 150), randCol());
        }
        /*ball[0] = new Ball(25, 25, 80, Color.red);
        System.out.println("initialized ball 0");
        ball[1] = new Ball(125, 125, 80, Color.RED);
        ball[2] = new Ball(225, 125, 80, randCol());
        ball[3] = new Ball(325, 125, 80, randCol());
        ball[4] = new Ball(25, 125, 80, randCol());
        ball[5] = new Ball(125, 325, 80, randCol());
        ball[6] = new Ball(225, 325, 80, randCol());
        ball[7] = new Ball(325, 325, 80, randCol());
        ball[8] = new Ball(425, 525, 80, randCol());
        ball[9] = new Ball(25, 525, 80, randCol());
        ball[10] = new Ball(125, 525, 80, randCol());
        ball[11] = new Ball(225, 525, 80, randCol());
        ball[12] = new Ball(325, 725, 80, randCol());
        ball[13] = new Ball(425, 725, 80, randCol());
        ball[14] = new Ball(25, 725, 80, randCol());*/

        for(int i = 0; i < ball.length; i++)
        {
            System.out.println("setting speed #" + i);
            ball[i].setRandomSpeed(10);
        }

				
		/*Code to setup the objects you will animate goes here
		        All objects declared above should be initialized here
			    ex. cloud = new Cloud(100, 100, 250, 70, Color.WHITE);
			        cloud.setXSpeed(2);
		*/
		
		

		//set up and start the Timer
		timer = new Timer(20, new TimerListener());
		timer.start();

	}
	
	//TimerListener class that is called repeatedly by the timer
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			g.setColor(Color.BLACK);
            g.fillRect(0, 0, WIDTH, HEIGHT);
			for(int i = 0; i < ball.length; i ++)
            {
                //System.out.println("Drawing ball #" + i);
                ball[i].draw(g);
            }
            //ball[0].draw(g);


			System.out.println(ball[0].getXSpeed() + " " + ball[0].getYSpeed());
            System.out.println(ball[0].getX() + " " + ball[0].getY());
            System.out.println(ball[0].getColor());
            for(int i = 0; i < ball.length; i++)
            {
                ball[i].move(WIDTH, HEIGHT);
            }
			
			
			repaint(); //leave this alone, it MUST  be the last thing in this method
		}
		
	}

	//do not modify this
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animation Shell");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BouncingBall()); //TODO: Change this to the name of your class!
		frame.setVisible(true);
	}

}