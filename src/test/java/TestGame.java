import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        deck = new Deck();
        game = new Game(deck);
        player1 = new Player("Joe");
        player2 = new Player("Alison");
        player3 = new Player("Manny");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

    }

    @Test
    public void deckIsPopulated(){
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canAddPlayerToGame(){
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());

    }

    @Test
    public void canDeal(){
        game.deal();
        assertEquals(1, player1.handCardCount());
        assertEquals(1, player2.handCardCount());
        assertEquals(49, deck.cardCount());
    }




}
