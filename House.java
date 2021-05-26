import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Card> house = new ArrayList<Card>();
    private int score;
    private final int HOUSE_LIMIT = 31;
    private boolean active;

    public House() {
        house = new ArrayList<Card>();
        score = 0;
        active = true;


    }

    public int getScore() {
        return score;
    }

    public void setScore(Card card) {


    }

    public boolean isActive() {
        return active;
    }

    public void setActive() {
        if (score > 31) active = false;
        else active = true;
    }
    public void putCard(Card card){
        house.add(card);
        score+= card.getScore();
        setActive();
    }
}
