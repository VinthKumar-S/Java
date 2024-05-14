
import java.applet.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/* <applet code="checkbox" height=200 width=400>
	</applet> */
public class checkbox extends Applet implements ItemListener,ItemEvent
{
	Checkbox c1,c2;
	String msg;
	public void init()
	{
		msg=" ";
	c1=new Checkbox("Vinithkumar",true);
	c2=new Checkbox("joes",true);
	add(c1);
	add(c2);
	c1.addItemListener(this);
	c2.addItemListener(this);
	}
	public void paint(Graphics g)
	{
	msg="Vinithkumar;"+c1.getState()+" "+"BCA:"+c2.getState();
	g.drawString(msg,100,200);
	}
	void ItemStateChanged(ItemEvent i)
	{
	repaint();
	}
}
	