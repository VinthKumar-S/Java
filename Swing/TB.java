
import javax.swing.*;
import java.awt.*;

public class TB extends JFrame {
    TB()
    {
        String colname[]={"Name","Rollno","Department"};
        String data[][]={{"Kumar","4031","CSE"},{"Anand","6014","IT"}};
        JTable j=new JTable(data,colname);
        JScrollPane sp=new JScrollPane(j);
            add(sp);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
    }

    public static void main(String[] args) {
	// write your code here
        new TB();
    }
}
