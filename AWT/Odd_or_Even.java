

import java.awt.*;
import java.awt.event.*;
public class Odd_or_Even extends Frame implements ActionListener {
    Label l1,l2;
    Button b1;
    TextField t1;
    Odd_or_Even()
    {
        l1=new Label("Enter the number:");
        l2=new Label();
        t1=new TextField(15);
        b1=new Button("Submit:");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        setLayout(new FlowLayout(FlowLayout.CENTER,5,2));
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        // write your code here
        new Odd_or_Even();
    }


    public void actionPerformed(ActionEvent e) {
        String s;
        s=t1.getText();
        int num=Integer.parseInt(s);
        if(num%2!=0)
        {
            l2.setText(num+"-It is a odd number:");
        }
        else if(num%2==0) {
            l2.setText(num + "-It is a even number:");
        }
    }
}
