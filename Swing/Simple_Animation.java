
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Simple_Animation extends JPanel implements ActionListener{
    private static JButton l_to_r,up_down;
    Timer tr=new Timer(10,this);
    int x=0,velx=2;
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x,30,50,30);
        tr.start();
    }
    public static void main(String[] args) {
	// write your code here
         Simple_Animation sa=new Simple_Animation();
       JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(sa);
    }

    
    public void actionPerformed(ActionEvent e) {
        if(x<0||x>550)
        {
            velx=-velx;
        }
        x=x+velx;
        repaint();
    }
}
