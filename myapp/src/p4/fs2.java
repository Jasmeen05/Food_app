package p4;
import java.sql.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fs2 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1;
	JTextField t1,t2,t3,t4,t5,t6;
	ImageIcon i2;
fs2()
{
	
	Container Con=getContentPane();
	i2=new ImageIcon("images//gg.jpg");
	l8=new JLabel(i2);


	l8.setLayout(null);
	l1=new JLabel("Name");
	t1=new JTextField(14);
	l2=new JLabel("Address");
	t2=new JTextField(14);
	
	l3=new JLabel("Phone no");
	t3=new JTextField(14);
	l4=new JLabel("Email id");
	t4=new JTextField(14);
	l5=new JLabel("Username");
	t5=new JTextField(14);
	l6=new JLabel("Password");
	t6=new JPasswordField(14);
	
	
	b1=new JButton("SAVE");
	l7=new JLabel("");
	l1.setFont(new Font("Arial", Font.BOLD, 20));
	l2.setFont(new Font("Arial", Font.BOLD, 20));
	l3.setFont(new Font("Arial", Font.BOLD, 20));
	l4.setFont(new Font("Arial", Font.BOLD, 20));
	l5.setFont(new Font("Arial", Font.BOLD, 20));
	l6.setFont(new Font("Arial", Font.BOLD, 20));
	
	
	b1.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);
	t4.addActionListener(this);
	t5.addActionListener(this);
	t6.addActionListener(this);
	
	l1.setBounds(500,50,100,30);
	t1.setBounds(650,50,100,30);
	l2.setBounds(500,150,100,30);
	t2.setBounds(650,150,100,30);
	l3.setBounds(500,250,100,30);
	t3.setBounds(650,250,100,30);
	l4.setBounds(500,350,100,30);
	t4.setBounds(650,350,100,30);
	l5.setBounds(500,450,100,30);
	t5.setBounds(650,450,100,30);
	l6.setBounds(500,550,100,30);
	t6.setBounds(650,550,100,30);
	l7.setBounds(500,650,100,30);
	b1.setBounds(650,650,100,30);
	l8.setBounds(0,0,1500,1500);

	l8.add(l1);
	l8.add(t1);
	l8.add(l2);
	l8.add(t2);
	l8.add(l3);
	l8.add(t3);
	l8.add(b1);
	l8.add(l4);
	l8.add(t4);
	l8.add(l5);
	l8.add(t5);
	l8.add(l6);
	l8.add(t6);
	l8.add(l7);
	
	Con.add(l8);
	
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
			if(ae.getActionCommand().equals("SAVE"))
			{
				new fs1();
			}
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_swing","root","root");
		Statement stm=con.createStatement();
		String n=t1.getText();
		String add=t2.getText();
		String ph=t3.getText();
		long f=Long.parseLong(ph);
		String email=t4.getText();
		String user=t5.getText();
		String pass=t6.getText();
	
		stm.executeUpdate("insert into signup values(null,'"+n+"','"+add+"','"+f+"','"+email+"','"+user+"','"+pass+"')");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	
	
}




