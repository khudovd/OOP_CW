import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HouseOfCards {
    
    public static void main(String[] args) {

        JFrame f = new GUI();
        f.pack();
        f.setVisible(true);

        Card h1 = new Card("A","Hearts");
        Card h2 = new Card("2","Hearts");
        Card h3 = new Card("3","Hearts");
        Card h4 = new Card("4","Hearts");
        Card h5 = new Card("5","Hearts");
        Card h6 = new Card("6","Hearts");
        Card h7 = new Card("7","Hearts");
        Card h8 = new Card("8","Hearts");
        Card h9 = new Card("9","Hearts");
        Card h10 = new Card("10","Hearts");
        Card h11 = new Card("J","Hearts");
        Card h12 = new Card("Q","Hearts");
        Card h13 = new Card("K","Hearts");

        Card d1 = new Card("A","Diamonds");
        Card d2 = new Card("2","Diamonds");
        Card d3 = new Card("3","Diamonds");
        Card d4 = new Card("4","Diamonds");
        Card d5 = new Card("5","Diamonds");
        Card d6 = new Card("6","Diamonds");
        Card d7 = new Card("7","Diamonds");
        Card d8 = new Card("8","Diamonds");
        Card d9 = new Card("9","Diamonds");
        Card d10 = new Card("10","Diamonds");
        Card d11 = new Card("J","Diamonds");
        Card d12 = new Card("Q","Diamonds");
        Card d13 = new Card("K","Diamonds");


        Card c1 = new Card("A","Clubs");
        Card c2 = new Card("2","Clubs");
        Card c3 = new Card("3","Clubs");
        Card c4 = new Card("4","Clubs");
        Card c5 = new Card("5","Clubs");
        Card c6 = new Card("6","Clubs");
        Card c7 = new Card("7","Clubs");
        Card c8 = new Card("8","Clubs");
        Card c9 = new Card("9","Clubs");
        Card c10 = new Card("10","Clubs");
        Card c11 = new Card("J","Clubs");
        Card c12 = new Card("Q","Clubs");
        Card c13 = new Card("K","Clubs");


        Card s1 = new Card("A","Spades");
        Card s2 = new Card("2","Spades");
        Card s3 = new Card("3","Spades");
        Card s4 = new Card("4","Spades");
        Card s5 = new Card("5","Spades");
        Card s6 = new Card("6","Spades");
        Card s7 = new Card("7","Spades");
        Card s8 = new Card("8","Spades");
        Card s9 = new Card("9","Spades");
        Card s10 = new Card("10","Spades");
        Card s11 = new Card("J","Spades");
        Card s12 = new Card("Q","Spades");
        Card s13 = new Card("K","Spades");

        

        Deck deck = new Deck();


        deck.putCard(h1);
        deck.putCard(h2);
        deck.putCard(h3);
        deck.putCard(h4);
        deck.putCard(h5);
        deck.putCard(h6);
        deck.putCard(h7);
        deck.putCard(h8);
        deck.putCard(h9);
        deck.putCard(h10);
        deck.putCard(h11);
        deck.putCard(h12);
        deck.putCard(h13);

        deck.putCard(d1);
        deck.putCard(d2);
        deck.putCard(d3);
        deck.putCard(d4);
        deck.putCard(d5);
        deck.putCard(d6);
        deck.putCard(d7);
        deck.putCard(d8);
        deck.putCard(d9);
        deck.putCard(d10);
        deck.putCard(d11);
        deck.putCard(d12);
        deck.putCard(d13);




        deck.putCard(c1);
        deck.putCard(c2);
        deck.putCard(c3);
        deck.putCard(c4);
        deck.putCard(c5);
        deck.putCard(c6);
        deck.putCard(c7);
        deck.putCard(c8);
        deck.putCard(c9);
        deck.putCard(c10);
        deck.putCard(c11);
        deck.putCard(c12);
        deck.putCard(c13);

        deck.putCard(s1);
        deck.putCard(s2);
        deck.putCard(s3);
        deck.putCard(s4);
        deck.putCard(s5);
        deck.putCard(s6);
        deck.putCard(s7);
        deck.putCard(s8);
        deck.putCard(s9);
        deck.putCard(s10);
        deck.putCard(s11);
        deck.putCard(s12);
        deck.putCard(s13);

        deck.shuffle();

        House houseI = new House();
        House houseII = new House();
        House houseIII = new House();
        House houseIV = new House();
        try {
            houseI.putCard(deck.dealCard());
        }
        catch (StatusException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Card added");

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
