import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private HashMap<String, Integer> playedHands;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
        this.playedHands = new HashMap<>();
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
            Card card = deck.removeCard();
            player.addCard(card);
        }
    }

    public void addToMap(){
        deck.populate();
        Player player1 = new Player("Joe");
        Player player2 = new Player("Alison");
        addPlayer(player1);
        addPlayer(player2);
        deal();
        for (Player player: players){
            int score =
            playedHands.put(player.getName(), player.)
        }

}

}
