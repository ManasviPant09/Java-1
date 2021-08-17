
import java.awt.BorderLayout;
import java.swing.JFrame;
import java.swing.JPanel;
public class GUI{
    public GUI(){
        javax.swing.JFrame frame = new JFrame();
        javax.swing.JPanel panel = new JPanel();
        
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        GUI g = new GUI();
    }
}
