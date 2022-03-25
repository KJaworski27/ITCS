// MakePyramid2.java        ITCS    Shell Code

//import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid2 {

   public static void main(String[] args) {

      Display.setSize(8, 8);
      Display.setSpeed(5);

      // Create a Multitasker
      Multitasker goku = new Multitasker();

      // Code to make the pyramid goes here
      goku.dropAndMove();
      goku.turnRight();
      goku.moveAndDrop();
      goku.turnRight();
      goku.moveAndDrop();
      goku.turnLeft();
      goku.moveAndDrop();
      goku.turnLeft();
      goku.moveAndDrop();
      goku.moveAndDrop();
      goku.move();
      goku.turnRight();
      goku.moveAndDrop();
      goku.turnRight();
      for (int i = 0; i < 3; i++) {
         goku.moveAndDrop();
      }

      printFinishMessage(
            "We got a number 1 victory royale " + "yeah fortnite we bout to get down 10 kills on the board "
                  + "right now just wiped out tomato town, yeah, my friend just "
                  + "got downed, i revived him now we're heading "
                  + "southbound, now we're in the pleasant park streets, open the map go to the marked sheets");

   }

   // Prints the message to a dialog box
   public static void printFinishMessage(String message) {
      JOptionPane.showMessageDialog(null, message);
   }

}