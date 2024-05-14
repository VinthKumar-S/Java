

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Simple_Application  extends  JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JLabel d1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JCheckBox c1,c2,c3;
    JRadioButton f,m,t;
    JTextField jt;
    JButton b1;
    JDialog jd;
    Simple_Application()
    {
        l1=new JLabel("Branch");
        l2=new JLabel("Date");
        t1=new JTextField(10);
        t2=new JTextField(10);
        l3=new JLabel("Apply For A:");
        JPanel jp=new JPanel();
        jp.add(l1);
        jp.add(t1);
        jp.add(l2);
        jp.add(t2);
        jp.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

        c1=new JCheckBox("Learner Permit");
        c1.setBackground(Color.pink);
        c2=new JCheckBox("ID Card");
        c2.setBackground(Color.pink);
        c3=new JCheckBox("Renewable");
        c3.setBackground(Color.pink);
        JPanel jp1=new JPanel();
        jp1.add(l3);
        jp1.add(c1);
        jp1.add(c2);
        jp1.add(c3);
        jp1.setLayout(new GridLayout(1,4,2,2));

        l4=new JLabel("-------------------------------------------Your Personal Details----------------------------------");
        JPanel jp2=new JPanel();
        jp2.add(l4);
        jp2.setLayout(new FlowLayout(FlowLayout.LEFT));

        l5=new JLabel("Name:");
        t3=new JTextField(10);
        JPanel jp3=new JPanel();
        jp3.add(l5);
        jp3.add(t3);
        jp3.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel jp4=new JPanel();
        Icon ic=new ImageIcon();
        l6=new JLabel("Gender");
        ButtonGroup bg=new ButtonGroup();
        f=new JRadioButton("Female");
        f.setBackground(Color.pink);
        m=new JRadioButton("Male");
        m.setBackground(Color.pink);
        t=new JRadioButton("TransGender");
        t.setBackground(Color.pink);
        bg.add(f);
        bg.add(m);
        bg.add(t);
        jp4.add(l6);
        jp4.add(f);
        jp4.add(m);
        jp4.add(t);
        jp4.setLayout(new GridLayout(1,4,3,3));
        JPanel jp5=new JPanel();
        l6=new JLabel("Date of Birth:");
        l7=new JLabel("Day:");
        l8=new JLabel("Month:");
        l9=new JLabel("Year:");
        t4=new JTextField(5);
        t5=new JTextField(5);
        t6=new JTextField(5);
        jp5.add(l6);
        jp5.add(l7);
        jp5.add(t4);
        jp5.add(l8);
        jp5.add(t5);
        jp5.add(l9);
        jp5.add(t6);
        jp5.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel jp6=new JPanel();
        l10=new JLabel("Nationality:");
        l11=new JLabel("ID Card Number");
        t7=new JTextField(10);
        t8=new JTextField(10);
        jp6.add(l10);
        jp6.add(t7);
        jp6.add(l11);
        jp6.add(t8);
        jp6.setLayout(new FlowLayout(FlowLayout.LEFT,2,2));

        jt=new JTextField();
        l12=new JLabel("Address");
        b1=new JButton("Submit");
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        JPanel jp7=new JPanel();
        jp7.add(l12);
        jp7.add(jt);
        jp7.add(b1);
        jp7.setLayout(new GridLayout(2,2,5,5));
        jp.setBackground(Color.pink);
        jp1.setBackground(Color.pink);
        jp2.setBackground(Color.pink);
        jp3.setBackground(Color.pink);
        jp4.setBackground(Color.pink);
        jp5.setBackground(Color.pink);
        jp6.setBackground(Color.pink);
        jp7.setBackground(Color.pink);
        add(jp);
        add(jp1);
        add(jp2);
        add(jp3);
        add(jp4);
        add(jp5);
        add(jp6);
        add(jp7);

        jd=new JDialog();
        jd.setTitle("Report");
        d1=new JLabel("Submit successfully");
        d1.setFont(new Font("Courier New",Font.ITALIC,12));
        jd.add(d1);
        jd.setSize(300,300);
        jd.setLayout(new FlowLayout(FlowLayout.CENTER,50,120));
        jd.setVisible(false);

        setLayout(new GridLayout(8,1));
        setVisible(true);
        setTitle("Licence Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setBackground(Color.pink);
    }
    public static void main(String[] args) {
	// write your code here
        new Simple_Application();
    }
    public void actionPerformed(ActionEvent e) {
        jd.setVisible(true);
        setVisible(false);
    }
}
