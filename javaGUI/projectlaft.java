import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class projectlaft {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("BAKIYA RAJ LAFT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,700);
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
        float value1 = ((totinch-1.5f)/nodoors)-0.25f;
        float totheight = height+lnmain1;
        float value2 = totheight-0.5f;
        float value3 = value2-(1+(3/8));
        float value4 = totinch/3;
        float value5 = value4+value4;
        float totslap = (slap1+slapremain1)+0.75f;

        JLabel label1 = new JLabel();
        label1.setText(" "+value1+" x "+value2+" x "+nodoors);
        label1.setBounds(100, 0, 600, 600);
        label1.setFont(new Font("Comic Sans",Font.BOLD,30));
        int baki = 0;

        if (nodoors == 1) {
            baki = 4;
        } 
        else if(nodoors == 2)
         {
            baki = 4;
        }
        else if(nodoors == 3)
         {
           
            baki = 6;
        }
        else if(nodoors == 4)
         {
           
            baki = 6;
        }
        else if(nodoors == 5)
         {
            
            baki = 8;
        }
        else if(nodoors == 6)
         {
            
            baki = 8;
        }
        else if(nodoors == 7)
         {
           
            baki = 10;

        }
        else if(nodoors == 8)
         {
          
            baki = 10;

        }
        else if(nodoors == 9)
         {
           
            baki = 12;

        }
        else if(nodoors == 10)
         {
           
            baki = 12;

        }
        else if(nodoors == 11)
         {
          
            baki = 14;

        }
        else if(nodoors == 12)
         {
            
            baki = 14;

        }

        JLabel label2 = new JLabel();
        label2.setText(" 3.25 "+" x "+value3+"x "+baki);
        label2.setBounds(100, 75, 600, 600);
        label2.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label3 = new JLabel();
        label3.setText(" 3.25 "+" x "+value5+" x 2 ");
        label3.setBounds(100, 125, 600, 600);
        label3.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label4 = new JLabel();
        label4.setText(" 3.25 "+" x "+value4+" x 2 ");
        label4.setBounds(100, 175, 600, 600);
        label4.setFont(new Font("Comic Sans",Font.BOLD,30));

        JLabel label5 = new JLabel();
        label5.setText(" "+totslap+" x "+totinch);
        label5.setBounds(100, 225, 600, 600);
        label5.setFont(new Font("Comic Sans",Font.BOLD,30));

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);

    }
}
