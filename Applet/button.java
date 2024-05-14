
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class button extends Applet implements ActionListener
{
	Button clk,clr;
	String msg;
	public void init()
	{
	msg="";
	clk=new Button("Click");
	clr=new Button("Clear");
	add(clk);
	add(clr);
	clk.addActionListener(this);
	clr.addActionListener(this);
	}
		
	public void paint(Graphics g)
	{
	g.drawString(msg,150,200);
	}
	public void actionPerformed(ActionEvent e)
	{
	String str=e.getActionCommand();
	if(str.equals("Click")== true)
	msg="Vinith Kumar";
	else
	msg="";
	repaint();
	}
	/* <applet code="button" height=400 width=400>
</applet> */
}