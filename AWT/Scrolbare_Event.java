import java.awt.*;
import java.awt.event.*;
public class Scrolbare_Event extends Frame {
    Scrollbar s;
    Label l;
Scrolbare_Event()
{
    new Label();
    l.setAlignment(l.CENTER);
    l.setSize(400,100);
   new Scrollbar();
    s.setBounds(100,100,50,100);
    add(s);
    add(l);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    s.addAdjustmentListener(new AdjustmentListener() {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            l.setText("Vertical Scrollbar value is:"+s.getValue());
        }
    });
 
}
 public static void main(String[] args) {
        // write your code here
        new Scrolbare_Event();
    }
}