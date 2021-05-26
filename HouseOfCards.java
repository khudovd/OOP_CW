import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HouseOfCards {

    public static void main(String[] args) {
        Card AH = new Card("A","Hearts");
        Card AD = new Card("A","Diamonds");
        Card AC = new Card("A","Clubs");
        Card AS = new Card("A","Spades");

        Deck deck = new Deck();

        deck.putCard(AH);
        deck.putCard(AD);
        deck.putCard(AC);
        deck.putCard(AS);

        deck.shuffle();

        House houseI = new House();

        houseI.putCard(deck.dealCard());

        System.out.println(houseI.toString());








//        public void Deck(){
//            String[] StringArray = new String[]{ "A","2","3","4","5","7","6","8","9","10","J","Q","K" };
//            String[] StringArray2 = new String[]{ "Hearts","Diamonds","Clubs ","Spades"};
//            for(int i = 1; i == 4; i++){
//                for(int j = 1; j == 13; j++){
//                    //createCard()
//                }
//            }
//
//        }




    }
}
