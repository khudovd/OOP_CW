

public class Card implements Creation {
//Attributes

    private int power;
    private String suit;
    private int Score;

//A=11
//jqk=10
//else =8
// methods

    public void createCard(int power, String suit){
        setPower(power);
        setSuit(suit);
        setScore();

    }

    public void createCard(){
        this.power = 0;
        this.suit = null;
    }

    public void setScore()

//getter & setter
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


    @Override
    public String toString() {
        return "{power=" + power + ", Suit=" + suit + "}";
    }

}
