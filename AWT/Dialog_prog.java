

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog_prog {
public static Dialog d;
Dialog_prog()
{
    Frame f=new Frame();
    d=new Dialog(f,"Dialog",true);
    d.setLayout(new FlowLayout());
    Button b=new Button("Ok");
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Dialog_prog.d.setVisible(false);
        }
    });
    d.add(new Label("Click button to Continue"));
    d.add(b);
    d.setSize(300,300);
    d.setLayout(null);
}
    public static void main(String[] args) {
	// write your code here
        new Dialog_prog();
    }
}
