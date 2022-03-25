
//Author Kevin Jaworski
//import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class CleverShift {
   public static void ShiftBeepers(Athlete temp) {
      // picks up the first pile of beepers
      while (temp.nextToABeeper()) {
         temp.pickBeeper();
      }
      temp.move();
      for (int j = 0; j < 7; j++) {
         // puts down a pile of beepers and counts how many
         int putDownCount = 0;
         while (temp.hasBeepers()) {
            temp.putBeeper();
            putDownCount++;
         }
         System.out.println(putDownCount);

         // picks up all the beepers in the pile
         while (temp.nextToABeeper()) {
            temp.pickBeeper();
         }
         // puts down the amount of beepers that it put down originally
         for (int i = 0; i < putDownCount; i++) {
            temp.putBeeper();
         }
         temp.move();
      }
   }

   // does the same as ShiftBeepers, but turns around first
   public static void ShiftAgain(Athlete temp) {
      temp.turnAround();
      temp.move();
      // picks up the first pile of beepers
      while (temp.nextToABeeper()) {
         temp.pickBeeper();
      }
      temp.move();
      for (int j = 0; j < 7; j++) {
         // puts down a pile of beepers and counts how many
         int putDownCount = 0;
         while (temp.hasBeepers()) {
            temp.putBeeper();
            putDownCount++;
         }
         System.out.println(putDownCount);

         // picks up all the beepers in the pile
         while (temp.nextToABeeper()) {
            temp.pickBeeper();
         }
         // puts down the amount of beepers that it put down originally
         for (int i = 0; i < putDownCount; i++) {
            temp.putBeeper();
         }
         temp.move();
      }
   }

   public static void main(String[] args) {
      // open world with dialogue box
      String filename = JOptionPane.showInputDialog("What Robot World?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);

      Athlete bjorn = new Athlete(1, 1, Display.EAST, 0);

      ShiftBeepers(bjorn);
      ShiftAgain(bjorn);
   }
}