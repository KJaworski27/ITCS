import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class HelloRobot
{
   public static void main(String[] args)
   {
        Display.openWorld("maps/first.map");
        Display.setSize(10, 10);
        
        Robot joeBiden = new Robot();
        joeBiden.move();
        joeBiden.pickBeeper();
        joeBiden.move();
        joeBiden.turnLeft();
        joeBiden.move();
        joeBiden.move();
        joeBiden.move();
        joeBiden.putBeeper();
        joeBiden.move();
   }
}