import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class ScrollPaneExample {
private static void displayScollingGUI() {
final JFrame jFrame = new JFrame("Scroll Pane Example");
jFrame.getContentPane().setLayout(new FlowLayout());
JTextArea textArea = new JTextArea(10, 10);
JScrollPane scrollingArea = new JScrollPane(textArea);
scrollingArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollingArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
jFrame.getContentPane().add(scrollingArea);
jFrame.setSize(250, 250);
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jFrame.setVisible(true);
}
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
displayScollingGUI();
}
});
}
}