import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
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

	@Override
	public void actionPerformed(ActionEvent e) {

	}
	GUI(){
		this.setTitle("House of cards");

		contentPanel = (JPanel) this.getContentPane();

		mainPanel = new JPanel();
		buttonPanel = new JPanel();

		bt1 = new JButton("House I");
		bt2 = new JButton("House II");
		bt3 = new JButton("House III");
		bt4 = new JButton("House IV");

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
}