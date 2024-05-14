
import java.awt.*;
import java.awt.event.*;
public class checkbox extends Frame implements ActionListener {
    TextField t1;
    Label l1,l2,l3,l4,l5;
    Checkbox T,E,H;
    Button b1;
    checkbox()
    {
         l1=new Label("Enter the Name:");
         l2=new Label();
         l3=new Label();
         l4=new Label();
         l5=new Label();
        Panel p1=new Panel();
        Panel p2=new Panel();
         t1=new TextField();
        t1.setBackground(Color.cyan);
         T=new Checkbox("Tamil");
         E=new Checkbox("English");
         H=new Checkbox("Hindi");
         b1=new Button("Submit");
         b1.addActionListener(this);
        p1.add(l1);
        p1.add(t1);
        p1.add(T);
        p1.add(E);
        p1.add(H);
        p1.add(b1);
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
    }

    public static void main(String[] args) {
	// write your code here
        new checkbox();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            l3.setText("Name:"+t1.getText());
            if(T.getState()==true)
            {
                l2.setText("Language 1-Tamil");
            }
            if(T.getState()==false)
            {
                l2.setText("");
            }
            if(E.getState()==true)
            {
                l4.setText("Language 2-English");
            }
            if(E.getState()==false)
            {
                l4.setText("");
            }
            if(H.getState()==true)
            {
                l5.setText("Language 3-Hindi");
            }
            if(H.getState()==false)
            {
                l5.setText("");
            }

        }

    }
}
