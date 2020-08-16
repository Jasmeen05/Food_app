package p4;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fs5 extends JFrame implements ItemListener, ActionListener {
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JCheckBox c1,c2,c3,c4,c5,c6,c7;
JTextField t;
JButton b1,b2,b3;
ImageIcon i1,i2,i3,i4,i5,i6,i7;
fs5()
{
Container Con=getContentPane();
setLayout(null);
i1=new ImageIcon("images//m1.jfif");
i2=new ImageIcon("images//m2.jfif");
i3=new ImageIcon("images//m3.jfif");
i4=new ImageIcon("images//m4.jfif");
i5=new ImageIcon("images//mc5.jpg");
i6=new ImageIcon("images//mc6.jpg");
i7=new ImageIcon("images//mc1.jpg");
l1=new JLabel(i1);
l2=new JLabel(i2);
l3=new JLabel(i3);
l4=new JLabel(i4);
l5=new JLabel(i5);
l6=new JLabel(i6);
l7=new JLabel(i7);
b3=new JButton("BACK");
l8= new JLabel("Total");
t=new JTextField(8);
b1=new JButton("Calculate");
b2=new JButton("Confirm Order");
c1=new JCheckBox("Chicken Burger(85/-)");
c2=new JCheckBox("Chicken Wrap(155/-)");
c3=new JCheckBox("Egg Wrap(132/-)");
c4=new JCheckBox("Chicken Nuggets(135/-) ");
c5=new JCheckBox("French Fries(75/-)");
c6=new JCheckBox("Coke(30/-)");
c7=new JCheckBox("Chicken Maharaja(109/-)");
l8.setFont(new Font("Arial", Font.BOLD, 15));
c1.setFont(new Font("Arial", Font.BOLD, 15));
c2.setFont(new Font("Arial", Font.BOLD, 15));
c3.setFont(new Font("Arial", Font.BOLD, 15));
c4.setFont(new Font("Arial", Font.BOLD, 15));
c5.setFont(new Font("Arial", Font.BOLD, 15));
c6.setFont(new Font("Arial", Font.BOLD, 15));
c7.setFont(new Font("Arial", Font.BOLD, 15));
l8.setFont(new Font("Arial", Font.BOLD, 30));
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
l1.setBounds(100,30,200,150);
c1.setBounds(100,190,200,40);
l2.setBounds(600,30,200,150);
c2.setBounds(600,190,200,40);
l3.setBounds(100,250,200,150);
c3.setBounds(100,410,200,40);
l4.setBounds(600,250,200,150);
c4.setBounds(600,410,200,40);
l5.setBounds(100,470,200,150);
c5.setBounds(100,630,200,40);
l6.setBounds(600,470,200,150);
c6.setBounds(600,630,200,40);
l7.setBounds(1050,30,200,150);
c7.setBounds(1050,190,200,40);
l8.setBounds(950,350,100,30);
t.setBounds(1070,350,100,30);
b1.setBounds(1070,400,150,30);
b2.setBounds(1070,450,150,30);
b3.setBounds(10,20,70,30);
b3.setFont(new Font("Arial", Font.BOLD, 12));
add(b3);
Con.setBackground(Color.pink);

add(l1);
add(c1);
add(l2);
add(c2);
add(l3);
add(c3);
add(l4);
add(c4);
add(l5);
add(c5);
add(l6);
add(c6);
add(l7);
add(c7);
add(l8);
add(t);
add(b1);
add(b2);
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
	if(ae.getActionCommand().equals("Calculate"))
	{
	int Total=0;
	if(c1.isSelected())
	{
		Total=Total+85;
	}
	if(c2.isSelected())
	{
		Total=Total+155;
	}
	if(c3.isSelected())
	{
		Total=Total+132;
	}
	if(c4.isSelected())
	{
		Total=Total+135;
	}
	if(c5.isSelected())
	{
		Total=Total+75;
	}
	if(c6.isSelected())
	{
		Total=Total+30;
	}
	if(c7.isSelected())
	{
		Total=Total+109;
	}
	t.setText(Integer.toString(Total));
	Total=Integer.parseInt(t.getText());
	} else if(ae.getActionCommand().equals("Confirm Order"))
	{
		new fs19();
	}else
	{
		new fss3();
	}


	
	}
}


