package cardgameweek4;

/**
 * A class to handle the user interaction for the Card project. Contains a main method that generates a card hand and
 * then iterates over it to print its contents to the console.
 *
 * @author dancye, 2019
 * @modified Fuwad Oladega Jan 2023
 */
public class GamePlayer
{

    public static void main(String[] args)
    {
        CardHandGenerator ins=new CardHandGenerator();
        
       // UnoCard[] cardHand = CardHandGenerator.generateHand(60);
        for (UnoCard card : ins.generateHand ()) 
        {
            System.out.println(card.getValue() + "  " + card.getSuit());
        }
    }

}
