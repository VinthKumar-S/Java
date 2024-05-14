
import java.awt.*;
import java.awt.event.*;
public class menus extends Frame implements ActionListener,ItemListener{
    MenuBar mb;
    Menu File,Edit,More;
    MenuItem O,s,Sa,cut,copy,paste;
    CheckboxMenuItem Exit,Delete;
    Label l1,l2,l3;
    menus()
    {
        mb=new MenuBar();
        l1=new Label();
        l2=new Label();
	l3=new Label();
        l1.setBounds(50,200,250,20);
        l2.setBounds(50,240,250,20);
	l3.setBounds(50,280,250,20);
        File=new Menu("File");
        O=new MenuItem("Open");
        s=new MenuItem("Save");
        Sa=new MenuItem("Save as");
        File.add(O);
        File.add(s);
        File.add(Sa);
        Edit=new Menu("Edit");
        cut=new MenuItem("cut");
        copy=new MenuItem("copy");
        paste=new MenuItem("paste");
        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        More=new Menu(" Special");
        Exit=new CheckboxMenuItem("Debug");
        Delete=new CheckboxMenuItem("Testing");
        More.add(Exit);
        More.add(Delete);
        Edit.add(More);
        mb.add(File);
        mb.add(Edit);
        add(l1);
        add(l2);
	add(l3);
        addWindowListener(new WindowAdapter() {
           
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        O.addActionListener(this);
        s.addActionListener(this);
        Sa.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        Exit.addItemListener(this);
        Delete.addItemListener(this);
        setMenuBar(mb);
        setLayout(null);
        setVisible(true);
        setSize(400,40);
    }

    public static void main(String[] args) {
	// write your code here
        new menus();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == O) {
            l1.setText("Your are Selected the:Open on " + File.getLabel() + "Menu");
        } else if (e.getSource() == s) {
            l1.setText("Your are Selected the:Save on " + File.getLabel() + "Menu");
        } else if (e.getSource() == Sa) {
            l1.setText("Your are Selected the:Save as on " + File.getLabel() + "Menu");
        } else if (e.getSource() == cut) {
            l1.setText("Your are Selected the:cut on " + Edit.getLabel() + "Menu");
        } else if (e.getSource() == copy) {
            l1.setText("Your are Selected the:copy on " + Edit.getLabel() + "Menu");
        } else if (e.getSource() == paste) {
            l1.setText("Your are Selected the:paste on " + Edit.getLabel() + "Menu");
        }
        }
    public void itemStateChanged(ItemEvent e)
    {
        if(Exit.getState()==true)
        {
            l2.setText(Exit.getLabel()+" is clicked");
        }
        else if(Exit.getState()==false)
        {
            l2.setText(" ");
        }
        if(Delete.getState()==true)
        {
            l3.setText(Delete.getLabel()+" is clicked");
        }
        else if(Exit.getState()==false)
        {
            l3.setText(" ");
        }

    }
}
