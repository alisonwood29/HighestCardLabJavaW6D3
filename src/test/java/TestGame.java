import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    Game game;
    Deck deck;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
////        deck.populate();
        game = new Game(deck);
        player = new Player("Alison");

    }

//    @Test
//    public void deckIsPopulated(){
//        assertEquals(52, deck.cardCount());
//    }
    @Test
    public void canDeal(){
        game.deal();
        assertEquals(1, player.handCardCount());
        assertEquals(, deck.cardCount());

    }

}
