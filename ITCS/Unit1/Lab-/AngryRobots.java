//Angry Robots
//ITCS and Physics - Integrated Projectile Project

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class AngryRobots {

    // global variables
    // These can be used in any method in this program without having to pass the
    // variable as a parameter
    // Note that Ay and Ax are declared final, they cannot be changed
    public static double Ay = -9.8;
    public static final double Ax = 0;
    public static double y = 0.0;
    public static double x = 0.0;
    public static double v0x = 0.0;
    public static double v0y = 0.0;
    public static double t = 0.0;
    public static double dt = 0.1;

    public static void main(String[] args) 
    {
      
        Ay = -9.8;
        Display.setSize(1000, 1000);
        Display.setSpeed(10);
        // User input to define initial velocity and launch angle
        // the parseDouble method converts the string input to a double
        String[] choices = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        String planetName = (String)JOptionPane.showInputDialog(null, "What planet's gravity would you like to use?", "Planet choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
        
        if (planetName.equals("mercury"))
        {
            Ay = -3.7;
        }else if (planetName.equals("venus"))
        {
            Ay = -8.8;
        }else if (planetName.equals("earth"))
        {
            Ay = -9.8;
        }else if (planetName.equals("mars"))
        {
            Ay = -3.7;
        }else if (planetName.equals("jupiter"))
        {
            Ay = -24.7;
        }else if (planetName.equals("saturn"))
        {
            Ay = -10.5;
        }else if (planetName.equals("uranus"))
        {
            Ay = -9.0;
        }else if (planetName.equals("neptune"))
        {
            Ay = -11.7;
        }else
        {
            Ay = 9.8;
        }
        double v0 = Double.parseDouble(JOptionPane.showInputDialog("Please enter an initial velocity in m/s"));
        double angleDegrees = Double
                .parseDouble(JOptionPane.showInputDialog("Please enter an initial angle in degrees"));

        // Calculate x and y initial velocities
        v0x = calculateV0X(v0, angleDegrees);
        System.out.println("V0x: " + v0x);

        v0y = calculateV0Y(v0, angleDegrees);
        System.out.println("V0y: " + v0y);



        //calculateProjectile(v0x, v0y);

        // Step 2: Complete the plotProjectile method and invoke it in your
        // calculateProjectile method
        // to place a new Robot at each calculated x,y location
        // No need to add code here for this step

        // Step 3: Create the optimalAngle method to determine the optimal launch angle
        // for max range
        // Tests all angles between 0 and 90 degrees
        // invoke it here and store what it returns into a double

        //System.out.println("The optimal angle is " + optimalAngle(v0));
        
        // Step 4: Create the plotRelatedAngles method and invoke it here
        // Plot projectile at optimal angle, +/- 15 degrees and +/- 30 degrees from
        // optimal angle

        plotRelatedAngles(optimalAngle(v0), v0);

    }

    /**
     * Calculates the initial x-velocity
     * 
     * @param v0           the initial velocity
     * @param angleDegrees the angle, in degrees
     * @return the initial x-velocity
     */
    public static double calculateV0X(double v0, double angleDegrees) 
    {
        
        return v0 * (Math.cos(Math.toRadians(angleDegrees)));
    }

    /*
     * Calculates the initial y-velocity
     * 
     * @param v0 the initial velociy
     * 
     * @param angleDegrees the angle, in degrees
     * 
     * @return the initial y-velocity
     */
    public static double calculateV0Y(double v0, double angleDegrees) 
    {
        v0 = v0 * (Math.sin(Math.toRadians(angleDegrees)));
        return v0;
    }

    /**
     * Finds the x-coordinate with the given initial x-velocity, v0x, at the given
     * time, t.
     * 
     * @param v0x the initial x-velocity
     * @param t   the given time
     * @return the x-coordinate with the initial x-velocity at the given time
     */
    public static double calculateX(double v0x, double t) 
    {
        return v0x * t;
    }

    /**
     * Finds the y-coordinate with the given initial y-velocity, v0y, at the given
     * time, t.
     * 
     * @param v0y the initial y-velocity
     * @param t   the given time
     * @return the y-coordinate with the initial y-velocity at the given time
     */
    public static double calculateY(double v0y, double t) 
    {
        return v0y * t + (0.5) * (Ay) * (Math.pow(t, 2));
    }

    // Step 1: Invoke method to calculate x and y postions and plot the projectile
    // as long as y is above ground level
    // print x,y, and t to track calculations
    /**
     * Calculates x and y positions to trace the path of the projectile until it
     * hits the ground
     * 
     * @param v0x the initial x-velocity
     * @param v0y the initial y-velocity
     */
    public static void calculateProjectile(double v0x, double v0y) 
    {
        t = 0;
        while(y >= 0)
        //for(double i = 0; i < 5; i += 0.2)
        {
            x = calculateX(v0x, t);
            y = calculateY(v0y, t);
            t += dt;
            System.out.println(t + ", " + x + ", " + y);
            plotProjectile(x, y);
        }
    }

    // Step 2: plot Robots
    /**
     * Declares and instantiates a robot at the given point (x, y) Creates a 50x50
     * blank coordinate map
     * 
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public static void plotProjectile(double x, double y) 
    {
        new Robot((int) x, (int) y, Display.NORTH, 0);
    }

    // Step 3: Determine the optimal launch angle for max range
    // Tests all angles between 0 and 90 degrees
    // add method here

    public static double optimalAngle(double v0)
    {
        double maxRange = 0;
        double maxAngle = 0;
        System.out.println("test");
        for(int i = 1; i <= 90; i++)
        {
            x = 0;
            y = 0;
            t = 0;
            v0x = calculateV0X(v0, i);
            v0y = calculateV0Y(v0, i);
            while(y >= 0)
            {
                x = calculateX(v0x, t);
                y = calculateY(v0y, t);
                t += dt;
            }
            //System.out.println("For launch angle " + i + ", range is " + x);
            System.out.println(x);
            if (x > maxRange)
            {
                maxRange = x;
                maxAngle = i;
            }
        }
        return maxAngle;
    }

    public static void plotRelatedAngles(double optAngle, double v0)
    {
        System.out.println("the optimal angle for maximum range is " + optAngle);
        for(int i = 0; i < 5; i++)
        {
            double angle = 0;
            if(i == 0)
            {
                angle = optAngle - 30;
            }else if (i == 1)
            {
                angle = optAngle - 15;
            }else if (i == 2)
            {
                angle = optAngle;
            }else if (i == 3)
            {
                angle = optAngle + 15;
            }else if (i == 4)
            {
                angle = optAngle + 30;
            }
            
            v0x = calculateV0X(v0, angle);
            v0y = calculateV0Y(v0, angle);
            t = 0;
            x = 0;
            y = 0;
            while(y >= 0)
            {
                x = calculateX(v0x, t);
                y = calculateY(v0y, t);
                t += dt;
                plotProjectile(x, y);
            }
            System.out.println("The range for " + angle + " degrees is " + x);
        }
    }
    
    /**
     * Determines optimal angle for maximum range by testing angles between 0-90 for
     * a set initial velocity
     * 
     * @param v0 the initial velocity
     * @return the optimal angle (in degrees)
     */

    // Step 4:
    // Plot the given angle, +/- 15 degrees and +/- 30 degrees from given angle
    // add method here

}
