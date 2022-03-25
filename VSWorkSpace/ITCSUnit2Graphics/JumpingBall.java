//Required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JumpingBall extends Ball 
{
    private int hits;
	public JumpingBall(double x, double y, double diameter, Color color)
    {
        super(x, y, diameter, color);
        hits = 0;
    }
/**
	 * Moves to a random location within the boundaries of the rightEdge
	 * and bottomEdge
	 * @param rightEdge the rightEdge of the movement area
	 * @param bottomEdge the bottomEdge of the movement area
	 */
	public void move(int rightEdge, int bottomEdge) 
    {
        setX((int) (Math.random() * (rightEdge - getRadius() * 2) + getRadius()));
        setY((int) (Math.random() * (bottomEdge - getRadius() * 2 )+ getRadius()));

    }
		
	/**
	 * Determines if the JumpingBall intersects, or collides with, another Ball object
	 * @param otherBall a Ball object
	 * @return true if JumpingBall intersects with the Ball, false otherwise
	 */
	public boolean intersectsWith(Ball otherBall) 
    {
        if(findDistanceFrom(otherBall.getX(), otherBall.getY()) <= getRadius() + otherBall.getRadius())
        {
            hits += 1;
            return true;
        }
        else
        {
            return false;
        }
    }
		
	/**
	 * Calculates and returns the distance between the center of the JumpingBall and 
	 * a specific (x, y) location.
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 * @return the distance between the center of the JumpingBall and (x, y) coordinate
	 */
	public double findDistanceFrom(double x, double y) 
    {
        return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
    }
    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
}

