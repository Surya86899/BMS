import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Events{
    public Events(){
            JFrame frame=new JFrame();
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("EVENTS");
            Container c=frame.getContentPane();
            c.setLayout(null);
            
            JPanel p1=new JPanel();
            p1.setBounds(0,0,200,400);
            p1.setBackground(Color.BLUE);
            p1.setLayout(null);
            c.add(p1);
            
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
                public void actionPerformed(ActionEvent e){
                    Complaint comp = new Complaint();
                    btn3.setForeground(Color.BLUE);
                }
            });
            JButton btn4=new JButton("EVENTS");
            btn4.setBounds(40,215,120,20);
            p1.add(btn4);
            btn4.setForeground(Color.BLUE);
            /*btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Events Even = new Events();
                }
            });*/
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
            
            JTextField t1=new JTextField("RECENT EVENT");
            t1.setBounds(250,50,120,30);
            t1.setBackground(Color.ORANGE);
            c.add(t1);
            String[] values={"GANESH UTSAV","SATYANARAYAN POOJA"};
            JComboBox c1=new JComboBox(values);
            c1.setBounds(250,100,175,30);
            c.add(c1);
            c1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(e.getSource().equals(c1)){
                    ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\ganesh.jpg");
                    JLabel qr = new JLabel();
                    qr.setBounds(400,175,100,100);
                    frame.add(qr);
                    qr.setIcon(Im);
                    }
                }
            });

            JTextField t2=new JTextField("UPCOMING");
            t2.setBounds(450,50,120,30);
            t2.setBackground(Color.ORANGE);
            c.add(t2);
            String[] Upcoming={"NAVRATRI","DUSSHERA","DIWALI","NEW YEAR"};
            JComboBox c2=new JComboBox(Upcoming);
            c2.setBounds(450,100,175,30);
            c.add(c2);

            ImageIcon Img = new ImageIcon("C:\\Users\\Surya\\Desktop\\img\\profile.png");
           JLabel profile = new JLabel();
           p1.add(profile);
           profile.setIcon(Img);
           profile.setBounds(75,10,50,50);
           frame.setVisible(true);

           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);
           
           frame.setVisible(true);
        }
    }

