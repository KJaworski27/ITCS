//Author Kevin Jaworski
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MazeEscapeBad
{
    public static boolean deadEnd = false;
    public static int stepCount = 0;

    public static void breadMove(Athlete temp)
    {
        
        if(deadEnd)
        {
            System.out.println("Dead end move");
            //temp.move();
            //temp.pickBeeper();
            stepCount -= 1;
        }else
        {
            System.out.println("Normal Move");
            //temp.putBeeper();
            temp.move();
            stepCount++;
        }
        if(stepCount == 0)
        {
            deadEnd = false;
        }
        System.out.println(stepCount + " steps");
    }

    public static void main(String args[])
    {
        String[] choices = {"maze1", "maze2", "maze3", "maze4"};
        String filename = (String)JOptionPane.showInputDialog(null, "Choose a map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
        Display.openWorld("maps/" + filename + ".map");
        Display.setSpeed(10);
        

        Athlete solver = new Athlete();

        //Check if there's wall on left
        while(!solver.nextToABeeper())
        {
            if(!solver.leftIsClear())
            {
                System.out.println("Left isn't clear");
                if(!solver.frontIsClear())
                {
                    if(!solver.rightIsClear())
                    {
                        solver.turnAround();
                        deadEnd = true;
                        //solver.pickBeeper();
                        
                    }else
                    {
                        solver.turnRight();
                        //solver.putBeeper();
                        breadMove(solver);
                    }
                }else
                {   
                    System.out.println("Front is clear so we move");
                    //solver.putBeeper();
                    breadMove(solver);
                }
            }else
            {
                solver.turnLeft();
                //solver.putBeeper();
                breadMove(solver);
            }
        }        
    }
}