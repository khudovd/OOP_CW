import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
//Attributes
    List<Card> deck = new ArrayList<Card>();
//    private Object Card;


// methods



//getter & setter
    public int getSize(){
        return deck.toArray().length;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void putCard(Card card){
        deck.add(card);
    }
    public Card dealCard() throws StatusException {
        if (deck.toArray().length>0) {
            Card temp = new Card();
            temp = deck.get(0);
            deck.remove(0);
            return temp;
        }
        else throw new StatusException("Out of cards!");
    }

}
