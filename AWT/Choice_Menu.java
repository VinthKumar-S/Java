import java.awt.*;
public class Choice_Menu {
Choice_Menu()
{
    Frame f=new Frame("Choice Menu");
    Choice c=new Choice();
    c.add("Item 1");
    c.add("Item 2");
    c.add("Item 4");
    c.add("Item 5");
    c.setBounds(100,100,75,75);
    f.add(c);
    f.setVisible(true);
    f.setLayout(null);
    f.setSize(400,400);
}
    public static void main(String[] args) {
	// write your code here
        new Choice_Menu();
    }
}