import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.*;
public class popup_menu {
    popup_menu()
    {
        final Frame f=new Frame();
       final PopupMenu popup=new PopupMenu();
       MenuItem cut=new MenuItem("cut");
       cut.setActionCommand("cut");
        MenuItem copy=new MenuItem("copy");
        cut.setActionCommand("copy");
        MenuItem paste=new MenuItem("paste");
        cut.setActionCommand("paste");
        popup.add(cut);
        popup.add(copy);
        popup.add(paste);
        f.addMouseListener(new MouseInputAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                popup.show(f,e.getX(),e.getY());
                super.mouseClicked(e);
            }
        });
        f.add(popup);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
    new popup_menu();
    }
}
