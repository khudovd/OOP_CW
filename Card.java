public class Card{
//Attributes

    private String power;
    private String suit;
    private int Score;

// consturctors

    public Card(String power, String suit){
        this.power=power;
        this.suit=suit;
        setScore(power);

    }

    public Card() {
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

    public int getScore() {
        return Score;
    }

    public void setScore(String power){
        if (power == "A"){
            this.Score = 11;
        }
        else if (power == "J"|| power == "Q"||power == "K"){
            this.Score = 10;
        }
        else{
            this.Score = Integer.parseInt(power);
        }


    }



    @Override
    public String toString() {
        return power +" of "+ suit;
    }

}
