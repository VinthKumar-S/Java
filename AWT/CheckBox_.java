import java.awt.*;
import java.awt.event.*;

public class CheckBox_ {
    CheckBox_()
    {
        Frame f=new Frame("Check Box Example");
        final Label l=new Label();
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        Checkbox checkbox=new Checkbox();
        checkbox.setBounds(100,100,50,50);
        Checkbox checkbox1=new Checkbox();
        checkbox1.setBounds(100,150,50,50);
        f.add(checkbox);
        f.add(checkbox1);
        f.add(l);
        checkbox.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                l.setText("C++ Checkbox:"+(e.getStateChange()==1?"Checked":"unChecked"));
            }
        });
        checkbox1.addItemListener(new ItemListener() {
            
            public void itemStateChanged(ItemEvent e) {
                l.setText("Java Checkbox:"+(e.getStateChange()==1?"Checked":"UnChecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new CheckBox_();
    }
}