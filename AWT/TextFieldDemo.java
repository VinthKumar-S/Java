import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="TextFieldDemo" width=380 height=150>
</applet> */

public class TextFieldDemo extends Applet implements ActionListener
{

TextField name, pass;
Button b1,b2;
Label dis;
public void init () {

 dis = new Label();
Label namep = new Label("Name",Label.RIGHT);
Label passp = new Label("Password",Label.RIGHT);
Button b1=new Button("Login");
Button b2=new Button("Cancel");
name = new TextField (12); 
pass = new TextField (8);

pass.setEchoChar('?');

add (namep);

add (name);
add (passp);
add (pass); 
add(b1);
add(b2);
name.addActionListener(this); 
pass.addActionListener(this);
b1.addActionListener(this);
add(dis);
}
 public void actionPerformed (ActionEvent e) 
{

		if(e.getSource()==b1)
		{
			String K="Karthic";
			if(K.equals(name.getText()))
			{
			dis.setText("Name is Right");
			}
			else
			dis.setText("Name is not Right");
		}
		repaint ();
}
 
	public void paint(Graphics g)
	{
		
		g.drawString("Name"+name.getText(),6,60);
		g.drawString("Selected text in name:"+name.getSelectedText(),6,80);
		g.drawString("Password;"+pass.getText(),6,100);
	
	}
}