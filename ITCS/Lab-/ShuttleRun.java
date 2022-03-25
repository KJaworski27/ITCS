
//Author Kevin Jaworski
import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class ShuttleRun {
   public static void runTheRace(Racer temp) {
      temp.shuttle(3, 5);
      temp.shuttle(5, 2);
      temp.shuttle(6, 3);
      temp.shuttle(9, 7);
      temp.move();
   }

   public static void main(String[] args) {
      // open map
      Display.openWorld("maps/shuttlerun.map");
      Display.setSize(13, 10);
      Display.setSpeed(10);

      // makes racers
      Racer bim = new Racer(1);
      Racer bam = new Racer(4);
      Racer toi = new Racer(7);

      // haves everyone run a shuttle
      runTheRace(bim);
      runTheRace(bam);
      runTheRace(toi);
   }
}