import java.applet.*;
import java.awt.*;
/*<applet code= "appshp" width=300 height=500>
 </applet> */
	
public class appshp extends Applet
{
 	public void init()
 	{	
		setBackground(Color.blue);	
	}

	public void paint(Graphics g)
	{
		g.drawLine(80,60,20,60);
		g.drawString("Line",40,80);
		g.drawRect(20,100,80,40);
		g.drawString("Rectangle",35,165);
		g.drawRect(20,180,80,40);
		g.fillRect(20,180,80,40);
		g.drawString("Fill Rectangle",20,240);
		g.drawOval(20,270,80,50);
		g.drawString("Circle",40,340);
		g.drawOval(20,360,80,50);
		g.fillOval(20,360,80,50);
		g.drawString("Fill Circle",40,430);
	}
}
