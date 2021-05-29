import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{

	House houseI;
	House houseII;
	House houseIII;
	House houseIV;
	Card cardInPlay;
	Deck deck;

	JPanel contentPanel;
	JPanel mainPanel;
	JPanel buttonPanel;

	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;

	JTextField tf1;
	JTextField tf2;

	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;

	private final boolean active = true;

	/*@Override
	public void actionPerformed(ActionEvent e) {

	}*/
	public  boolean checkHouses(House house1, House house2, House house3, House house4){
		if(houseI.isActive()!=active&&houseII.isActive()!=active&&houseIII.isActive()!=active&&houseIV.isActive()!=active) return !active;
		else return  active;
	}

	GUI(){
		this.setTitle("House of cards");

		houseI = new House();
		houseII = new House();
		houseIII = new House();
		houseIV = new House();
		cardInPlay = new Card();
		deck = new Deck();

		contentPanel = (JPanel) this.getContentPane();

		mainPanel = new JPanel();
		buttonPanel = new JPanel();

		bt1 = new JButton("House I");
		bt1.addActionListener(this);
		bt2 = new JButton("House II");
		bt2.addActionListener(this);
		bt3 = new JButton("House III");
		bt3.addActionListener(this);
		bt4 = new JButton("House IV");
		bt4.addActionListener(this);

		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();

		mainPanel.setLayout(new GridLayout(4,2));

		mainPanel.add(lb1);
		mainPanel.add(lb2);
		mainPanel.add(lb3);
		mainPanel.add(lb4);

		buttonPanel.add(bt1);
//		bt1.addActionListener(new java.awt.event.ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				bt1_actionPerformed(e);
//			}
//		});
		buttonPanel.add(bt2);
		buttonPanel.add(bt3);
		buttonPanel.add(bt4);

		contentPanel.add(mainPanel,BorderLayout.CENTER);
		contentPanel.add(buttonPanel,BorderLayout.SOUTH);

	}
	public void actionPerformed (ActionEvent evt) {
		String action = evt.getActionCommand();
		System.out.println(deck.toString());
		lb1.setText("Your card is" + cardInPlay.toString());
		lb2.setText("House I-" + houseI.getScore() + " House II-" + houseII.getScore() + " House III-" + houseIII.getScore() + " House IV-" + houseIV.getScore());
		lb3.setText("Player score is:" + (houseI.getPlayerScore() + houseII.getPlayerScore() + houseIII.getPlayerScore() + houseIV.getPlayerScore()));
		lb4.setText("Please pick house to put the card in");
		if (checkHouses(houseI, houseII, houseIII, houseIV)) {
			if (action.equals("House I")) {
				if (houseI.isActive()) {
					try {
						houseI.putCard(cardInPlay);
						System.out.println(houseI.getScore() + " is score after u put card");
					} catch (StatusException e) {
						System.out.println("Pick different house");
					}
				}
			} else if (action.equals("House II")) {
				if (houseII.isActive()) {
					try {
						houseII.putCard(cardInPlay);
						System.out.println(houseII.getScore() + " is score after u put card");
					} catch (StatusException e) {
						System.out.println("Pick different house");
					}
				}

			} else if (action.equals("House III")) {
				if (houseIII.isActive()) {
					try {
						houseIII.putCard(cardInPlay);
						System.out.println(houseIII.getScore() + " is score after u put card");
					} catch (StatusException e) {
						System.out.println("Pick different house");
					}
				}

			} else if (action.equals("House IV")) {
				if (houseIV.isActive()) {
					try {
						houseIV.putCard(cardInPlay);
						System.out.println(houseIV.getScore() + " is score after u put card");
					} catch (StatusException e) {
						System.out.println("Pick different house");
					}
				}

			}
		} else System.out.println("Gameover");
	}
}
