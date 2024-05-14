
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sw_prime extends JFrame implements ActionListener {
    JTextField t1;
    JLabel l1,l2;
    JButton b1;
    Sw_prime()
    {
        t1=new JTextField();
        l1=new JLabel("Enter the number:");
        l2=new JLabel();
        b1=new JButton("Submit");
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
    public static void main(String[] args) {
	// write your code here
        new Sw_prime();
    }
    public void actionPerformed(ActionEvent e)
    {
        int i,m=0,flag=0;
        int n=Integer.parseInt(t1.getText());
        m=n/2;
        if(n==0||n==1){
            l2.setText(n+" is not prime number");
        }
        else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    l2.setText(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                l2.setText(n + " is prime number");
            }
        }
    }
}
