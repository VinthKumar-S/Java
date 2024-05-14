
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.FormattableFlags;
/*<applet code="MouseAction" width=500 height=500>
</applet> */
public class MouseAction extends Applet implements MouseListener,MouseMotionListener
{
    String msg;
     public void init()
     {
	
       addMouseListener(this);
       addMouseMotionListener(this);
     }
    
    public void mouseClicked(MouseEvent e) 
    {
       msg="MouseClicked"; 
       repaint();
    }

    
    public void mousePressed(MouseEvent e) 
    {
    msg="MousePressed";
    repaint();
    }

    
    public void mouseReleased(MouseEvent e) 
    {
        msg="MouseReleased";
        repaint();  
    }

    
    public void mouseEntered(MouseEvent e) 
    {
        msg="MouseEntered";
        repaint();
    }

    
    public void mouseExited(MouseEvent e) 
    {
        msg="MouseExited";
        repaint();
    }

    
    public void mouseDragged(MouseEvent e) 
    {
        msg="MouseDragged";
        repaint();
    }

    
    public void mouseMoved(MouseEvent e)
    {
        msg="MouseMoved";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
    }
}
