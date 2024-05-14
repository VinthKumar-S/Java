import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testing extends JFrame implements ActionListener{
    public JButton button;
    public boolean check;

    public void paint(Graphics g){
        if(check==true){
            g.setColor(Color.red);
            g.fillRect(30, 50, 50, 50);
        }
    }

    public void start(){
        setLayout(new BorderLayout());
        button=new JButton();

        button.setPreferredSize(new Dimension(200,20));
        button.setText("ClickMe"); 
        button.addActionListener(this);

        add(button, BorderLayout.SOUTH);
        setSize(500,500);
        setVisible(true);
    }    

    public void actionPerformed(ActionEvent e) {    
        check=true;
    }

    public static void main(String args[]){
         testing x=new testing();
        x.start();
    }
}