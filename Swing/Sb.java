import javax.swing.*;
import java.awt.*;
public class Sb {

    public static void main(String[] args) {
	// write your code here
        JFrame f=new JFrame();

        JButton b=new JButton("Submit");
       
        f.add(b);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
    }
}