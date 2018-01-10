import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }


    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deal() {
        deck.populate();
        Collections.shuffle(deck.cards);
        for(Player player: players) {
            player.addCard(deck.removeCard());
        }
    }
}
