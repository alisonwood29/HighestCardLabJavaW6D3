import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDealer {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        dealer = new Dealer("Manny");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void dealerHasName(){
        assertEquals("Manny", dealer.getName());
    }

    @Test
    public void deckIsPopulated(){
        assertEquals(52, deck.cardCount());
    }

}
