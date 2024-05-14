
import java.awt.*;
import java.awt.event.*;
public class Dlog extends Frame implements ActionListener
{
    Label l1,l2;
    Button b1;
    Dialog d1;
    TextField t1,t2;
    Dlog()
    {
        l1=new Label("Name");
        l2=new Label("password");
        b1=new Button("Ok");
        t1=new TextField(10);
        t2=new TextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        d1=new Dialog(this,"Login");
        d1.setLayout(new FlowLayout());
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
	// write your code here
        new Dlog();
    }


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String verify="088";
            if(verify.equals(t2.getText()))
            {
                d1.add(new Label("Welcome "+t1.getText()));
            }
            else
            {
                d1.add(new Label("password is incorrect"));
            }
            d1.setVisible(true);
            d1.setSize(400,100);
        }
    }
}
