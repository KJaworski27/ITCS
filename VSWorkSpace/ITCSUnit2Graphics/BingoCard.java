import java.util.ArrayList;

public class BingoCard 
{
    private String[][] cardVals = new String[6][5];

    
    public BingoCard()
    {
        generateCard();
    }


    public void generateCard()
    {
        cardVals[0][0] = "B\t";
        cardVals[0][1] = "I\t";
        cardVals[0][2] = "N\t";
        cardVals[0][3] = "G\t";
        cardVals[0][4] = "O\t";

        for(int i = 1; i < 6; i ++)
        {
            for(int j = 0; j < 5; j++)
            {
                cardVals[i][j] = ((int) (Math.random() * 15)) + (j) * 15 + "\t";
            }
        }

        cardVals[3][2] = "F\t";
    }

    public void displayCard()
    {
        for(int i = 0; i < 6; i ++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(cardVals[i][j]);
            }
            System.out.print("\n");
        }
    }

}
