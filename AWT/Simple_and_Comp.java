
import java.awt.*;
import java.awt.event.*;
public class Simple_and_Comp extends Frame
 {

    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Checkbox g1;
    Checkbox g2;
    CheckboxGroup Cbg;
    Simple_and_Comp()
    {
        Cbg=new CheckboxGroup();
        l1=new Label("Enter the Principle amount:");
        t1=new TextField();
        l2=new Label("Enter the No of time:");
        t2=new TextField();
        l3=new Label("Enter the Rate Value:");
        t3=new TextField();
        g1=new Checkbox("SimpleInterest",Cbg,false);
        g2=new Checkbox("CompoundInterest",Cbg,false);
        l4=new Label();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(g1);
        add(g2);
        add(l4);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

            g1.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    double a, b, c,sim;
                    a = Double.parseDouble(t1.getText());
                    b = Double.parseDouble(t2.getText());
                    c = Double.parseDouble(t3.getText());
                    sim = (a * b * c) / 100;
                    l4.setText("SimpleInterest:" + sim);
                }
            });
            g2.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    double x,y,z,comp;
                    x = Double.parseDouble(t1.getText());
                    y = Double.parseDouble(t2.getText());
                    z = Double.parseDouble(t3.getText());
                    comp = x * Math.pow(1.0 + y / 100.0,y) -x;
                    l4.setText("CompoundInterest:" + comp);
                }
            });

        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(10,30,40,30));
    }

    public static void main(String[] args)
    {
	// write your code here
        new Simple_and_Comp();
    }
 }
