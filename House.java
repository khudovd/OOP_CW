import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Card> house = new ArrayList<Card>();
    private int score;
    private static final int HOUSE_LIMIT = 31;
    private boolean active;
    private int playerScore;

    public House() {
        house = new ArrayList<Card>();
        score = 0;
        active = true;
        playerScore = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getScore() {
        return score;
    }

    public boolean isActive() {
        return active;
    }

    public void checkStatus() {
        if (score > 31) active = false;
        else if (score == 31){
            house.clear();
            score  = 0;
            playerScore+=100;
        }
        else active = true;
    }
    public void putCard(Card card) throws StatusException{
        if (active) {
            house.add(card);
            score += card.getScore();
            checkStatus();
        }
        else throw new StatusException("This house is full!");
    }


    @Override
    public String toString() {
        return "House{" +
                "house=" + house +
                ", score=" + score +
                ", HOUSE_LIMIT=" + HOUSE_LIMIT +
                ", active=" + active +
                '}';
    }
}
