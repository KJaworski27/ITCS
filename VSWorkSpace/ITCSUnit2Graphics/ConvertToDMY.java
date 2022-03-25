import java.util.Scanner;

@SuppressWarnings("unused")
public class ConvertToDMY
{
    public static String convert(int daysCount)
    {
        int years = daysCount/365;
        int months = (daysCount % (years * 365)) / 30;
        int days = daysCount % ((years * 365) + (months * 30));
        return daysCount + " days is: " + years + " years, " + months + " months and " + days + " days";
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number of days");
        int daysInput = s.nextInt();

        System.out.println(convert(daysInput));

        s.close();
    }
}
