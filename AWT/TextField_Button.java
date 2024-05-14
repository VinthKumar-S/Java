import java.awt.*;
import java.awt.event.*;
public class TextField_Button implements ActionListener {
TextField tf;
Label l;
Button b;
Frame f;
    TextField_Button()
    {
        f=new Frame();
        tf=new TextField();
        tf.setBounds(50,50,150,20);
        l=new Label();
        l.setBounds(50,100,250,20);
        b=new Button("Find IP");
        b.setBounds(50,150,60,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.add(l);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new TextField_Button();
    }

    public void actionPerformed(ActionEvent e) {
        try{
            String ip = tf.getText();
            String host = "www.javatpoint.com/java-awt";
            l.setText("proof" + host + "is:" + host);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}