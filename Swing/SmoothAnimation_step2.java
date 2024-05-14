
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
/*<applet code= "SmoothAnimation_step2" width=500 height=500>
 </applet> */

public class SmoothAnimation_step2 extends JApplet{
    Random r=new Random();
    class Circle
    {
        int centerx,centery,w,h,radius;
        Circle()
        {
          centerx=r.nextInt(600);
          centery=r.nextInt(400);
          radius=+10+r.nextInt(20);
        }
    }
   
    boolean animationDone;
    ArrayList<Circle>circle;
    public void init()
    {
        circle=new ArrayList<Circle>();
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
       circle.add(new Circle());
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
	    for(Circle c:circle)
		{
            g.setColor(Color.green);
            g.fillOval(c.centerx -c.radius, c.centery -c.radius, 2*c.radius,2*c.radius);
		}
        }

}
