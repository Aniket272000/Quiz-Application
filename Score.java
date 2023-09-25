package QuizeApplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {

	JLabel qno;
	JButton submit;
	
	Score(String name,int score)
	{
		ImageIcon i1=new ImageIcon("icons/score.png");
		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 200, 300, 250);
		add(image);
		
		JLabel heading=new JLabel("Thankyou "+name+"  for playing simple minds");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font("Tahoma",Font.BOLD,28));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel lblscore=new JLabel("Your Score is "+score);
		lblscore.setBounds(350, 200, 300, 30);
		lblscore.setFont(new Font("Tahoma",Font.BOLD,28));
		lblscore.setForeground(Color.BLUE);
		add(lblscore);
		
		
		submit=new JButton("Play Again");
		submit.setBounds(380, 270, 200, 30);
		submit.setFont(new Font("Railway",Font.PLAIN,22));
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setBounds(400,150,750,550);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			setVisible(false);
			
			new Login();
		
		
		
	}
	
	public static void main(String[] args) {
		new Score("User",0);

	}

	

}
