// MakePyramid3.java        ITCS
//
// Create a pyramid using class methods

//import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid3 {

   // The Multitasker will make column of beepers numBeepers high
   public static void goUp(Multitasker worker, int numBeepers) {
      for (int i = 0; i < numBeepers; i++) {
         worker.dropAndMove();
      }
   }

   public static void moveOver(Multitasker worker) {
      worker.turnLeft();
      worker.move();
      worker.turnLeft();
   }

   public static void goBack(Multitasker worker, int numSpaces) {
      worker.turnAround();
      for (int i = 0; i < numSpaces; i++) {
         worker.move();
      }
   }

   public static void main(String[] args) {

      Display.setSize(8, 8);
      Display.setSpeed(10);

      Multitasker worker = new Multitasker();

      for (int i = 0; i < 8; i++) {
         goUp(worker, i + 1);
         goBack(worker, i + 1);
         moveOver(worker);
      }

      printFinishMessage(
            "According to all known laws of aviation, there is no way that a bee should be able to fly.  Its tiny little wings are to small to get its fat little body off the ground.  the bee, of course, flies anyway, because bees don't care what humans think is impossible.");

   }

   // Prints the given message in the dialog box
   public static void printFinishMessage(String message) {

      JOptionPane.showMessageDialog(null, message);
   }

}