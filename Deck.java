import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    //Attributes
    List<Card> deck = new ArrayList<Card>();
//    private Object Card;

    public Deck(){
        //hearts
        Card h1 = new Card("A","Hearts");
        Card h11 = new Card("J","Hearts");
        Card h12 = new Card("Q","Hearts");
        Card h13 = new Card("K","Hearts");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Hearts");
            deck.add(card);
        }
        deck.add(h1);
        deck.add(h11);
        deck.add(h12);
        deck.add(h13);
        //Diamonds
        Card d1 = new Card("A","Diamonds");
        Card d11 = new Card("J","Diamonds");
        Card d12 = new Card("Q","Diamonds");
        Card d13 = new Card("K","Diamonds");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Diamonds");
            deck.add(card);
        }
        deck.add(d1);
        deck.add(d11);
        deck.add(d12);
        deck.add(d13);

        //Clubs
        Card c1 = new Card("A","Clubs");
        Card c11 = new Card("J","Clubs");
        Card c12 = new Card("Q","Clubs");
        Card c13 = new Card("K","Clubs");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Clubs");
            deck.add(card);
        }
        deck.add(c1);
        deck.add(c11);
        deck.add(c12);
        deck.add(c13);

        //Spades:
        Card s1 = new Card("A","Spades");
        Card s11 = new Card("J","Spades");
        Card s12 = new Card("Q","Spades");
        Card s13 = new Card("K","Spades");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Spades");
            deck.add(card);
        }
        deck.add(s1);
        deck.add(s11);
        deck.add(s12);
        deck.add(s13);

        Collections.shuffle(deck);
    }

// methods



    //getter & setter
    public int getSize(){
        return deck.toArray().length;
    }

    public void shuffle(){
        Collections.shuffle(deck);
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

    @Override
    public String toString() {
        return "Deck is{" +
                "deck=" + deck +
                '}'+deck.toArray().length;
    }
}