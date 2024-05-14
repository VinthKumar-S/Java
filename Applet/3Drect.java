
import java.awt.*;
import java.applet.*;
/* <applet code="3Drect" height=400 width=400>
</applet> */
public class 3Drect extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(new Color(255,0,0);
	g.draw3DRect(300,300,80,80,true);
	g.fill3DRect(300,300,80,80,true);
}