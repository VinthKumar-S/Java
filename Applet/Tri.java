import java.awt.*;
import java.applet.*;
/* <applet code="Tri" height=400 width=400>
</applet> */
public class Tri extends Applet
{
	public void paint(Graphics g)
	{
	int x[]={50,90,10};
	int y[]={10,60,60};
	int p=3;
	g.drawPolygon(x,y,p);
	g.setColor(Color.pink);
	g.fillPolygon(x,y,p);
	}
}