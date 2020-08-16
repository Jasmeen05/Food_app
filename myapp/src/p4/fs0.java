package p4;
import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs0 extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JButton b1;
	fs0()
	{ Container con=getContentPane();
		setLayout(null);
		l1=new JLabel("FOOD SWING");
		l2=new JLabel(" ");
		l3=new JLabel("It Can Tackle All Your Mood Swings");
		b1=new JButton("GO");
		l1.setFont(new Font("Arial", Font.BOLD, 100));
		l3.setFont(new Font("Arial", Font.ITALIC, 35));
l1.setBounds(300,50,700,200);
l2.setBounds(300,50,700,50);
l3.setBounds(330,300,1000,100);
b1.setBounds(590,450,100,50);
con.setBackground(Color.pink);
l1.setForeground(Color.white);
l3.setForeground(Color.white);
b1.addActionListener(this);
add(l1);
add(l2);
add(l3);
add(b1);
setVisible(true);
setSize(1500,1500);
addWindowListener(new WindowAdapter() {
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
});
	}
	public void actionPerformed(ActionEvent ae)
	{
		try {
			new fs1();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	public static void main(String s[])
	{
		fs0 ob1=new fs0();
		
		
	}
	}


