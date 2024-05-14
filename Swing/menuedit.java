 import javax.swing.*; 
 import java.awt.*; 
 import java.awt.event.*; 
 import java.awt.datatransfer.*;
 class menuedit extends JFrame implements ActionListener
 {
    JMenuBar mb; 
    JMenu edit;
    JMenuItem cut,copy,paste,selectall;
    JTextArea ta;
    Clipboard cb=getToolkit().getSystemClipboard();
    menuedit()
    {
        ta=new JTextArea("It is MenuBar Edit Operation Program.");
        mb = new JMenuBar();
        edit =new JMenu("Edit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy"); 
        paste = new JMenuItem("Paste");
	selectall=new JMenuItem("Selected All");
        selectall.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        edit.add(cut); 
        edit.add(copy); 
        edit.add(paste);
	edit.add(selectall);  
        mb.add(edit); 
        setJMenuBar(mb);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        add(ta);
        setLayout(new GridLayout(1,1));
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==copy)
        {
            String s1 = ta.getSelectedText(); 
            if (s1 == null) 
                return; 
            StringSelection clipString =new StringSelection(s1); 
            cb.setContents(clipString,clipString); 
        }
        if(ae.getSource()==cut)
        {
            String s2 = ta.getSelectedText(); 
            if (s2 == null) 
                return; 
            StringSelection clipString1 =new StringSelection(s2); 
                cb.setContents(clipString1, clipString1); 
           ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());   
        }
        if(ae.getSource()==paste)
        {
            Transferable clipData = cb.getContents(this); 
            try 
            { 
                String clipString3 = (String)clipData.getTransferData(DataFlavor.stringFlavor); 
                ta.replaceRange(clipString3,ta.getSelectionStart(),ta.getSelectionEnd()); 
            }   
            catch(Exception ex) 
            { 
                System.err.println("Not Working"); 
            } 
        }
	
      if(ae.getSource()==selectall)
      { 
      ta.selectAll();
       }
    }
    public static void main(String args[])
    {
        new menuedit();
    }
 }

