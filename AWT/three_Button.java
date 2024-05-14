import java.awt.*;
public class three_Button {
    Frame f;
    Button  button1, button2, button3;
            three_Button(){
                f=new Frame("Frame to display button:");
                button1=new Button();
                button2=new Button();
                button3=new Button();
                button1.setLabel("Button 1");
                button2.setLabel("Button 2");
                button3.setLabel("Button 3");
                f.add(button1);
                f.add(button2);
                f.add(button3);

                f.setLayout(new FlowLayout());
                f.setSize(300,400);
                f.setVisible(true);

            }
  
    public static void main(String[] args) {
	// write your code here
       new three_Button();
    }
}