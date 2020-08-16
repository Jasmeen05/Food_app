package p4;
import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs16 extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel l1;
	fs16()
	{
		setLayout(null);
		Container con=getContentPane();
		b1=new JButton("VEG");
		b2=new JButton("NON VEG");
		
		l1=new JLabel("BARBEQUE NATION");
		b3=new JButton("BACK");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		l1.setFont(new Font("Arial", Font.BOLD, 100));
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		
		b1.setForeground(Color.red);
		b2.setForeground(Color.red);
		
		l1.setBounds(200,50,1200,200);
		b1.setBounds(550,270,150,100);
		b2.setBounds(550,400,150,100);
		b3.setBounds(10,20,70,30);
		b3.setFont(new Font("Arial", Font.BOLD, 12));
		add(b3);
		
		add(l1);
		add(b1);
		add(b2);
	
		con.setBackground(Color.pink);
		l1.setForeground(Color.white);
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
			if(ae.getActionCommand().equals("VEG"))
			{
			new fs17();
		}else if(ae.getActionCommand().equals("NON VEG"))
		{
			new fs18();
		}else
		{
			new fs3();
		}
		
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}


