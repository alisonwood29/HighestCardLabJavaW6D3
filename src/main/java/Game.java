import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        Player player1 = new Player("Joe");
        Player player2 = new Player("Alison");
        Player player3 = new Player("Manny");
        this.players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }



    public void deal() {
        deck.populate();
        Collections.shuffle(deck.cards);
        for(Player player: players) {
            player.addCard(deck.removeCard());
        }

    }
}
