import java.awt.*;

class Awt{
    Awt(){
        //Creating a button
        Frame f=new Frame();
        //Creating a Lable
        Label l=new Label("Employee id");
        Button b=new Button("Submit!");//create Button
        TextField t=new TextField();//create TextField
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(400,300);
        f.setTitle("Employee in fo");
        f.setLayout(null);
        f.setVisible(true);
    }
}

public class Awt_textFieldLable {

    public static void main(String[] args) {
	// write your code here
        Awt a=new Awt();
    }
}
