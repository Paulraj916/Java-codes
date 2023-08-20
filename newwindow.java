import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newwindow {

    JFrame frame = new JFrame();
    public int i ;
    JLabel label; 

    newwindow(int i){

        this.i = i;
        label = new JLabel("Paul Raj "+i);

        label.setBounds(0,0,200,200);
        label.setFont(new Font(null,Font.BOLD,25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
    

}
