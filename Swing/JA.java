
import java.applet.*;
import java.awt.*;
import javax.swing.*;
/*
 <applet code="JA" width=300 height=50>
 </applet>
*/
public class JA extends JApplet {
public void init()
{
    JButton b1=new JButton("submit");
   add(b1);
}
public void paintComponent(Graphics g)
{
 g.drawString("new one",30,30);
}
}