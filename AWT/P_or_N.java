
import java.awt.*;
import java.awt.event.*;
public class P_or_N extends Frame implements ActionListener {
    Label l1,l2;
    Button b1;
    TextField t1;
    P_or_N()
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
    setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
    setVisible(true);
    setSize(500,500);
    }
    public static void main(String[] args) {
	// write your code here
        new P_or_N();
    }


    public void actionPerformed(ActionEvent e) {
        String s;
        s=t1.getText();
        int num=Integer.parseInt(s);
        if(num>0)
        {
            l2.setText(num+"-It is a positive number:");
        }
        else
            l2.setText(num+"-It is a Negative number:");
    }
}
