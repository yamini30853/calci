import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.EventQueue;
public class Cal implements ActionListener
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	Cal()
	{
JFrame j=new JFrame("Calculator");
j.setSize(266,300);
j.setLayout(null);
j.setVisible(true);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setResizable(false);
ImageIcon icon1 =new ImageIcon("1.png");
j.setIconImage(icon1.getImage());
ImageIcon icon2 =new ImageIcon("1.png");
JLabel l1=new JLabel(icon2);
l1.setBounds(164,1,icon2.getIconWidth(),icon2.getIconHeight());
j.add(l1);

t1=new JTextField();
t1.setBounds(15,15,155,35);
j.add(t1);

t1=new JTextField();
t1.setBounds(15,15,155,35);
j.add(t1);

b1= new JButton("7");
b1.setBounds(15,64,52,30);
j.add(b1);
b2= new JButton("8");
b2.setBounds(65,64,52,30);
j.add(b2);
b3= new JButton("9");
b3.setBounds(116,64,52,30);
j.add(b3);
b4= new JButton("6");
b4.setBounds(15,93,52,30);
j.add(b4);
b5= new JButton("5");
b5.setBounds(65,93,52,30);
j.add(b5);
b6= new JButton("4");
b6.setBounds(116,93,52,30);
j.add(b6);
b7= new JButton("3");
b7.setBounds(15,122,52,30);
j.add(b7);
b8= new JButton("2");
b8.setBounds(65,122,52,30);
j.add(b8);
b9= new JButton("1");
b9.setBounds(116,122,52,30);
j.add(b9);
b10= new JButton("+");
b10.setBounds(182,122,52,30);
j.add(b10);
b11= new JButton("-");
b11.setBounds(182,151,52,30);
j.add(b11);
b12= new JButton("*");
b12.setBounds(182,180,52,30);
j.add(b12);
b13= new JButton("/");
b13.setBounds(182,209,52,30);
j.add(b13);
b14= new JButton("0");
b14.setBounds(15,151,52,30);
j.add(b14);
b15= new JButton(".");
b15.setBounds(64,151,52,30);
j.add(b15);
b16= new JButton("C");
b16.setBounds(116,151,52,30);
j.add(b16);
b17= new JButton("=");
b17.setBounds(64,180,52,60);
j.add(b17);
b18= new JButton("del");
b18.setBounds(116,180,52,60);
j.add(b18);
b19= new JButton("%");
b19.setBounds(15,180,52,30);
j.add(b19);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);


	
	}

public void actionPerformed(ActionEvent e)
{
}
public static void main(String[] args)
{
new Cal();
}
}
