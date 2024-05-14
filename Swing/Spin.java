
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Spin extends JFrame implements ChangeListener {
    String Months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    JSpinner s1,s2,s3;
    JLabel l1,l2,l3,l4,l5,l6;

    Spin()
    {

        l1=new JLabel();
        l2=new JLabel("Choose your birthday:");
        l3=new JLabel("Day:");
        l4=new JLabel("Month:");
        l5=new JLabel("year:");
        l6=new JLabel();
        SpinnerModel v1=new SpinnerNumberModel(5,1,31,1);
        SpinnerModel v2=new SpinnerListModel(Months);
        SpinnerModel v3=new SpinnerNumberModel(5,1,10,1);
        s1=new JSpinner(v1);
        s2=new JSpinner(v2);
        s3=new JSpinner(v3);
        Panel p1=new Panel();
        Panel p2=new Panel();
        p1.add(l2);
        p1.add(l3);
        p1.add(s1);
        p1.add(l4);
        p1.add(s2);
        p1.add(l5);
        p1.add(s3);
        p2.add(l1);
        p2.add(l6);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        add(p1);
        add(p2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,1,10,10));
        setSize(500,500);
    }
    public static void main(String[] args) {
	// write your code here
        new Spin();
    }

    public void stateChanged(ChangeEvent e) {
        String get=s1.getValue()+"";
        int geti=Integer.parseInt(get);
        if(s2.getValue()=="Feb")
        {
            if (geti <= 28)
            {
                s1.getValue();
            }
            else
            {
                s1.setValue(28);
            }
        }
        if(s2.getValue()=="Apr")
        {
            if (geti <= 30) {
                s1.getValue();
            }
            else
            {
                s1.setValue(30);
            }
        }
        if(s2.getValue()=="Jun")
        {
            if (geti <= 30)
            {
                s1.getValue();
            }
            else
            {
                s1.setValue(30);
            }
        }
        if(s2.getValue()=="Sep")
        {
            if (geti <= 30)
            {
                s1.getValue();
            }
            else
            {
                s1.setValue(30);
            }
        }
        if(s2.getValue()=="Nov")
        {
            if (geti <= 30) {
                s1.getValue();
            } else {
                s1.setValue(30);
            }
        }
        l1.setText("Your Birthday is: "+s1.getValue() + " / " + s2.getValue());
        int n=0;
                n=Integer.parseInt(s3.getValue()+"");
        if(n<=9)
        {
          l6.setText(" / 200"+s3.getValue());
        }
        if(n>9)
        {
            l6.setText(" / 20"+s3.getValue());
        }
    }
}
