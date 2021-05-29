import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HouseOfCardsGUI extends JFrame {
    private static Deck deck;
    private JButton house1Button;
    private JButton house2Button;
    private JButton house3Button;
    private JButton house4Button;
    private JButton startButton;
    private JPanel houseOfCards;

    private JLabel house1Score;
    private JLabel house2Score;
    private JLabel house3Score;
    private JLabel house4Score;
    private JLabel cardInPlayLabel;
    private JLabel playerScoreLable;
    private JLabel deckGetSizeLabel;

    private Card cardInPlay;
    private House house1;
    private House house2;
    private House house3;
    private House house4;

    private static final boolean ACTIVE = true;

    public static boolean checkHouses(House house1, House house2, House house3, House house4){
        if(house1.isActive()!=ACTIVE &&house2.isActive()!=ACTIVE &&house3.isActive()!=ACTIVE&&house4.isActive()!=ACTIVE) return !ACTIVE;
        else return ACTIVE;
    }

    public static String getPlayerScoreGUI(House house1,House house2,House house3,House house4){
        int utilScore = house1.getPlayerScore()+house2.getPlayerScore()+house3.getPlayerScore()+house4.getPlayerScore();
        return String.valueOf(utilScore);
    }


    public HouseOfCardsGUI(String title) {
        super(title);
        this.setBackground(new Color(198,222,207));
        this.setPreferredSize(new Dimension(650,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(houseOfCards);
        this.pack();
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false);
                house1 = new House();
                house2 = new House();
                house3 = new House();
                house4 = new House();
                deck = new Deck();
                deck.shuffle();
                try {
                    cardInPlay = deck.dealCard();
                } catch (StatusException statusException) {
                    statusException.printStackTrace();
                }
                deckGetSizeLabel.setText(String.valueOf(deck.getSize()));
                cardInPlayLabel.setText(cardInPlay.toString());


            }
        });


        house1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkHouses(house1, house2, house3, house4)) {
                    try {
                        if (house1.isActive()) {
                            house1.putCard(cardInPlay);
                            house1Score.setText(String.valueOf((house1.getScore())));
                            deckGetSizeLabel.setText(String.valueOf(deck.getSize()));
                            playerScoreLable.setText(getPlayerScoreGUI(house1,house2,house3,house4));
                            cardInPlay = deck.dealCard();
                            cardInPlayLabel.setText(String.valueOf(cardInPlay));
                            if (deck.getSize()==0){
                                JOptionPane.showMessageDialog(null,"You win :)"+ " your points are:"+ getPlayerScoreGUI(house1,house2,house3,house4));
                                // my adhd drives me crazy i want to eat rest code live at the same time xd just can't sit in one plce nvm
                                //some help)) you can also ues isEmpty() idk i didnt see  such a method in deck class, or  its iniversal for lists?null ok
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"This house is full");
                            house1Button.setEnabled(!ACTIVE);
                        }
                    } catch (StatusException statusException) {
                        statusException.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Game  over!");
                    System.exit(0);
                }
            }
        });
        house2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkHouses(house1, house2, house3, house4)) {
                    try {
                        if (house2.isActive()) {
                            house2.putCard(cardInPlay);
                            house2Score.setText(String.valueOf((house2.getScore())));
                            deckGetSizeLabel.setText(String.valueOf(deck.getSize()));
                            playerScoreLable.setText(getPlayerScoreGUI(house1,house2,house3,house4));
                            cardInPlay = deck.dealCard();
                            cardInPlayLabel.setText(String.valueOf(cardInPlay));
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"This house is full");
                            house2Button.setEnabled(!ACTIVE);
                        }
                    } catch (StatusException statusException) {
                        statusException.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Game over :(");
                    System.exit(0);
                }
            }
        });
        house3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkHouses(house1, house2, house3, house4)) {
                    try {
                        if (house3.isActive()) {
                            house3.putCard(cardInPlay);
                            house3Score.setText(String.valueOf((house3.getScore())));
                            deckGetSizeLabel.setText(String.valueOf(deck.getSize()));
                            playerScoreLable.setText(getPlayerScoreGUI(house1,house2,house3,house4));
                            cardInPlay = deck.dealCard();
                            cardInPlayLabel.setText(String.valueOf(cardInPlay));
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"This house is full");
                            house3Button.setEnabled(!ACTIVE);
                        }
                    } catch (StatusException statusException) {
                        statusException.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Game over :(");
                    System.exit(0);
                }
            }
        });
        house4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkHouses(house1, house2, house3, house4)) {
                    try {
                        if (house4.isActive()) {
                            house4.putCard(cardInPlay);
                            house4Score.setText(String.valueOf((house4.getScore())));
                            deckGetSizeLabel.setText(String.valueOf(deck.getSize()));
                            playerScoreLable.setText(getPlayerScoreGUI(house1,house2,house3,house4));
                            cardInPlay = deck.dealCard();
                            cardInPlayLabel.setText(String.valueOf(cardInPlay));


                        }
                        else {
                            JOptionPane.showMessageDialog(null,"This house is full");
                            house4Button.setEnabled(!ACTIVE);
                        }
                    } catch (StatusException statusException) {
                        statusException.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Game over :(");
                    System.exit(0);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new HouseOfCardsGUI("House of cards");
        frame.setVisible(true);


    }
}
