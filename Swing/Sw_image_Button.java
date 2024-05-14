import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Sw_image_Button extends JFrame implements ActionListener {
    JLabel l1,l2;
    Sw_image_Button()
    {
        l1=new JLabel();
        l2=new JLabel("Click the Button");
        JButton b=new JButton(new ImageIcon("F:\\Documents\\PDF(for all)\\Second year\\Second II\\GUI\\Swing\\Click.png"));
        add(l2);
        add(b);
        add(l1);
        b.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT,40,1));
        setSize(400,400);
    }

    public static void main(String[] args) {
	// write your code here
      new Sw_image_Button();
    }


    public void actionPerformed(ActionEvent e)
    {
        l1.setText("Button clicked");
    }
}