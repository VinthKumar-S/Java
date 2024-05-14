

import java.awt.*;
import java.awt.event.*;
public class Panels extends Frame {
    TextField t1;
    Label l0,l1,l2,l3,l4,l5;
    Checkbox T,E,H;
    Panels()
    {
	 l0=new Label("Enter the Language:",Label.RIGHT);
         l1=new Label("Enter the Name:");
         l2=new Label();
         l3=new Label();
         l4=new Label();
         l5=new Label();
        Panel p1=new Panel();
        Panel p2=new Panel();
        final TextField t1=new TextField();
        t1.setBackground(Color.cyan);
        Checkbox T=new Checkbox("Tamil");
        Checkbox E=new Checkbox("English");
        Checkbox H=new Checkbox("Hindi");
        p1.add(l1);
        p1.add(t1);
	p1.add(l0);
        p1.add(T);
        p1.add(E);
        p1.add(H);
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.add(l2);
        p1.setBackground(Color.white);
        p2.setBackground(Color.pink);
        p1.setLayout(new GridLayout(6,1,10,20));
        p2.setLayout(new FlowLayout());
        add(p1);
        add(p2);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(2,1,10,10));
        T.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l2.setText("Language 1-Tamil");
                l3.setText("Name:"+t1.getText());
            }
        });
        E.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l4.setText("Language 2-English");
                l3.setText("Name:"+t1.getText());
            }
        });
        H.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l5.setText("Language 3-Hindi");
                l3.setText("Name:"+t1.getText());
            }
        });
    }

    public static void main(String[] args) {
	// write your code here
        new Panels();
    }
}
