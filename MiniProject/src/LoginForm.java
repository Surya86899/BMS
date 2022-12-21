import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class LoginForm1{
    public LoginForm1(){
            JFrame frame=new JFrame();
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("LOGIN FORM");
            Container c=frame.getContentPane();
            c.setLayout(null);
 
            JButton l1=new JButton("USERNAME");
            JButton l2=new JButton("PASSWORD");
            l1.setBounds(180,100,130,20);
            l2.setBounds(180,150,130,20);
            c.add(l1);
            c.add(l2);
            
            JTextField t1=new JTextField();
            t1.setBounds(320,100,120,20);
            c.add(t1);
            
            JPasswordField p1=new JPasswordField();
            p1.setBounds(320,150,120,20);
            c.add(p1);

            JButton btn=new JButton("Login");
            btn.setBounds(250,200,120,20); 
            c.add(btn);
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profile Pro = new Profile();
                }
            });

            ImageIcon Img = new ImageIcon("BMS\\MiniProject\\img\\LO.jpeg");
            JLabel b1 = new JLabel("LOGIN",Img,JLabel.CENTER);
            b1.setBounds(0, 0, 700, 400);
            b1.setIcon(Img);
            frame.add(b1);

            frame.setVisible(true);
        }
    }