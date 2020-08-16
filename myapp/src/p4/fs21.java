package p4;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs21 extends JFrame implements ActionListener{
	JLabel l1,l2;
	JButton b;
	ImageIcon i;
	fs21()
	{
	   
			Container con=getContentPane();
			l1=new JLabel("THANK YOU");
			i=new ImageIcon("");
			l2=new JLabel(i);
			 l2.setLayout(null);
			b=new JButton("Home Page");
			l1.setFont(new Font("Arial", Font.BOLD, 80));
			b.setFont(new Font("Arial", Font.BOLD, 20));
			l1.setBounds(450,10,1500,200);
		l2.setBounds(1,1,1500,1500);
		b.setBounds(550,500,200,50);
			b.addActionListener(this);
			l2.add(l1);
			
			l2.add(b);
			con.add(l2);
			
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
		 new fs0();
	 }
	
	}


