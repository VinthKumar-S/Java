
import java.awt.*;
import java.awt.event.*;
public class Scroll extends Frame implements AdjustmentListener
{
    Scrollbar s1,s2,s3;
    Label l1,l2,l3,l4;
    TextField t1;
    Scroll()
    {

         s1=new Scrollbar(Scrollbar.HORIZONTAL,0,4,0,255);
         s2=new Scrollbar(Scrollbar.HORIZONTAL,0,4,0,300);
         s3=new Scrollbar(Scrollbar.HORIZONTAL,0,4,0,300);
         l1=new Label("Red Color:");
         l1.setBounds(20,80,80,20);
         s1.setBounds(100,80,400,20);
         s1.setBackground(Color.red);
        l2=new Label("Blue Color:");
        l2.setBounds(20,120,80,20);
        s2.setBounds(100,120,400,20);
        s2.setBackground(Color.blue);
        l3=new Label("Green Color:");
        l3.setBounds(20,160,80,20);
        s3.setBounds(100,160,400,20);
        s3.setBackground(Color.green);
        l4=new Label("Screen:");
        l4.setBounds(20,200,80,20);
        t1=new TextField();
        t1.setBounds(20,240,500,450);

         addWindowListener(new WindowAdapter()
         {
             public void windowClosing(WindowEvent e) {
                 dispose();
             }

    });
         s1.addAdjustmentListener(this);
         s2.addAdjustmentListener(this);
         s3.addAdjustmentListener(this);
         add(s1);
         add(s2);
         add(s3);
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         add(t1);
         setLayout(null);
         setVisible(true);
         setSize(400,400);
    }
    public static void main(String[] args) {
	// write your code here
        new Scroll();
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int r=0,g=0,b=0;
        if(e.getAdjustable()==s1)
        {
            r=s1.getValue();
	    g=s1.getValue();
	    b=s1.getValue();
            Color c1=new Color(r,b,g);
            t1.setBackground(c1);
        }
        if(e.getAdjustable()==s2)
        {
	     r=s1.getValue();
	    g=s1.getValue();
            b=s1.getValue();
            Color c1=new Color(r,b,g);
            t1.setBackground(c1);
        }
        if(e.getAdjustable()==s3)
        {
	     r=s1.getValue();
	    g=s1.getValue();
            b=s1.getValue();
          
            Color c1=new Color(r,b,g);
            t1.setBackground(c1);
        }

    }
}
