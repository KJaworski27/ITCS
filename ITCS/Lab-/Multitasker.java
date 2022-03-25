
//author Kevin Jaworski
import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class Multitasker extends Athlete {
   // constructors

   // default
   public Multitasker() {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }

   // customizable - 4args
   public Multitasker(int x, int y, int direction, int beepers) {
      super(x, y, direction, beepers);
   }

   // moves then drops beeper
   public void moveAndDrop() {
      move();
      putBeeper();
   }

   // drops beeper then moves
   public void dropAndMove() {
      putBeeper();
      move();
   }
}