package cardgameweek4;

import cardgameweek4.UnoCard.Suit;
import cardgameweek4.UnoCard.Value;
import java.util.Random;

/**
 * A class that models the Card Hand. A Card hand has an array of cards. 
 * How can you change the size of the hand?
 *
 * @author dancye, 2019.
 * @modified Fuwad Oladega Jan 2023
 */

public class CardHandGenerator 
{

    /**
     * Generates a hand of a given size
     */
    public static UnoCard[] generateHand()
    {
       
        int handSize=60;
        // let's get these lengths once
        int d=0;
        UnoCard[] hand = new UnoCard[handSize];
        
        for (UnoCard.Suit Suit: UnoCard.Suit.values())
        {
            for(UnoCard.Value Value: UnoCard.Value.values())
            {
                hand[d]= new UnoCard(Suit,Value);
                d++;
            
            }   
        }
           return hand;
        
    }
}
