import java.util.ArrayList;
import java.util.List;


public class Deck {
//Attributes
    List<Deck> cards = new ArrayList<Deck>();


// methods

    public void Deck(){
        String[] StringArray = new String[]{ "A","2","3","4","5","7","6","8","9","10","J","Q","K" };
        String[] StringArray2 = new String[]{ "Hearts","Diamonds","Clubs ","Spades"};
        for(int i = 1; i == 4; i++){
            for(int j = 1; j == 13; j++){
                createCard()
            }
        }

    }

//getter & setter
    public List<Deck> getCards() {
        return cards;
    }

    public void setCards(List<Deck> cards) {
        this.cards = cards;
    }
}
