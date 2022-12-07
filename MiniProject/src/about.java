import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class about extends JFrame{

    public about(){
            JFrame frame=new JFrame();
            
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("About Us");
            Container c=frame.getContentPane();
            c.setLayout(null);

            /*JPanel p1=new JPanel();
            p1.setBounds(0,0,200,400);
            p1.setBackground(Color.BLUE);
            p1.setLayout(null);
            c.add(p1);*/
            
            JButton btn1= new JButton("PROFILE");
            btn1.setBounds(10,10,100,20);
            frame.add(btn1);
            btn1.setForeground(Color.BLUE);
            btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profile Pro = new Profile();
                }
            });
            /*JButton btn2=new JButton("MAINTENANCE");
            btn2.setBounds(40,115,120,20);
            p1.add(btn2);
            btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Maintenance Maint = new Maintenance();
                    btn2.setForeground(Color.BLUE);
                }
            });
            JButton btn3=new JButton("COMPLAINTS");
            btn3.setBounds(40,165,120,20);
            p1.add(btn3);
            btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Complaint comp = new Complaint();
                    btn3.setForeground(Color.BLUE);
                }
            });
            JButton btn4=new JButton("EVENTS");
            btn4.setBounds(40,215,120,20);
            p1.add(btn4);
            btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Events Even = new Events();
                    btn4.setForeground(Color.BLUE);
                }
            });
            JButton btn5=new JButton("FEEDBACK");
            btn5.setBounds(40,265,120,20);
            p1.add(btn5);
            btn5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    btn5.setForeground(Color.BLUE);
                }
            });*/
            JButton btn6=new JButton("ABOUT US");
            btn6.setBounds(350,10,100,20);
            frame.add(btn6);
            btn6.setForeground(Color.BLUE);
            /*btn6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            });*/
            /*ImageIcon Img = new ImageIcon("C:\\Users\\Surya\\Desktop\\img\\profile.png");
            JLabel profile = new JLabel();
            p1.add(profile);
            profile.setIcon(Img);
            profile.setBounds(75,10,50,50);*/

            ImageIcon I = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\aboutfinal.jpg");
            JLabel j1 = new JLabel(I, JLabel.CENTER);
            j1.setBounds(0,0,700,400);
            frame.add(j1);
            j1.setIcon(I);
            validate();

            frame.setVisible(true);
    }
}