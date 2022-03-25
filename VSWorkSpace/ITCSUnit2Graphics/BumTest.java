import java.util.Scanner;
public class BumTest
{
    public static final String[] bumlist = 
    {
        "emily", 
        "brayden", 
        "hayden", 
        "rory", 
        "kennedy", 
        "ray",
        "ryan",
        "rowhan"
    };


    public static String isBum(String string)
    {
        for(int i = 0; i < bumlist.length; i ++)
        {
            if(string.equalsIgnoreCase(bumlist[i]))
            {
                return string + " is a bum!";
            }
        }
        return string + " is not a bum!";
        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = s.nextLine();
        System.out.println(isBum(name));

        s.close();
    }
}