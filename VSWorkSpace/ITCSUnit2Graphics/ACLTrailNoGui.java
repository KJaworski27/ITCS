import java.util.ArrayList;
import java.util.Scanner;

public class ACLTrailNoGui 
{
    private static final int trailLength = 1000000;
    private static Car car;
    private static Scanner s;

    private static int itemAmount;

    private static ArrayList<Shop> startShop = new ArrayList<>();

    public static void startWagon()
    {
        System.out.println("#############################################################\n" +
                           "#                                                           #\n" +
                           "#   Welcome to the ACL Trail!                               #\n" +
                           "#   In this game you will play as someone driving some      #\n" +
                           "#   Students to the academies of loudoun!  Before you       #\n" +
                           "#   start it will be necessary for you to pick some         #\n" +
                           "#   things about your car.                                  #\n" +
                           "#                                                           #\n" +
                           "#############################################################\n"
                           );  
        System.out.print("input a key to continue");
        s.nextLine();

        System.out.println("First off, you'll need some people for your car");
        while(true)
        {
            System.out.print("How many people will be in your car? ");
            int passengerNumber = s.nextInt();
            if(passengerNumber > 4)
            {
                System.out.println("Your car isn't that big.  4 or less people please!");
            }else
            {
                for(int i = 0; i < passengerNumber; i++)
                {
                    car.getPassengers().add(new Passenger());
                }
                break;
            }
        }
        System.out.print("\n \n \n \n Great! ");
        for(int i = 0; i < car.getPassengers().size(); i++)
        {
            System.out.print("What is the name of passenger " + (i + 1) + "? ");
            car.getPassengers().get(i).setName(s.next());
            
        }
        System.out.print("\n \n \n \n Great! ");
        while(true)
        {
            System.out.println("What is your job?");
            System.out.println("1. College Student");
            System.out.println("2. Mickey-D's line cook");
            System.out.println("3. Average joe at generic IT company");
            System.out.println("4. High-profile office worker");
            System.out.println("5. Oil prince");
            System.out.print("pick a number: ");

            int jobNumber = 0;
            
            jobNumber = s.nextInt();

            if(jobNumber > 5)
            {
                System.out.println("Hey, buddy, there's not that many jobs listed.");
            }else
            {
                car.setJob(jobNumber);
                car.setMoney(car.getJob() * 500);
                break;
            }
        }
        
        System.out.println(car.getJob());
        System.out.println(car.getMoney());

        buyWheels(0);
    }

    public static void buyWheels(int shopNumber)
    {
        System.out.println("You have " + car.getMoney() + " Dollars");
        System.out.print("How many spare wheels will you buy at $" + startShop.get(shopNumber).getWheelPrice());
        itemAmount = s.nextInt();

        car.setSpareWheels(car.getSpareWheels() + itemAmount);
        car.setMoney(car.getMoney() - itemAmount * startShop.get(shopNumber).getWheelPrice());

        System.out.println(car.getSpareWheels() + ", " + car.getMoney());
    }
    public static void buyTires(int shopNumber)
    {
        System.out.println("You have " + car.getMoney() + " Dollars");
        System.out.print("How many spare wheels will you buy at $" + startShop.get(shopNumber).getWheelPrice());
        itemAmount = s.nextInt();

        car.setSpareWheels(car.getSpareWheels() + itemAmount);
        car.setMoney(car.getMoney() - itemAmount * startShop.get(shopNumber).getWheelPrice());

        System.out.println(car.getSpareWheels() + ", " + car.getMoney());
    }
    public static void buyFood(int shopNumber)
    {
        System.out.println("You have " + car.getMoney() + " Dollars");
        System.out.print("How many spare wheels will you buy at $" + startShop.get(shopNumber).getWheelPrice());
        itemAmount = s.nextInt();

        car.setSpareWheels(car.getSpareWheels() + itemAmount);
        car.setMoney(car.getMoney() - itemAmount * startShop.get(shopNumber).getWheelPrice());

        System.out.println(car.getSpareWheels() + ", " + car.getMoney());
    }

    public static void main(String[] args)
    {
        startShop.add(new Shop());
        car = new Car();
        s = new Scanner(System.in);

        startWagon();
    }
}
