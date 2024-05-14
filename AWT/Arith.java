
import java.awt.*;
import java.awt.event.*;

public class Arith extends Frame  implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5;
    Arith()
    {
        l1=new Label("Enter the Frits Number");
   
        t1=new TextField(10);
        
        l2=new Label("Enter the Second Number");
        
        t2=new TextField();
        
        l3=new Label();
        
        b1=new Button("Addition");
     
        b1.addActionListener(this);
        b2=new Button("Subtraction");
        
        b2.addActionListener(this);
        b3=new Button("Multiplication");
       
        b3.addActionListener(this);
        b4=new Button("Division");
        
        b4.addActionListener(this);
        b5=new Button("Modules");
       
        b5.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l3);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        setSize(700,700);
        setVisible(true);
        setLayout(new GridLayout(10,1,40,30));
    }

    public static void main(String[] args)
    {
	// write your code here
        new Arith();
    }


    public void actionPerformed(ActionEvent e)
    {
        String g;
        int a,b,c;
        float d;
	
	 g=t1.getText();
            a=Integer.parseInt(g);
            g=t2.getText();
            b=Integer.parseInt(g);
       if(e.getSource()==b1)
       {
           c=a+b;
           l3.setText("Addition:"+c);
       }
        if(e.getSource()==b2)
        {
            c=a-b;
            l3.setText("Subtraction:"+c);
        }
        if(e.getSource()==b3)
        {
            c=a*b;
            l3.setText("Multiplication:"+c);
        }
        if(e.getSource()==b4)
        {
            d=a/b;
            l3.setText("Division:"+d);
        }
        if(e.getSource()==b5)
        {
      
            d=a%b;
            l3.setText("Modules:"+d);
        }


    }
}
