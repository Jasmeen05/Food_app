package p4;
import java.sql.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs1 extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	JTextField t1,t2;
	ImageIcon i1;
fs1()
{
	
	Container Con=getContentPane();
	i1=new ImageIcon("images//gg.jpg");
	l5=new JLabel(i1);


	l5.setLayout(null);
	l1=new JLabel("Username");
	t1=new JTextField(14);
	l2=new JLabel("Password");
	t2=new JPasswordField(14);
	
	l3=new JLabel(" ");
	b1=new JButton("Login");
	l4=new JLabel(" ");
	b2=new JButton("Sign up");
	
	
	b1.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	b2.addActionListener(this);
	l1.setBounds(550,150,70,30);
	t1.setBounds(630,150,100,30);
	l2.setBounds(550,210,70,30);
	t2.setBounds(630,210,100,30);
	l3.setBounds(550,270,70,30);
	b1.setBounds(630,270,100,30);
	l4.setBounds(550,330,70,30);
	b2.setBounds(630,330,100,30);
	l5.setBounds(0,0,1500,1500);
	l5.add(l1);
	l5.add(t1);
	l5.add(l2);
	l5.add(t2);
	l5.add(l3);
	l5.add(b1);
	l5.add(l4);
	l5.add(b2);
	Con.add(l5);
	
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
			if(ae.getActionCommand().equals("Sign up"))
			{
			new fs2();
		}
			else {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_swing","root","root");
		Statement stm=con.createStatement();
		String user=t1.getText();
		String pass=t2.getText();
	
		ResultSet rs=stm.executeQuery("select * from signup where Username='"+user+"' and Password='"+pass+"'");
		while(rs.next())
		{
			new fs3();
		}if(rs.getRow()<0)
		{
			JOptionPane.showInputDialog("Your Username or Password is Incorrect");
		}}}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	
	
}

