import java.awt.*;
public class Bounds_Check {

        Bounds_Check(){
            Frame f=new Frame("Bounds");
         Button  b1=new Button("On Here");
            Button  b2=new Button("Am Here");
            Button  b3=new Button("Over Here");
            Button  b4=new Button("Yeah!");
            Button  b5=new Button("This is end");
         b1.setBounds(50,80,75,50);
            b2.setBounds(200,80,75,50);
            b3.setBounds(120,170,75,50);
            b4.setBounds(50,270,75,50);
            b5.setBounds(200,270,75,50);
        f. add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
        }
    public static void main(String[] args) {
	// write your code here
        new Bounds_Check();
    }
}