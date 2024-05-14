import java.awt.*;
import java.applet.*;
/* <applet code="Square" height=400 width=400>
</applet> */
public class Square extends Applet
{
	public void paint(Graphics g)
	{
	g.drawRect(100,100,80,80);
	g.fillRect(100,100,80,80);
	}
}