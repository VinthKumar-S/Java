
import java.awt.*;
import java.awt.event.*;
public class Deposite extends Frame implements ActionListener {
    Label n1,acc1,bal1,deposite1,d1,d2,d3;
    TextField n,acc,bal,deposite;
    Button submit;
    Deposite()
    {
         n1=new Label("Enter the Name:");
         acc1=new Label("AccountNo");
         bal1=new Label("Balance");
         deposite1=new Label("Deposite");
         d3=new Label();
         d1=new Label();
         d2=new Label();
        n=new TextField();
        acc=new TextField();
        bal=new TextField();
        deposite=new TextField();
        submit=new Button("Submit");
        n1.setBounds(50,80,125,30);
        n.setBounds(50,100,125,27);
        acc1.setBounds(50,140,60,30);
        acc.setBounds(50,160,50,30);
        bal1.setBounds(130,140,50,30);
        bal.setBounds(130,160,50,30);
        deposite1.setBounds(50,200,60,30);
        deposite.setBounds(50,220,50,30);
        submit.setBounds(130,220,60,30);
        d1.setBounds(50,260,300,30);
        d2.setBounds(50,300,125,30);
        d3.setBounds(50,340,125,30);
        submit.addActionListener(this);
        add(n);
        add(n1);
        add(acc);
        add(acc1);
        add(bal);
        add(bal1);
        add(submit);
        add(deposite);
        add(deposite1);
        add(d3);
        add(d1);
        add(d2);
        setLayout(null);
        setVisible(true);
        setSize(400,400);

    }

    public static void main(String[] args) {
	// write your code here
        new Deposite();
    }


    public void actionPerformed(ActionEvent e) {
    String s1,s2,s3,s4;
    s1=n.getText();
    s2=acc.getText();
    s3=bal.getText();
    s4=deposite.getText();
    int bal2=0,deposite2;
    bal2=Integer.parseInt(s3);
    deposite2=Integer.parseInt(s4);
    bal2+=deposite2;
    d3.setText("Balance Amount:"+bal2);
    d1.setText("Name of the user:"+s1);
    d2.setText("Account No:"+s2);
    }
}
