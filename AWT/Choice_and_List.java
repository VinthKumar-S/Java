
import java.awt.*;
import java.awt.event.*;


public class Choice_and_List extends Frame implements ActionListener {
    Choice c;
    List l1;
    Button b1;
    Label l2,l3;
    Choice_and_List()
    {
        Panel p1=new Panel();
        Panel p2=new Panel();
        b1=new Button("Submit");
        c=new Choice();
        c.add("item1");
        c.add("item2");
        c.add("item3");
        l1=new List(3,true);
        l1.add("List1");
        l1.add("List2");
        l1.add("List3");
        p1.add(c);
        p1.add(l1);
        p1.add(b1);
        l2=new Label();
        l3=new Label();
        p2.add(l2);
        p2.add(l3);
        p2.setLayout(new GridLayout(2,1));
        p1.setLayout(new FlowLayout(FlowLayout.LEFT,40,1));
        b1.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        add(p1);
        add(p2);
        setSize(400,400);
        setLayout(new GridLayout(2,1));
        setVisible(true);
    }
    public static void main(String[] args) {
	// write your code here
        new Choice_and_List();
    }


    public void actionPerformed(ActionEvent e) {
        String Cho,list="Selected elements: ";
        Cho = c.getItem(c.getSelectedIndex());
        l2.setText("Selected from Choice:" + Cho);
        int idx[];
        idx=l1.getSelectedIndexes();
        
        for(int i=0;i<idx.length;i++)
        {
          list+=l1.getItem(idx[i])+",";
        }
        l3.setText(list);
    }
}
