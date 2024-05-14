
import java.awt.*;
import java.awt.event.*;
public class DialogBank extends Frame implements ActionListener {
    Button b1,b2,b3,b4,b5,b6,b7;
    Dialog d1,d2,d3,d4,d5,d6;
    TextField t1,t2;
    Label l1,l2,l3,l4,l5,l6,l7;
    DialogBank()
    {
        b1=new Button("Deposit");
        b1.addActionListener(this);
        b2=new Button("View");
        b2.addActionListener(this);
        d1=new Dialog(this,"Options");
        d1.add(b1);
        d1.add(b2);
        d1.setLayout(new FlowLayout(FlowLayout.LEFT,40,1));
        d1.setVisible(true);
        d1.setSize(500,150);
        b3=new Button("Ok");
        b3.addActionListener(this);
        t1=new TextField(10);
        l1=new Label("Enter the account number");
        d2=new Dialog(this,"Search");
        d2.add(l1);
        d2.add(t1);
        d2.add(b3);
        d2.setLayout(new FlowLayout());
        d2.setSize(700,150);
        t2=new TextField(10);
        b4=new Button("Add");
        b4.addActionListener(this);
        l2=new Label("Enter the amount:");
        d3=new Dialog(this,"Deposit");
        d3.add(l2);
        d3.add(t2);
        d3.add(b4);
        d3.setLayout(new FlowLayout());
        d3.setSize(300,100);
        l5=new Label();
        l6=new Label();
        l7=new Label();
        b7=new Button("Close");
        b7.addActionListener(this);
        d4=new Dialog(this,"View");
        d4.add(l6);
        d4.add(l7);
        d4.add(l5);
        d4.add(b7);
        d4.setLayout(new GridLayout(4,1,10,10));
        d4.setSize(800,100);
        b6=new Button("Close");
        b6.addActionListener(this);
        l3=new Label("The Account number is Invalid");
        d5=new Dialog(this,"Not");
        d5.add(l3);
        d5.add(b6);
        d5.setLayout(new FlowLayout());
        d5.setSize(300,100);
        l4=new Label();
        b5=new Button("Close");
        b5.addActionListener(this);
        d6=new Dialog(this,"Balance");
        d6.add(l4);
        d6.add(b5);
        d6.setLayout(new FlowLayout());
        d6.setSize(600,100);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        setVisible(true);
        setSize(400,400);
        setLayout(null);

    }
    public static void main(String[] args) {
	// write your code here
        new DialogBank();
    }


    public void actionPerformed(ActionEvent e)
    {
        String []name={"Navin","Santhosh","Sanjeev"};
        int []accno={78,74,62};
        int []Bal={3000,2000,1000};
        int i,j,flag=0,n,amt,total=0;
        String acc="",bal="",names="";
      if(e.getSource()==b1)
      {
          d2.setVisible(true);
      }
        if(e.getSource()==b3)
        {
            n=Integer.parseInt( t1.getText());
            for(i=0;i<accno.length;i++)
            {
                if(accno[i]==n)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                d3.setVisible(true);
                d2.setVisible(false);
            }
            else if(flag==0)
            {
                d5.setVisible(true);
            }

        }
        if(e.getSource()==b4)
        {
            n=Integer.parseInt( t1.getText());
            for(i=0;i<accno.length;i++)
            {
                if(accno[i]==n)
                {
                    amt=Integer.parseInt(t2.getText());
                    Bal[i]+=amt;
                    total=Bal[i];
                }
            }
            l4.setText("Balance "+total);
            d6.setVisible(true);
            d3.setVisible(false);
        }
        if(e.getSource()==b2)
        {
            for(i=0;i<accno.length;i++)
            {
                acc+=accno[i]+",";
                bal+=Bal[i]+",";
                names+=name[i]+",";

            }
            l5.setText("Names:"+names);
            l6.setText(" AccountNumber:"+acc);
            l7.setText("Balance:"+bal);
            d4.setVisible(true);
        }
        if(e.getSource()==b5)
        {
            d6.setVisible(false);
        }
        if(e.getSource()==b6);
        {
           d5.setVisible(false);
        }
        if(e.getSource()==b7)
        {
            d4.setVisible(false);
        }
    }
}
