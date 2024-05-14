import java.awt.*;
import java.awt.event.*;

public class AWT_Event extends Frame implements ActionListener {
    TextField  tf;
    AWT_Event()
    {
        tf =new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Click Me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    tf.setText("Welcome");
    }

    public static void main(String[] args) {
	// write your code here
        new AWT_Event();
    }


}