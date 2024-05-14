
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Animay extends JPanel implements ActionListener   {
    JButton upd,l_t,dig,stop;
    Container cp;
    JFrame jf;
    int x=0,y1=0,vx=30,control=0,x1=0;
    Timer tr=new Timer(30,  this);
    private rect r;
Animay()
{
    jf=new JFrame();
    upd=new JButton("up and down");

    l_t=new JButton("left to Right");

    dig=new JButton("Diagonal");
    JPanel p1=new JPanel();
    p1.add(upd);
    p1.add(l_t);
    p1.add(dig);
    p1.setLayout(new FlowLayout());
    cp=new Container();
    cp= jf.getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(p1,BorderLayout.SOUTH);
    r=new rect();
    r.setPreferredSize(new Dimension(80,40));
    cp.add(r,BorderLayout.CENTER);
    jf.setVisible(true);
    jf.setSize(600,400);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l_t.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

                if (x < 0 || x > 550)
                    vx = -vx;
                x = x + vx;
                x1=x;
                y1=30;

        }
    });
    upd.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            if (x < 0 || x > 370)
                vx = -vx;
            x = x + vx;
            y1=x;
            x1=30;
        }
    });
    dig.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            if (x < 0 || x > 370)
                vx = -vx;
            x = x + vx;
            y1=x;
            x1=x;
        }
    });

}


    public void actionPerformed(ActionEvent e) {
        r.repaint();
    }


    class rect extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.orange);
        g.setColor(Color.blue);
        g.fillOval(x1,y1,50,30);
        tr.start();
    }
}
public static void main(String []args)
{
  new Animay();
}

}
