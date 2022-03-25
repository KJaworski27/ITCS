//Author Kevin Jaworski
import javax.swing.JOptionPane;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Calculator2 
{
    // returns the x and y components of a triange given an angle and hypotenuse
    public static double getXComponent(double angleDegrees, double hypotenuse) 
    {
        return hypotenuse / Math.cos(Math.toRadians(angleDegrees));
    }

    public static double getYComponent(double angleDegrees, double hypotenuse) 
    {
        return hypotenuse * Math.sin(Math.toRadians(angleDegrees));
    }

    // returns the first 5 points of a slope given the rise and run values
    public static void plotLine(int rise, int run) 
    {
        int posY = rise;
        int posX = run;
        System.out.println("The first 5 points on this line are:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("(" + posY + ", " + posX + ")");
            new Robot(posX, posY, Display.NORTH, 0);
            posY += rise;
            posX += run;
        }
    }

    public static String quadratic(double a, double b, double c) 
    {
        double root1 = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double root2 = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return ("the roots of this quadratic are x = {" + root1 + ", " + root2 + "}");
    }

    public static void main(String[] args) 
    {
        Display.setSize(20, 20);
        double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter angle value"));
        double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter hypotenuse value"));
        double value3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter rise value"));
        double value4 = Double.parseDouble(JOptionPane.showInputDialog("Please enter run value"));
        double value5 = Double.parseDouble(JOptionPane.showInputDialog("Enter value a for a quadratic equation"));
        double value6 = Double.parseDouble(JOptionPane.showInputDialog("Enter value b for a quadratic equation"));
        double value7 = Double.parseDouble(JOptionPane.showInputDialog("Enter value c for a quadratic equation"));

        System.out.println("The x component of this triangle is " + getXComponent(value1, value2));
        System.out.println("The y component of this triangle is " + getYComponent(value1, value2));
        plotLine((int) value3, (int) value4);
        System.out.println(quadratic(value5, value6, value7));
    }
}