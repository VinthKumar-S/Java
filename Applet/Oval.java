import java.awt.*;
import java.applet.*;
/* <applet code="Oval" height=400 width=400>
</applet> */
public class Oval extends Applet
{
	public void paint(Graphics g)
	{
	
	g.drawOval(20,20,200,120);
	g.setColor(Color.green);
	g.fillOval(70,30,100,100);
	}
}