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

            taskbar tas = new taskbar(p1);
            
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
                    ImageIcon Im = new ImageIcon("BMS\\MiniProject\\img\\ganesh.jpg");
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

           ImageIcon Im = new ImageIcon("BMS\\MiniProject\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);
           
           frame.setVisible(true);
        }
    }

