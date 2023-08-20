import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
public class watchtime {
    public static void main(String[] args) {
        int j =1;
        int k,seconds,minutes,hours,date;
        seconds=0;

        JFrame frame = new JFrame();
        JProgressBar bar = new JProgressBar(0,100);
        JProgressBar bar01 = new JProgressBar(0,100);
        JProgressBar bar02 = new JProgressBar(0,100);
        JProgressBar bar03 = new JProgressBar(0,100);
        JProgressBar bar04 = new JProgressBar(0,100);

        bar.setString(" ");
		bar.setBounds(0,50,400,100);
		bar.setStringPainted(true);
		bar.setFont(new Font("Arial Italic",Font.BOLD,55));
		bar.setBackground(Color.black);

        bar01.setString("DATE");
		bar01.setBounds(0,0,100,50);
		bar01.setStringPainted(true);
		bar01.setFont(new Font("Arial Italic",Font.BOLD,15));
		bar01.setBackground(Color.black);

        bar02.setString("HOURS");
		bar02.setBounds(100,0,100,50);
		bar02.setStringPainted(true);
		bar02.setFont(new Font("Arial Italic",Font.BOLD,15));
		bar02.setBackground(Color.black);

        bar03.setString("MINUTES");
		bar03.setBounds(200,0,100,50);
		bar03.setStringPainted(true);
		bar03.setFont(new Font("Arial Italic",Font.BOLD,15));
		bar03.setBackground(Color.black);

        bar04.setString("SECONDS");
		bar04.setBounds(300,0,100,50);
		bar04.setStringPainted(true);
		bar04.setFont(new Font("Arial Italic",Font.BOLD,15));
		bar04.setBackground(Color.black);
        
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(415, 190);
        frame.setLayout(null);
		//frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.add(bar01);
        frame.add(bar02);
        frame.add(bar03);
        frame.add(bar04);
        frame.add(bar);
		frame.setVisible(true);

        date = Integer.parseInt(JOptionPane.showInputDialog("Enter the Date : "));
        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the time (hours) : "));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("Enter the time (minutes) : "));
        //date = 0;
        //minutes =0;
        //hours =0;

        for (double i = 1; i > 0;) {
            k = (int)i;
            if (k==j*24000000) {
                seconds+=1;
                if (seconds>=60){
                    minutes+=1;
                    seconds-=59;
                }
                if(minutes>=60){
                    hours+=1;
                    minutes-=59;
                }
                if(hours>=24){
                    date+=1;
                    hours-=24;
                }

                bar.setString(" "+date+" : "+hours+" : "+minutes+" : "+seconds+" ");
                  
               /* for(int o=0;o<=500;o++){
                    System.out.println();
                }
                System.out.println("______________________________________________________");
                System.out.println("|    DATE   |    HOURS  |    MINUTES   |   SECONDS   |");
                System.out.println("|     "+date+"     |      "+hours+"    |      "+minutes+"       |      "+seconds+"     |");
                System.out.println("|___________|___________|______________|_____________|");

            */  j++;

            }

            i+=0.1;

        }
    }
}
