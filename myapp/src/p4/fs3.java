package p4;
import java.sql.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fs3 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3,b4,b5;
	ImageIcon i1,i2,i3,i4,i5;
	
	
fs3()
{
	
	Container Con=getContentPane();
	setLayout(null);
	l1=new JLabel("RESTAURANTS");
	
	l2=new JLabel("Mc'Donalds");
	
	
	l3=new JLabel("Domino's Pizza");
	
	l4=new JLabel("Subway");
	
	l5=new JLabel("Amrit's");
	
	l6=new JLabel("Barbeque Nation");
	l1.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
	l2.setFont(new Font("Arial", Font.BOLD, 30));
	l3.setFont(new Font("Arial", Font.BOLD, 30));
	l4.setFont(new Font("Arial", Font.BOLD, 30));
	l5.setFont(new Font("Arial", Font.BOLD, 30));
	l6.setFont(new Font("Arial", Font.BOLD, 30));
	i1=new ImageIcon("images//mc.jfif");
	i2=new ImageIcon("images//dm.png");
	i3=new ImageIcon("images//sb.png");
	i4=new ImageIcon("images//am.jfif");
	i5=new ImageIcon("images//bk.jfif");
	
	Con.setBackground(Color.pink);
	
	
	b1=new JButton(".",i1);
	b2=new JButton(" ",i2);
	b3=new JButton(",",i3);
	b4=new JButton("*",i4);
	b5=new JButton("'",i5);
	

	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
	
	l1.setBounds(500,20,500,40);
	b1.setBounds(250,100,250,130);
	l2.setBounds(250,220,250,60);
	b2.setBounds(900,100,250,130);
	l3.setBounds(900,220,250,60);
	b3.setBounds(250,280,250,130);
	l4.setBounds(250,400,250,60);
	b4.setBounds(900,280,250,130);
	l5.setBounds(900,400,250,60);
	b5.setBounds(250,460,250,130);
	l6.setBounds(250,580,250,60);
	

	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	
	
	
	
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
			if(ae.getActionCommand().equals("."))
			{
				new fss3();
			}
			else if(ae.getActionCommand().equals(" "))
			{
				new fs6();
			}
			else if(ae.getActionCommand().equals(","))
			{
				new fs10();
			}
			else if(ae.getActionCommand().equals("*"))
			{
				new fs13();
			}
			else
			{
				new fs16();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	

}





