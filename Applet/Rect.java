import java.awt.*;
import java.applet.*;
/* <applet code="Rect" height=400 width=400>
</applet> */
public class Rect extends Applet
{
	public void paint(Graphics g)
	{
	
	g.drawRoundRect(200,200,100,50,10,10);
	g.fillRoundRect(200,200,100,50,10,10);
	}
}