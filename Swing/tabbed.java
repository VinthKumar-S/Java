
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tabbed extends JFrame implements ActionListener {
    JTabbedPane jtp;
    JButton b1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JComboBox c;
    tabbed()
    {
        jtp=new JTabbedPane();
        Panel p1=new Panel();
        Panel p2=new Panel();
        b1=new JButton("Submit");
        b1.addActionListener(this);
        l1=new JLabel("Enter the number");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        l2=new JLabel();
        p1.add(l1);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(b1);
        p1.add(l2);
        p1.setBackground(Color.orange);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        l4=new JLabel("Choose one Color");
        c=new JComboBox();
        c.addItem("Red");
        c.addItem("Blue");
        c.addItem("Green");
        l3=new JLabel();
        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
              String s="Selected:"+c.getItemAt(c.getSelectedIndex());
              l3.setText(s);
            }
        });
        p2.add(l4);
        p2.add(c);
        p2.add(l3);
        p2.setBackground(Color.cyan);
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jtp.add("Buttons:",p1);
        jtp.add("Combo box",p2);
        jtp.setBounds(50,50,500,500);
        add(jtp);
        jtp.setBackground(Color.BLUE);
        setLayout(null);
        setSize(600,600);
        setVisible(true);

    }

    public static void main(String[] args) {
	// write your code here
        new tabbed();
    }


    public void actionPerformed(ActionEvent e)
    {
        int n=0,n1=0,n2=0;
        n=Integer.parseInt(t1.getText());
        n1=Integer.parseInt(t2.getText());
        n2=Integer.parseInt(t3.getText());
      if(e.getSource()==b1)
      {
        if(n>n1)
        {
            l2.setText("BiggestNumber:"+n);
        }
          if(n>n2)
          {
              l2.setText("BiggestNumber:"+n);
          }
          if(n1>n2)
          {
              l2.setText("BiggestNumber:"+n1);
          }
          else
              l2.setText("BiggestNumber:"+n2);

      }

    }

}
