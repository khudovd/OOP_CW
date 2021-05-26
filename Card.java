

public class Card implements Creation {
//Attributes

    private String power;
    private String suit;
    private int Score;

//A=11
//jqk=10
//else =8
// methods

    public void createCard(String power, String suit){
        setPower(power);
        setSuit(suit);
        setScore(power);

    }

    @Override
    public void createCard(int power, String suit) {

    }

    public void createCard(){
        this.power = "0";
        this.suit = null;
    }

    public void setScore(String power){
        if (power == "A"){
            this.Score = 11;
        }
        else if (power == "J"|| power == "Q"||power == "K"){
            this.Score = 10;
        }
        else{
            this.Score = 8;
        }


    }

//getter & setter
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
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
