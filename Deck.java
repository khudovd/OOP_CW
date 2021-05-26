import java.util.ArrayList;
import java.util.List;


public class Deck {
//Attributes
    List<Deck> cards = new ArrayList<Deck>();


// methods



//getter & setter
    public List<Deck> getCards() {
        return cards;
    }

    public void setCards(List<Deck> cards) {
        this.cards = cards;
    }
}
