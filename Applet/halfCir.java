import java.awt.*;
import java.applet.*;
/* <applet code="halfCir" height=400 width=400>
</applet> */
public class halfCir extends Applet
{
	public void paint(Graphics g)
	{
	
	
	g.setColor(Color.green);
	g.drawArc(100,100,50,50,0,180);
	}
}