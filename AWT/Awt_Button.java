import java.awt.*;
class meth extends Frame
        {
           meth() {
               Button b = new Button("Click me!!");
               b.setForeground(Color.blue);
               b.setBounds(30, 100, 80, 30);
               add(b);
               setSize(300, 300);
               setTitle("This is My Frist Awt program");
               setLayout(null);
               setVisible(true);
           }
        }

public class Awt_Button extends Frame {

    public static void main(String[] args) {
	// write your code here
        meth m=new meth();
    }
}