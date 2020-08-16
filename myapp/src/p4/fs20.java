package p4;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs20 extends JFrame implements ItemListener,ActionListener{
	JRadioButton c1,c2,c3,c4,c5;
	JButton b;
	fs20()
	{
		Container Con=getContentPane();
		setLayout(null);
		c1=new JRadioButton("Excellent");
		c2=new JRadioButton("Very Good");
		c3=new JRadioButton("Good");
		c4=new JRadioButton("Average");
		c5=new JRadioButton("Could Be Better");
		ButtonGroup bg=new ButtonGroup();
		bg.add(c1);
		bg.add(c2);
		bg.add(c3);
		bg.add(c4);
		bg.add(c5);
		b=new JButton("Submit");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		b.addActionListener(this);
		c1.setFont(new Font("Arial", Font.BOLD, 15));
		c2.setFont(new Font("Arial", Font.BOLD, 15));
		c3.setFont(new Font("Arial", Font.BOLD, 15));
		c4.setFont(new Font("Arial", Font.BOLD, 15));
		c5.setFont(new Font("Arial", Font.BOLD, 15));
		c1.setBounds(550,200,200,30);
		c2.setBounds(550,235,200,30);
		c3.setBounds(550,270,200,30);
		c4.setBounds(550,305,200,30);
		c5.setBounds(550,340,200,30);
		b.setBounds(550,400,200,30);
		Con.setBackground(Color.pink);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(b);
		setVisible(true);
		setSize(1500,1500);
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		new fs21();
	}

}
