import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HouseOfCards {

    public static void main(String[] args) throws StatusException {
        House houseI = new House();
        House houseII = new House();
        House houseIII = new House();
        House houseIV = new House();
        Deck deck = new Deck();
        System.out.println(deck.toString());
        Card cardInPlay = new Card();
        cardInPlay = deck.dealCard();
        houseI.putCard(cardInPlay);
        System.out.println(houseI.getScore());
    }
}