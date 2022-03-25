
//author Kevin Jaworski
import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class loopExtention {
   public static void main(String[] args) {
      Display.openWorld("maps/loopChallenge.map");
      Display.setSpeed(10);

      Athlete peterGriffin = new Athlete(1, 1, Display.EAST, 0);

      for (int i = 0; i < 4; i++) {
         peterGriffin.move();
         for (int j = 0; j < 20; j++) {
            peterGriffin.pickBeeper();
         }
         peterGriffin.move();
      }
   }
}