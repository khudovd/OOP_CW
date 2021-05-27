import java.util.ArrayList;
import java.util.List;

public class loopTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Hearts");
            deck.putCard(card);
        }
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Diamonds");
            deck.putCard(card);
        }
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Clubs");
            deck.putCard(card);
        }
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Spades");
            deck.putCard(card);
        }
        System.out.println(deck.toString());
    }
}
