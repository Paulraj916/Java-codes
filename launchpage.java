import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class launchpage implements ActionListener{
    

    JFrame frame = new JFrame();
    JButton mybutton = new JButton("NEW WINDOW");
    int i = 1 ;

    launchpage(){

        mybutton.setBounds(100,160,200,40);
        mybutton.setFocusable(false);
        mybutton.addActionListener(this);

        frame.add(mybutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==mybutton){
            
            newwindow mywindow = new newwindow(i);
            i++;
        }
        
    }

}
