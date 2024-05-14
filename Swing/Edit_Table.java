
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit_Table extends JFrame implements ActionListener {

    JTable j;
    JTextField t1;
    JLabel l1;
    JButton b1;
    Edit_Table()
    {
        String colname[]={"Name","Field"};
        String data[][]={{"Victor","Mechanical"},{"Steven","Marine"},{"Thomas","Aeronautical"}};
         j=new JTable(data,colname);
         j.setGridColor(Color.green);
         b1=new JButton("Submit");
         b1.addActionListener(this);
         t1=new JTextField(10);
         l1=new JLabel("Update:");
        JScrollPane sp=new JScrollPane(j);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Panel p1=new Panel();
            Panel p2=new Panel();
            p1.add(sp);
            p2.add(l1);
            p2.add(t1);
            p2.add(b1);
            p1.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
            p2.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
            add(p1);
            add(p2);
        setLayout(new GridLayout(2,1,10,10));
        setVisible(true);
        setSize(700,700);
        p1.setBackground(Color.pink);
        p2.setBackground(Color.green);
    }

    public static void main(String[] args) {
	// write your code here
        new Edit_Table();
    }

    public void actionPerformed(ActionEvent e)
    {
      int r=j.getSelectedRow(),c=j.getSelectedColumn();
      j.setValueAt(t1.getText(),r,c);
    }

}