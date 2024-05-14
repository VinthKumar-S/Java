import java.awt.*;
import java.awt.event.*;

public class Button_press_Event  implements ActionListener {
    Button b1,b2;
    Label l1,l2;
    Frame f;
    Button_press_Event()
    {
        f=new Frame("Button press event");
        b1=new Button("Yes");
        b2=new Button("No");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1=new Label();
        l2=new Label();
        f.add(b1);
       f.add(b2);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,60,10));
        f.setSize(250,150);
        f.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new Button_press_Event();
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            f.add(l1);
            l1.setText("1.You Press the yes Button");
            f.setVisible(true);
        }
        else if(e.getSource()==b2)
        {
            f.add(l2);
            l2.setText("2.You Press the No Button");
            f.setVisible(true);
        }
    }
}