
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * @ Farand Al Rubaae
 * 01/ 10 2014 
 *
 */
 
 public class MyGUI extends JFrame {
 
 private Dimension dimFrame;
 
 private JMenuBar menu;
 private JMenu archive;
 private JMenu about;
 private JMenuItem help;
 private JMenuItem om;
 private JMenuItem terminate;
 
 public MyGUI(){
     this.initGUI();
 }

 private void initGUI(){
     
     this.dimFrame = new Dimension(400,300);
     
     this.setTitle("WAzzaa");
     this.setSize(dimFrame);
     this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
     
     this.menu = new JMenuBar();
     this.archive = new JMenu("Arkiv");
     this.terminate = new JMenuItem("Avsluta programmet");
     this.about = new JMenu("About");
     this.help = new JMenuItem("Help");
     this.om = new JMenuItem("About");
     
     this.setJMenuBar(menu);
     this.menu.add(archive);
     this.menu.add(about);
     this.archive.add(terminate);
     this.about.add(om);
     this.about.add(help);
     
     this.terminate.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed( ActionEvent e){
             System.exit(0);
         }
     });
     this.help.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed( ActionEvent e){
             JOptionPane.showMessageDialog(null, "Detta program kan" 
                     + "vi använder när vi jobbar med GUI");
         }
     });
     this.om.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed (ActionEvent e){
             JOptionPane.showMessageDialog(null, "Copyright:\n Farand Al Rubaae\n2014");
         }
     });
 }
 
 
 public static void main(String[] args){
     java.awt.EventQueue.invokeLater(new Runnable (){
         public void run(){
             new MyGUI().setVisible(true);
         }
     });
 }
 
 
 }
