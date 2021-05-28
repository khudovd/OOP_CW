import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener throws StatusException{
	
	House house1;
	House house2;
	House house3;
	House house4;
	Card cardInPlay;
	
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

	/*@Override
	public void actionPerformed(ActionEvent e) {
		
	}*/
	GUI(){
		this.setTitle("House of cards");

		house1 = new House();
		house2 = new House();
		house3 = new House();
		house4 = new House();
		cardInPlay = new Card();
		
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
	public void actionPerformed (ActionEvent evt){
		String action = evt.getActionCommand();
		if(action.equals("House I")){
			if (house1.isActive()) 
			{
				try 
				{
					house1.putCard(cardInPlay);
                    System.out.println(houseI.getScore() + " is score after u put card");
                    break;
                }
				catch (StatusException e) 
				{
                        System.out.println("Pick different house");
                }
			}
		}
		else if(action.equals("House II")){
			
		}
		else if(action.equals("House III")){
			
		}
		else if(action.equals("House IV")){
			
		}
	}
}