//ITCS 
//Lab09: Exploration

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Exploration {

   // declare and initialize array of map choices for the dialogue drop-down
   // options
   public static final String[] choices = { "mountain1", "mountain2", "mountain3", "hill1", "hill2", "hill3", "step1",
         "step2", "step3" };

   public static void main(String[] args) {
      // open dialogue box and request user input of map choices
      String mapChoice = (String) JOptionPane.showInputDialog(null, "Choose an map.", "Map Choices",
            JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

      // open selected map and set size and speed
      Display.openWorld("maps/" + mapChoice + ".map");
      Display.setSize(17, 15);
      Display.setSpeed(10);

      Climber jim;

      /*
       * if statements to initialize climber type (climber, HillClimber or
       * StepClimber) and starting location based on mapChoice include final else to
       * initialize climber in the case of an invalid entry
       */

      if (mapChoice.contains("hill")) {
         jim = new HillClimber(10);
         System.out.println("hill");
      } else if (mapChoice.contains("step")) {
         jim = new StepClimber(12);
         System.out.println("step");
      } else if (mapChoice.contains("mountain")) {
         jim = new Climber(8);
         System.out.println("climber");
      } else {
         jim = new Climber();
         System.out.println("PLEASE FOR THE LOVE OF GOD PUT IN SOMETHING VALID WHY MUST YOU DO THIS TO ME");
      }

      // invoke the explore method from the mountain class using the climber declared
      // above.

      Mountain.explore(jim);
   }
}