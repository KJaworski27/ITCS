//author Kevin Jaworski
import edu.fcps.karel2.Robot;
import javax.lang.model.util.ElementScanner14;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MazeEscape
{
    

    public static void followLeft(Athlete solver)
    {
        if((solver.leftIsClear() && solver.rightIsClear()) || (solver.leftIsClear() && solver.frontIsClear()) || (solver.frontIsClear() && solver.rightIsClear()))
        {
            startIntersection(solver, false);
        }else
        {
            if(solver.frontIsClear())
            {
                solver.move();
            }else if(solver.leftIsClear())
            {
                solver.turnLeft();
                solver.move();
            }else if(solver.rightIsClear())
            {
                solver.turnRight();
                solver.move();
            }else
            {
                solver.turnAround();
            }
        }        
    }
    public static void startIntersection(Athlete solver, boolean reccured)
    {
        
        System.out.println("new intersection");
        int stepCount = 0;
        //moves in order left, forward, right
        if(solver.leftIsClear())
        {
            System.out.println("left is clear");
            solver.turnLeft();
            solver.move();
        }else if(solver.frontIsClear())
        {
            System.out.println("front is clear");
            solver.move();
        }else if(solver.rightIsClear())
        {
            System.out.println("right is clear");
            solver.turnRight();
            solver.move();
        }

        //System.out.println("intersection complete");
    }
    public static void main(String args[])
    {
        String filename = JOptionPane.showInputDialog("What maze map?");
        Display.openWorld("maps/" + filename + ".map");
        Display.setSpeed(10);
        Athlete solver = new Athlete();

        //check if robot is at intersection
        while(!solver.nextToABeeper())
        {
            followLeft(solver);
        }        
    }
}