package QuizeApplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JButton rules,back;
	JTextField tfname;
	Login()
	{
		ImageIcon i1=new ImageIcon("icons/login.jpeg");
		JLabel image=new JLabel(i1);
		image.setBounds(0, 0, 500, 500);
		add(image);
		
		JLabel heading=new JLabel("Simple Minds");
		heading.setBounds(750, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel name=new JLabel("Enter your name ");
		name.setBounds(810, 150, 300, 20);
		name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
		name.setForeground(Color.BLUE);
		add(name);
		
		tfname=new JTextField();
		tfname.setBounds(735, 200, 300, 25);
		tfname.setFont(new Font("Railway",Font.BOLD,20));
		add(tfname);
		
		rules=new JButton("Start");
		rules.setBounds(735, 270, 120, 25);
		rules.setBackground(Color.cyan);
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(915, 270, 120, 25);
		back.setBackground(Color.cyan);
		back.addActionListener(this);
		add(back);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		setSize(1200,500);
		setVisible(true);
		setLocation(250,200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rules)
		{
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
			
		}else if(e.getSource()==back)
		{
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		
		new Login();
	}

	

}
