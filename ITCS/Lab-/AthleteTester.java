//Author Kevin Jaworski

import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class AthleteTester {
   public static void main(String[] args) {
      Display.openWorld(" ");
      Athlete tomathan = new Athlete();
      Athlete billiam = new Athlete(3, 2, 1, 0);

      tomathan.move();
      tomathan.move();
      tomathan.move();
      tomathan.turnRight();

      billiam.move();
      billiam.move();
      billiam.turnAround();
   }

}