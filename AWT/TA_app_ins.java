
import java.awt.*;
import java.awt.event.*;
public class TA_app_ins extends Frame implements  ActionListener {
    TextArea TA;
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    TA_app_ins()
    {
        Panel p1=new Panel();
        Panel p2=new Panel();
        TA=new TextArea();
        TA.setBounds(50,50,600,200);
        l1=new Label("Enter the Text");
        l2=new Label("Enter the Location:");
        b1=new Button("Append");
        b2=new Button("Insert");
        b1.addActionListener( this);
        b2.addActionListener(this);
        t1=new TextField();
        t2=new TextField();
        p1.add(TA);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(b1);
        p2.add(b2);
        p1.setLayout(null);
        p2.setLayout(new GridLayout(3,2,50,80));
        add(p1);
        add(p2);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(2,1));
    }
    public static void main(String[] args) {
       new TA_app_ins();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            TA.append(t1.getText());
        }
        if(e.getSource()==b2)
        {
            String text=t2.getText();
            int pos=Integer.parseInt(text);
            TA.insert(t1.getText(),pos);
        }
    }
}
