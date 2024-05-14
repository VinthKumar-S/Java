import java.awt.*;
import java.awt.event.*;

public class Choice_Event extends Frame  {

    Choice_Event() {
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,400);
        Button b = new Button("Show");
        b.setBounds(200, 100, 50, 20);
        final  Choice c = new Choice();
        c.setBounds(100, 100, 75, 75);
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("PHP");
        c.add("Android");
        add(c);
        add(l);
        add(b);
        setSize(300,300);
        setVisible(true);
        setLayout(null);
       b.addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent e) {
               String data="Programing Language Selected:"+c.getItem(c.getSelectedIndex());
               l.setText(data);
           }
       });

    }



    public static void main(String[] args) {
	// write your code here
        new Choice_Event();
    }

}