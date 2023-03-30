import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
 
public class MainFrame extends JFrame {
 
    MainFrame(){
 
        initComponents();
    }
 
    private void initComponents() {
 
        this.setSize( 300, 200);
        this.setTitle( "Kör kerület");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,1));
 
        JPanel mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
 
        JPanel northPnl = new JPanel();
        northPnl.setSize(300,10);
        mainPnl.add(northPnl,BorderLayout.NORTH);
 
        JPanel eastPnl = new JPanel();
        eastPnl.setSize(10,140);
        mainPnl.add(eastPnl,BorderLayout.EAST);
 
        JPanel westPnl = new JPanel();
        westPnl.setSize(10,140);
        mainPnl.add(westPnl,BorderLayout.WEST);
 
        JPanel southPnl = new JPanel();
        southPnl.setSize(300,30);
        southPnl.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton exitBtn = new JButton("Kilépés");
        southPnl.add(exitBtn);
        mainPnl.add(southPnl, BorderLayout.SOUTH);
 
        JPanel centerPnl = new JPanel();
 
        this.add(mainPnl);
 
    }
}