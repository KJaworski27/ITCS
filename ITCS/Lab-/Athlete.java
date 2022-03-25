//author Kevin jaworski

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athlete extends Robot
{
   //constructors
   
   //default
   public Athlete()
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   
   //customizable
   public Athlete(int x, int y, int direction, int beepers)
   {
      super(x, y, direction, beepers);
   }
   
   //turns right
   public void turnRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   
   //turns around
   public void turnAround()
   {
      turnLeft();
      turnLeft();  
   }
}