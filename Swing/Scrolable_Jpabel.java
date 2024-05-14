
import java.awt.*;
import javax.swing.*;
public class Scrolable_Jpabel extends JFrame {
Scrolable_Jpabel()
{
 JButton b1=new JButton("Button1");
    JButton b2=new JButton("Button1");
    JButton b3=new JButton("Button2");
    JButton b4=new JButton("Button3");
    JButton b5=new JButton("Button4");
    JButton b6=new JButton("Button5");
    JButton b7=new JButton("Button6");
    JButton b8=new JButton("Button7");
    JButton b9=new JButton("Button8");
    JButton b10=new JButton("Button9");
    JButton b11=new JButton("Button10");
 JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
 p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p2.add(b6);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b10);
    p2.add(b11);
    p1.setLayout(new GridLayout(5,1,5,5));
    p2.setLayout(new GridLayout(6,1,5,5));
    p3.add(p1);
    p3.add(p2);
    p3.setLayout(new GridLayout(2,1));
    add(BorderLayout.CENTER, new JScrollPane(p3));
 setSize(200,200);
 setVisible(true);
 setLayout(new BorderLayout());
 setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
	// write your code here
        new Scrolable_Jpabel();
    }
}
