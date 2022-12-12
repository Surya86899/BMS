import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class taskbar {
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;

    taskbar(JPanel p1){
            JButton btn1= new JButton("PROFILE");
            btn1.setBounds(40,65,120,20);
            p1.add(btn1);
            btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profile Pro = new Profile();
                    btn1.setForeground(Color.BLUE);
                }
            });
            JButton btn2=new JButton("MAINTENANCE");
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
                public void actionPerformed(ActionEvent a){
                    Complaint comp = new Complaint();
                    btn3.setForeground(Color.BLUE);
                }
            });
            JButton btn4=new JButton("EVENTS");
            btn4.setBounds(40,215,120,20);
            p1.add(btn4);
            btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent s){
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
            });
            JButton btn6=new JButton("ABOUT US");
            btn6.setBounds(40,315,120,20);
            p1.add(btn6);
            btn6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    about ab = new about();
                }
            });

            ImageIcon Img = new ImageIcon("MiniProject\\img\\profile.png");
            JLabel profile = new JLabel();
            p1.add(profile);
            profile.setIcon(Img);
            profile.setBounds(75,10,50,50);
    }
}
