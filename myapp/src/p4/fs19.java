package p4;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs19 extends JFrame implements ActionListener{
 JLabel l1;
 JButton b;
 fs19()
 {
	    setLayout(null);
		Container con=getContentPane();
		l1=new JLabel("ORDER PLACED!!");
		
		b=new JButton("NEXT");
		l1.setFont(new Font("Arial", Font.BOLD, 80));
		b.setFont(new Font("Arial", Font.BOLD, 30));
		l1.setBounds(350,150,1500,200);
	
	b.setBounds(600,400,150,50);
		b.addActionListener(this);
		add(l1);
		
		add(b);
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
	 new fs20();
 }
 

}
