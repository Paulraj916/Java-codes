import java.awt.Color;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class tension {
    float lnremain;
    tension(float lnremain){

            JFrame frame = new JFrame();
               frame.setTitle("BAKIYA RAJ LAFT");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setLayout(null);
               frame.setSize(1000,1000);
               frame.setVisible(true);
               float lnfeet,lninch;
       
               Scanner scanner = new Scanner(System.in);
               System.out.print("Enter the no. of doors you want : ");
               int nodoors = scanner.nextInt();
               System.out.print("Enter the length of laft feet and inches : ");
               lnfeet = scanner.nextInt();
               lninch = scanner.nextInt();
               float ininch =lnfeet*12;
               float totinch =ininch+lninch;//+lnremain;
               float value1 = ((totinch-1.5f)/6)-0.25f;
               System.out.println(value1);
            
       
       
               if (nodoors==6) {
                   JButton button0 = new JButton();
                   button0.setBounds(95, 100, 5, 200);
                   JButton button1 = new JButton();
                   button1.setBounds(100, 100, 125, 200);
                   button1.setBackground(new Color(170,255,255));
                   JButton button2 = new JButton();
                   button2.setBounds(225, 100, 125, 200);
                   button2.setBackground(new Color(211,211,211));
                   JButton button3 = new JButton();
                   button3.setBounds(350, 100, 125, 200);
                   button3.setBackground(new Color(170,255,255));
                   JButton button4 = new JButton();
                   button4.setBounds(475, 100, 125, 200);
                   button4.setBackground(new Color(211,211,211));
                   JButton button5 = new JButton();
                   button5.setBounds(600, 100, 125, 200);
                   button5.setBackground(new Color(170,255,255));
                   JButton button6 = new JButton();
                   button6.setBounds(725, 100, 125, 200);
                   button6.setBackground(new Color(211,211,211));
                   JButton button00 = new JButton();
                   button00.setBounds(850, 100, 5, 200);
                   JButton slap = new JButton();
                   slap.setBounds(95, 300,760, 20);
       
       
                   
                   frame.add(button0);
                   frame.add(button1);
                   frame.add(button2);
                   frame.add(button3);
                   frame.add(button4);
                   frame.add(button5);
                   frame.add(button6);
                   frame.add(button00);
                   frame.add(slap);
       
                   JButton top = new JButton();
                   top.setBounds(95, 400, 755, 260);
                   top.setEnabled(false);
                   top.setBackground(Color.WHITE);
                   JButton line = new JButton();
                   line.setBounds(95, 420, 755, 10);
                   JButton topvertical1 = new JButton();
                   topvertical1.setBounds(600, 400, 5, 20);
                   JButton vertical1 = new JButton();
                   vertical1.setBounds(95, 430, 5, 200);
                   JButton vertical2 = new JButton();
                   vertical2.setBounds(350, 430, 5, 200);
                   JButton vertical3 = new JButton();
                   vertical3.setBounds(600, 430, 5, 200);
                   JButton vertical4 = new JButton();
                   vertical4.setBounds(845, 430, 5, 200);
                   JButton hori = new JButton();
                   hori.setBounds(95, 630, 755, 5);
                   
                   
                   frame.add(line);
                   frame.add(vertical1);
                   frame.add(vertical2);
                   frame.add(vertical3);
                   frame.add(vertical4);
                   frame.add(hori);
                   frame.add(topvertical1);
                   frame.add(top);
       
       
               }
               if(nodoors!=6){
                   JButton button0 = new JButton();
                   button0.setBounds(95, 100, 5, 200);
                   JButton button1 = new JButton();
                   button1.setBounds(100, 100, 125, 200);
                   button1.setBackground(new Color(170,255,255));
                   JButton button2 = new JButton();
                   button2.setBounds(225, 100, 125, 200);
                   button2.setBackground(new Color(211,211,211));
                   JButton button3 = new JButton();
                   button3.setBounds(350, 100, 125, 200);
                   button3.setBackground(new Color(170,255,255));
                   JButton button4 = new JButton();
                   button4.setBounds(475, 100, 125, 200);
                   button4.setBackground(new Color(211,211,211));
                   JButton button5 = new JButton();
                   button5.setBounds(600, 100, 125, 200);
                   button5.setBackground(new Color(170,255,255));
                   JButton button00 = new JButton();
                   button00.setBounds(725, 100, 5, 200);
       
                   JButton slap = new JButton();
                   slap.setBounds(95, 300,635, 20);
       
       
                   frame.add(button0);
                   frame.add(button1);
                   frame.add(button2);
                   frame.add(button3);
                   frame.add(button4);
                   frame.add(button5);
                   frame.add(button00);
                   frame.add(slap);
       
       
                   JButton top = new JButton();
                   top.setBounds(95, 400, 635, 260);
                   top.setEnabled(false);
                   top.setBackground(Color.WHITE);
                   JButton line = new JButton();
                   line.setBounds(95, 420, 635, 10);
                   JButton topvertical1 = new JButton();
                   topvertical1.setBounds(600, 400, 5, 20);
                   JButton vertical1 = new JButton();
                   vertical1.setBounds(95, 430, 5, 200);
                   JButton vertical2 = new JButton();
                   vertical2.setBounds(350, 430, 5, 200);
                   JButton vertical3 = new JButton();
                   vertical3.setBounds(600, 430, 5, 200);
                   JButton vertical4 = new JButton();
                   vertical4.setBounds(725, 430, 5, 200);
                   JButton hori = new JButton();
                   hori.setBounds(95, 630, 635, 5);
                   
                   
                   frame.add(line);
                   frame.add(vertical1);
                   frame.add(vertical2);
                   frame.add(vertical3);
                   frame.add(vertical4);
                   frame.add(hori);
                   frame.add(topvertical1);
                   frame.add(top);
       
               }
        }
       
   
    }

