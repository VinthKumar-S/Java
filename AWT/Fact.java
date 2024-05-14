
import java.awt.*;
import java.awt.event.*;


public class Fact extends Frame implements ActionListener
{
    TextField t1;
    Label l1,l2;
    Button b1;
     Fact()
    {
      t1=new TextField();
      l1=new Label("Enter the number:");
      l2=new Label();
      b1=new Button("Submit");
      b1.addActionListener(this);
      add(l1);
      add(t1);
      add(b1);
      add(l2);
      setSize(700,700);
      setVisible(true);
      setLayout(new GridLayout(10,30,40,30));
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public static void main(String[] args)
    {
	// write your code here
        new Fact();
    }

    public void actionPerformed(ActionEvent e)
    {
    int i,n,f=1;
        String s;
    s=t1.getText();
    n=Integer.parseInt(s);
    for(i=1;i<=n;i++)
    {
        f*=i;
    }
    l2.setText("The factorial value:"+f);
    }
}
