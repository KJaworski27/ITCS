public class BingoCardTester 
{
    public static void main(String[] args)
    {
        BingoCard[] cards = new BingoCard[3];

        for(int i = 0; i < cards.length; i ++)
        {
            cards[i] = new BingoCard();
            cards[i].displayCard();
            System.out.print("\n \n \n");
        }
    }
}
