import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class loopTest {

    private static final boolean active = true;

    public static boolean checkHouses(House house1, House house2, House house3, House house4){
        if(house1.isActive()!=active&&house2.isActive()!=active&&house3.isActive()!=active&&house4.isActive()!=active) return !active;
        else return  active;
    }

    public static void main(String[] args) throws StatusException {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        House houseI = new House();
        House houseII = new House();
        House houseIII = new House();
        House houseIV = new House();

        //Hearts:
        Card h1 = new Card("A","Hearts");
        Card h11 = new Card("J","Hearts");
        Card h12 = new Card("Q","Hearts");
        Card h13 = new Card("K","Hearts");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Hearts");
            deck.putCard(card);
        }
        deck.putCard(h1);
        deck.putCard(h11);
        deck.putCard(h12);
        deck.putCard(h13);


        //Diamonds:
        Card d1 = new Card("A","Diamonds");
        Card d11 = new Card("J","Diamonds");
        Card d12 = new Card("Q","Diamonds");
        Card d13 = new Card("K","Diamonds");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Diamonds");
            deck.putCard(card);
        }
        deck.putCard(d1);
        deck.putCard(d11);
        deck.putCard(d12);
        deck.putCard(d13);

        //Clubs
        Card c1 = new Card("A","Clubs");
        Card c11 = new Card("J","Clubs");
        Card c12 = new Card("Q","Clubs");
        Card c13 = new Card("K","Clubs");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Clubs");
            deck.putCard(card);
        }
        deck.putCard(c1);
        deck.putCard(c11);
        deck.putCard(c12);
        deck.putCard(c13);

        //Spades:
        Card s1 = new Card("A","Spades");
        Card s11 = new Card("J","Spades");
        Card s12 = new Card("Q","Spades");
        Card s13 = new Card("K","Spades");
        for (int i =2;i<11;i++){
            Card card = new Card(Integer.toString(i),"Spades");
            deck.putCard(card);
        }
        deck.putCard(s1);
        deck.putCard(s11);
        deck.putCard(s12);
        deck.putCard(s13);

        deck.shuffle();
        System.out.println(deck.toString());
        Card cardInPlay = new Card();

        while(deck.getSize()>0){
            cardInPlay = deck.dealCard();

            System.out.println("Your card is"+cardInPlay.toString());
            System.out.println("House I-"+ houseI.getScore()+" House II-"+ houseII.getScore()+" House III-"+ houseIII.getScore()+" House IV-"+ houseIV.getScore());
            System.out.println("Player score is:" + (houseI.getPlayerScore()+houseII.getPlayerScore()+houseIII.getPlayerScore()+houseIV.getPlayerScore()));
            System.out.println("Please pick house to put the card in");
            if(checkHouses(houseI,houseII,houseIII,houseIV)) {
                int turn  = sc.nextInt();
                switch (turn) {
                    case 1:
                        if (houseI.isActive()) {
                            try {
                                houseI.putCard(cardInPlay);
                                System.out.println(houseI.getScore() + " is score after u put card");
                                break;
                            } catch (StatusException e) {
                                System.out.println("Pick different house");
                            }
                        }
                    case 2:
                        if (houseII.isActive()) {
                            try {
                                houseII.putCard(cardInPlay);
                                System.out.println(houseII.getScore() + " is score after u put card");
                                break;
                            } catch (StatusException e) {
                                System.out.println("Pick different house");
                            }
                        }
                    case 3:
                        if (houseIII.isActive()) {
                            try {
                                houseIII.putCard(cardInPlay);
                                System.out.println(houseIII.getScore() + " is score after u put card");
                                break;
                            } catch (StatusException e) {
                                System.out.println("Pick different house");
                            }
                        }
                    case 4:
                        if (houseIV.isActive()) {
                            try {
                                houseIV.putCard(cardInPlay);
                                System.out.println(houseIV.getScore() + " is score after u put card");
                                break;
                            } catch (StatusException e) {
                                System.out.println("Pick different house");
                            }
                        }
                }
            }
            else{
                System.out.println("Game over");
                System.out.println("Bye bye!!1111 LTPnig");
                break;
            }
        }
    }
}
