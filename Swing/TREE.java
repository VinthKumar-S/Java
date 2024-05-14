
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
public class TREE extends JFrame {
    JTree tree;
    JLabel jtf;
    DefaultMutableTreeNode parent1,parent2,child1,child2,child3,root;
 TREE()
{
    root=new DefaultMutableTreeNode("State");
    parent1=new DefaultMutableTreeNode("Tamilnadu");
    parent2=new DefaultMutableTreeNode("Pondicheryy");
    child1=new DefaultMutableTreeNode("Chennai");
    child2=new DefaultMutableTreeNode("Yanam");
    parent1.add(child1);
    parent2.add(child2);
    root.add(parent1);
    root.add(parent2);
    Panel p1=new Panel();
    Panel p2=new Panel();
    tree=new JTree(root);
    jtf=new JLabel();
    JScrollPane jsp=new JScrollPane(tree);
    p1.add(jsp);
    p1.setLayout(new FlowLayout(FlowLayout.LEFT));
    p2.add(jtf);
    p2.setLayout(new FlowLayout());
    add(p1);
    add(p2);

    tree.addMouseListener(new MouseAdapter() {

        public void mouseClicked(MouseEvent e)
        {
          TreePath tp=tree.getPathForLocation(e.getX(),e.getY());
          if(tp!=null)
              jtf.setText(tp.toString());
          else
              jtf.setText(" ");
        }
    });
    setLayout(new GridLayout(2,1,10,10));
    setVisible(true);
    setSize(600,600);
}
    public static void main(String[] args) {
	// write your code here
        new TREE();
    }
}
