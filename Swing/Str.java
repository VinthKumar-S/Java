
import javax.swing.*;
import java.awt.*;
/*<applet code= "Str" width=300 height=500>
 </applet> */
public class Str extends JApplet{
    boolean animationDone;
    int centerx,centery;
    int w,h;
    public void init()
    {
        centerx=centery=200;
        w=h=100;
        new Thread()
        {
            public void run(){
             while (!animationDone)
             {
                 updateAnimation();
                 repaint();
                 delayAnimation();
             }
            }
        }.start();
    }
    public void updateAnimation()
    {
        w+=2;
        h+=2;
    }
       public void delayAnimation()
    {
        try{
            Thread.sleep(30);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
        public void paint(Graphics g) {
            g.setColor(Color.green);
            g.fillOval(centerx - w / 2, centery - h / 2, w, h);
        }
    
   
}
