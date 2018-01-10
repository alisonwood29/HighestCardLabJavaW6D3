import java.util.ArrayList;

public class Dealer {
    private String name;
    private ArrayList<Deck> deck;

    public Dealer(String name){
        this.name = name;
        this.deck = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }
}
