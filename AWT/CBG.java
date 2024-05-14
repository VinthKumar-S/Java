import java.awt.*;
import java.awt.event.*;

public class CBG {
CBG()
{
    Frame f=new Frame("Checkbox Group");
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox cb1=new Checkbox("C++",cbg,false);
    cb1.setBounds(100,100,50,50);
    Checkbox cb2=new Checkbox("java",cbg,true);
    cb2.setBounds(100,150,50,50);
    f.add(cb1);
    f.add(cb2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
    public static void main(String[] args) {
	// write your code here
        new CBG();
    }
}