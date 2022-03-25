import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("unused")
public class GravityBall extends Ball
{
    private double xAcceleration;
    private double yAcceleration;
    private double elasticity;
    public GravityBall()
    {
        super();
        xAcceleration = 0;
        yAcceleration = 0;
        elasticity = 0.8;
    }
    public GravityBall(double x, double y, double diameter, Color color)
    {
        super(x, y, diameter, color);
        xAcceleration = 0;
        yAcceleration = 0;
        elasticity = 0.8;
    }

    public double getXAcceleration()
    {
        return xAcceleration;
    }
    public double getYAcceleration()
    {
        return yAcceleration;
    }

    public void setXAcceleration(double xAcceleration)
    {
        this.xAcceleration = xAcceleration;
    }
    public void setYAcceleraction(double yAcceleration)
    {
        this.yAcceleration = yAcceleration;
    }

    public void setInitialVelocity(int speed, int angle)
    {
        setXSpeed(speed * Math.cos(Math.toDegrees(angle)));
        setYSpeed(speed * Math.sin(Math.toDegrees(angle)));
    }

    public void launch(int rightEdge, int bottomEdge, double deltaTime)
    {
        deltaTime = deltaTime / 1000;
        setXSpeed(getXSpeed() + xAcceleration * deltaTime);
        setYSpeed(getYSpeed() + yAcceleration * deltaTime);

        double x = getX();
        double y = getY();
        double radius = getRadius();
        double xSpeed = getXSpeed();
        double ySpeed = getYSpeed();

        if(x < radius)
        {
            xSpeed *= -1 * elasticity;
            
            x = radius;
        } else if(x + radius > rightEdge) 
        {
            xSpeed *= -1 * elasticity;
            
            x = rightEdge - radius;
        } else if(y < radius) 
        {
            ySpeed *= -1 * elasticity;
            
            y = radius;
        } else if(y + radius > bottomEdge) 
        {
            ySpeed *= -1 * elasticity;
            
            y = bottomEdge - radius;
        }

        if(ySpeed < 0.01 && ySpeed < 0.01)
        { 
            setXSpeed(0);
            setYSpeed(0);
            setY(bottomEdge - getRadius());
        }

        setX(x + xSpeed);
        setY(y + ySpeed);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    
}