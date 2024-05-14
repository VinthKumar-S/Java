import java.awt.*;

public class Scrolbare extends Frame {
    Scrolbare() {
        Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);
        add(s);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        new Scrolbare();
    }
}