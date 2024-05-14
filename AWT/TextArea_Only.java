import java.awt.*;
public class TextArea_Only extends Frame {
TextArea_Only()
{
    TextArea TA=new TextArea("Welcome to javapoint,Yeah nice the class very interesting,it help me too learn");
    TA.setBounds(10,30,300,300);
    add(TA);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
}
    public static void main(String[] args) {
	// write your code here
        new TextArea_Only();
    }
}