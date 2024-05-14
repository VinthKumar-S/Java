
import java.awt.*;
import java.applet.*;
/* <applet code="rect3D" height=400 width=400>
</applet> */
public class rect3D extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(new Color(255,0,0));
	g.draw3DRect(300,300,80,80,true);
	g.fill3DRect(300,300,80,80,true);
	}
}