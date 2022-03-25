//regular graphics imports
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//new required import statements
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

@SuppressWarnings({"unused", "serial"})
public class Ball {

	// 1. Declaration of Variables
	
	private double x;			//x-coordinate of the center of the ball
	private double y;			//y-coordinate of the center of the ball
	private double diameter;	//diameter of the ball
	private double radius;		//radius of the ball
	private Color color;		//color of the ball
	private double xSpeed;		//x-speed = change in x-position
	private double ySpeed;		//y-speed = change in y-position
    private ImageIcon image;
	
	// 2. Create a default constructor
	/**
	 * Default Constructor
	 * Creates a red ball at (0, 0) with a diameter of 25.  
	 * The default speed is 0.
	 */
	public Ball() {
        x = 0;
        y = 0;
        diameter = 25;
        radius = diameter/2;
        color = Color.RED;
        xSpeed = 0;
        ySpeed = 0;
        image = new ImageIcon("Images/mrhot.png");
	}

	// 3. Write a constructor that allows the user to input the parameters (x, y, diameter, Color)
	// and sets the x and y-speed = 0.
	public Ball(double x, double  y, double diameter, Color color)
    {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter/2;
        this.color = color;
        xSpeed = 0;
        ySpeed = 0;
        image = new ImageIcon("Images/mrhot.png");
    }

    //getters
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getDiameter()
    {
        return diameter;
    }
    public double getRadius()
    {
        return radius;
    }
    public Color getColor()
    {
        return color;
    }
    public double getXSpeed()
    {
        return xSpeed;
    }
    public double getYSpeed()
    {
        return ySpeed;
    }

    //setters
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
        this.radius = diameter/2;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
        this.diameter = radius * 2;
    }
    public void setColor(Color color)
    {
        this.color = color;
    }
    public void setXSpeed(double xSpeed)
    {
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(double ySpeed)
    {
        this.ySpeed = ySpeed;
    }
	// 5. Finish the following methods
	// 6. Test using BouncingBallTester.java
	
	public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int) (x - radius),(int) (y - radius),(int) diameter,(int) diameter);
        g.drawImage(image.getImage(),(int) (x + -1 * radius / 2),(int) (y + -1 * radius / 2),(int) radius,(int) radius, null);		
	}
	
	
	// 7. Sets the center location of the ball
	
	public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;		
	}
	
	

	// 8. Generates a speed between maxSpeed
	// and maxSpeed
	public void setRandomSpeed(double maxSpeed) {
        this.xSpeed = (Math.random() * maxSpeed);
        this.ySpeed = (Math.random() * maxSpeed);		
	}

	
	// 9. Write the move method to make the ball move around the screen
	// and bounce of the edges.
	public void move(int rightEdge, int bottomEdge) {
        detectEdge(rightEdge, bottomEdge);
        x += xSpeed;
        y += ySpeed;
	}
    public void detectEdge(int width, int height)
    {
        if(x - radius<= 0)
        {
            x = 0 + radius;
            xSpeed *= -1;
        }else if(x + radius >= width)
        {
            x = width - radius;
            xSpeed *= -1;
        }else if(y - radius <= 0)
        {
            y = 0 + radius;
            ySpeed *=-1;
        }else if(y + radius>= height)
        {
            y = height - radius;
            ySpeed *= -1;
        }
    }
}