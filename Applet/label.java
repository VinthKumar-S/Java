import java.awt.*;
import java.applet.*;
/* <applet code="label" height=400 width=400>
</applet> */
public class label extends Applet
{
	Label l;
	public void init()
	{	
		l=new Label("Vinith",Label.CENTER);
		l.setBackground(Color.RED);
		add(l);
	}
	public void paint(Graphics g)
	{
	
	}
}