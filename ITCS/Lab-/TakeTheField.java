
//Author Kevin Jaworski
import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class TakeTheField {

   public static void takeTheField(Athlete temp) {
      temp.move();
      temp.move();
      temp.move();
      temp.move();
      temp.turnRight();
      temp.move();
      temp.move();
   }

   public static void main(String[] args) {

      // opens map
      Display.openWorld("maps/arena.map");
      Display.setSpeed(10);

      // Places Athletes
      new Athlete(2, 7, Display.EAST, 0);

      Athlete sans = new Athlete();
      Athlete papyrus = new Athlete();
      Athlete toriel = new Athlete();
      Athlete asgore = new Athlete();
      Athlete alphys = new Athlete();
      Athlete undyne = new Athlete();

      /*
       * moves each one of our athletes to the entrance to the "field"
       */

      takeTheField(sans);
      takeTheField(papyrus);
      takeTheField(toriel);
      takeTheField(asgore);
      takeTheField(alphys);
      takeTheField(undyne);

      // sans goes in front of the goal
      sans.move();
      sans.move();
      sans.move();
      sans.turnLeft();
      sans.move();
      sans.move();
      sans.move();
      sans.turnAround();
      /*
       * papyrus, toriel and asgore line up in front of sans
       */
      papyrus.move();
      papyrus.turnLeft();
      papyrus.move();
      papyrus.move();
      papyrus.turnAround();

      toriel.move();
      toriel.move();
      toriel.move();
      toriel.turnLeft();
      toriel.move();
      toriel.move();
      toriel.turnAround();

      asgore.move();
      asgore.move();
      asgore.move();
      asgore.move();
      asgore.move();
      asgore.turnLeft();
      asgore.move();
      asgore.move();
      asgore.turnAround();
      // alphys and undyne line up in front of them
      alphys.move();
      alphys.move();
      alphys.turnLeft();
      alphys.move();
      alphys.turnAround();

      undyne.move();
      undyne.move();
      undyne.move();
      undyne.move();
      undyne.turnLeft();
      undyne.move();
      undyne.turnAround();
   }
}