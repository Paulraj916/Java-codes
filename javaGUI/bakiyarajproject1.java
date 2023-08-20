import java.awt.*;
//import java.awt.event.*;
//import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
public class bakiyarajproject1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("BAKIYA RAJ LAFT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.setVisible(true); 
        
        float lnfeet,lninch,height;

        int nodoors = Integer.parseInt(JOptionPane.showInputDialog("Enter the no. of doors you want : "));
        lnfeet = Float.parseFloat(JOptionPane.showInputDialog("Enter the length of laft feet :  "));
        lninch = Float.parseFloat(JOptionPane.showInputDialog("and inches :  "));
        int lnremain = 0;
        float lnmain = 0f;
        lnremain = Integer.parseInt(JOptionPane.showInputDialog("1/8 : 1 | 1/4 : 2 | 3/8 : 3 | 1/2 : 4 | 5/8 : 5 | 3/4 : 6 | 7/8 : 7 | 0 : 0 "));
        if (lnremain == 1) {
            lnmain = lnremain;
            lnmain = 0.125f;
        } 
        else if(lnremain == 2)
         {
            lnmain = lnremain;
            lnmain = 0.25f;
        }
        else if(lnremain == 3)
         {
            lnmain = lnremain;
            lnmain = 0.375f;
        }
        else if(lnremain == 4)
         {
            lnmain = lnremain;
            lnmain = 0.5f;
        }
        else if(lnremain == 5)
         {
            lnmain = lnremain;
            lnmain = 0.625f;
        }
        else if(lnremain == 6)
         {
            lnmain = lnremain;
            lnmain = 0.75f;
        }
        else if(lnremain == 7)
         {
            lnmain = lnremain;
            lnmain = 0.875f;

        }
        else if(lnremain == 0)
         {
            lnmain = lnremain;
            lnmain = 0;

        }
        
        height = Float.parseFloat(JOptionPane.showInputDialog("Enter the total height of laft : "));
        int heightremain = 0;
        float lnmain1 = 0f;
        heightremain = Integer.parseInt(JOptionPane.showInputDialog("1/8 : 1 | 1/4 : 2 | 3/8 : 3 | 1/2 : 4 | 5/8 : 5 | 3/4 : 6 | 7/8 : 7 | 0 : 0 "));
        
        if (heightremain == 1) {
            lnmain1 = heightremain;
            lnmain1 = 0.125f;
        } 
        else if(heightremain== 2)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.25f;
        }
        else if(heightremain == 3)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.375f;
        }
        else if(heightremain == 4)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.5f;
        }
        else if(heightremain == 5)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.625f;
        }
        else if(heightremain == 6)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.75f;
        }
        else if(heightremain== 7)
         {
            lnmain1 = heightremain;
            lnmain1 = 0.875f;

        }
        else if(heightremain == 0)
         {
            lnmain1 = heightremain;
            lnmain1 = 0;

        }
        int slap1 = Integer.parseInt(JOptionPane.showInputDialog("height of the slap : "));
        int slapremain = 0;

        slapremain = Integer.parseInt(JOptionPane.showInputDialog("1/8 : 1 | 1/4 : 2 | 3/8 : 3 | 1/2 : 4 | 5/8 : 5 | 3/4 : 6 | 7/8 : 7 | 0 : 0 "));
        float slapremain1 = 0;
        if (slapremain == 1) {
            slapremain1 = slapremain;
            slapremain1 = 0.125f;
        } 
        else if(slapremain== 2)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.25f;
        }
        else if(slapremain == 3)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.375f;
        }
        else if(slapremain == 4)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.5f;
        }
        else if(slapremain == 5)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.625f;
        }
        else if(slapremain == 6)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.75f;
        }
        else if(slapremain== 7)
         {
            slapremain1 = slapremain;
            slapremain1 = 0.875f;

        }
        else if(slapremain == 0)
         {
            slapremain1 = slapremain;
            slapremain1 = 0;

        }


        float ininch = lnfeet*12;
        float totinch = ininch+lninch+lnmain;
        float value1 = ((totinch-1.5f)/6)-0.25f;
        float totheight = height+lnmain1;
        float value2 = totheight-0.5f;
        float value3 = value2-(1+(3/8));
        float value4 = totinch/3;
        float value5 = value4+value4;
        float totslap = (slap1+slapremain1)+0.75f;

        JLabel label = new JLabel();
        label.setText(" 3/4 ");
        label.setBounds(65,149, 100,100);

        JLabel label1 = new JLabel();
        label1.setText(" "+value1+" x "+value2+" x "+nodoors);
        label1.setBounds(1000, 25, 600, 600);
        label1.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label2 = new JLabel();
        label2.setText(" 3.25 "+" x "+value3+"x 8");
        label2.setBounds(1000, 100, 600, 600);
        label2.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label3 = new JLabel();
        label3.setText(" 3.25 "+" x "+value5+" x 2 ");
        label3.setBounds(1000, 150, 600, 600);
        label3.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label4 = new JLabel();
        label4.setText(" 3.25 "+" x "+value4+" x 2 ");
        label4.setBounds(1000, 200, 600, 600);
        label4.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label5 = new JLabel();
        label5.setText(" "+totslap+" x "+ininch);
        label5.setBounds(1000, 250, 600, 600);
        label5.setFont(new Font("Comic Sans",Font.BOLD,30));


        if (nodoors==6) {
            JButton button0 = new JButton();
            button0.setBounds(95, 100, 5, 200);
            JButton button1 = new JButton();
            button1.setBounds(100, 100, 125, 200);
            button1.setBackground(new Color(170,255,255));
            button1.setText("Width "+value1+" ");
            JButton button2 = new JButton();
            button2.setBounds(225, 100, 125, 200);
            button2.setBackground(new Color(211,211,211));
            JButton button3 = new JButton();
            button3.setBounds(350, 100, 125, 200);
            button3.setBackground(new Color(170,255,255));
            button3.setText("Height "+value2+" ");
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
            slap.setText(" "+totslap+" ");


            
            frame.add(button0);
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);
            frame.add(button5);
            frame.add(button6);
            frame.add(button00);
            frame.add(slap);

            //JButton top = new JButton();
            //top.setBounds(95, 400, 755, 260);
            //top.setEnabled(false);
            //top.setBackground(Color.WHITE);
            JButton top1 = new JButton();
            top1.setBounds(95, 400, 505, 20);
            top1.setText(" "+value5+" ");
            top1.setBackground(Color.WHITE);


            JButton top2 = new JButton();
            top2.setBounds(605, 400, 245, 20);
            top2.setText(" "+value4+" ");
            top2.setBackground(Color.WHITE);

            JButton line = new JButton();
            line.setBounds(95, 420, 755, 10);

            JButton topvertical1 = new JButton();
            topvertical1.setBounds(600, 400, 5, 20);

            JButton vertical1 = new JButton();
            vertical1.setBounds(95, 430, 5, 200);

            JButton verticalbox1 = new JButton();
            verticalbox1.setBounds(100, 430, 250, 200);
            verticalbox1.setBackground(Color.WHITE);

            JButton vertical2 = new JButton();
            vertical2.setBounds(350, 430, 5, 200);

            JButton verticalbox2 = new JButton();
            verticalbox2.setBounds(355, 430, 245, 200);
            verticalbox2.setText("Inner Height : "+value3+" ");
            verticalbox2.setBackground(Color.WHITE);

            JButton vertical3 = new JButton();
            vertical3.setBounds(600, 430, 5, 200);

            JButton verticalbox3 = new JButton();
            verticalbox3.setBounds(605, 430, 240, 200);
            verticalbox3.setBackground(Color.WHITE);
           
            JButton vertical4 = new JButton();
            vertical4.setBounds(845, 430, 5, 200);

            JButton hori = new JButton();
            hori.setBounds(95, 630, 755, 5);

            JButton hori1 = new JButton();
            hori1.setBounds(95, 635, 755, 20);
            //hori1.setBackground(Color.WHITE);
            
            
            frame.add(line);
            frame.add(vertical1);
            frame.add(vertical2);
            frame.add(vertical3);
            frame.add(vertical4);
            frame.add(hori);
            frame.add(topvertical1);
            frame.add(top1);
            frame.add(top2);
            frame.add(hori1);
            frame.add(verticalbox1);
            frame.add(verticalbox2);
            frame.add(verticalbox3);
            frame.add(label);
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            //frame.add(top);


        }
        if(nodoors!=6){
            JButton button0 = new JButton();
            button0.setBounds(95, 100, 5, 200);
            JButton button1 = new JButton();
            button1.setBounds(100, 100, 125, 200);
            button1.setBackground(new Color(170,255,255));
            button1.setText("Width "+value1+" ");
            JButton button2 = new JButton();
            button2.setBounds(225, 100, 125, 200);
            button2.setBackground(new Color(211,211,211));
            JButton button3 = new JButton();
            button3.setBounds(350, 100, 125, 200);
            button3.setBackground(new Color(170,255,255));
            button3.setText("Height "+value2+" ");
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
            slap.setText(" "+totslap+" ");


            frame.add(button0);
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);
            frame.add(button5);
            frame.add(button00);
            frame.add(slap);


            //JButton top = new JButton();
            //top.setBounds(95, 400, 635, 260);
            //top.setEnabled(false);
            //top.setBackground(Color.WHITE);
            JButton top1 = new JButton();
            top1.setBounds(95, 400, 505,20);
            top1.setText(" "+value5+" ");

            JButton top2 = new JButton();
            top2.setBounds(605, 400, 125, 20);
            top2.setText(" "+value4+" ");

            JButton line = new JButton();
            line.setBounds(95, 420, 635, 10);

            JButton topvertical1 = new JButton();
            topvertical1.setBounds(600, 400, 5, 20);

            JButton vertical1 = new JButton();
            vertical1.setBounds(95, 430, 5, 200);

            JButton verticalbox1 = new JButton();
            verticalbox1.setBounds(100, 430, 250, 200);

            JButton vertical2 = new JButton();
            vertical2.setBounds(350, 430, 5, 200);

            JButton verticalbox2 = new JButton();
            verticalbox2.setBounds(355, 430, 245, 200);
            verticalbox2.setText("Inner Height : "+value3+" ");

            JButton vertical3 = new JButton();
            vertical3.setBounds(600, 430, 5, 200);

            JButton verticalbox3 = new JButton();
            verticalbox3.setBounds(605, 430, 120, 200);

            JButton vertical4 = new JButton();
            vertical4.setBounds(725, 430, 5, 200);

            JButton hori = new JButton();
            hori.setBounds(95, 630, 635, 5);

            JButton hori1 = new JButton();
            hori1.setBounds(95, 635, 635, 20);
            
            
            frame.add(line);
            frame.add(vertical1);
            frame.add(vertical2);
            frame.add(vertical3);
            frame.add(vertical4);
            frame.add(hori);
            frame.add(topvertical1);
            frame.add(top1);
            frame.add(top2);
            frame.add(hori1);
            frame.add(verticalbox1);
            frame.add(verticalbox2);
            frame.add(verticalbox3);
            frame.add(label);
            //frame.add(top);

        }
    }
}
