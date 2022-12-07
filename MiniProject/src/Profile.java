import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Profile extends JFrame{
     public Profile(){
            JFrame frame=new JFrame();
            
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("PROFILE");
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
            btn1.setForeground(Color.BLUE);
            /*btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profile Pro = new Profile();
                }
            });*/
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
            });
            JButton btn6=new JButton("ABOUT US");
            btn6.setBounds(40,315,120,20);
            p1.add(btn6);
            btn6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    about ab = new about();
                    btn6.setForeground(Color.BLUE);
                }
            });

            JTextField t1=new JTextField("Shivay");
            t1.setBounds(300,110,220,20);
            t1.setEditable(false);
		    JTextField t2=new JTextField("dora42240@gmail.com");
            t2.setBounds(300,160,220,20);
            t2.setEditable(false);
			JTextField t3=new JTextField("868998888");
            t3.setBounds(300,210,220,20);
            t3.setEditable(false);
			JTextField t4=new JTextField("4");
            t4.setBounds(300,260,220,20);
            t4.setEditable(false);
            JTextField t5=new JTextField("202-C-Wing");
            t5.setBounds(300,310,220,20);
            t5.setEditable(false);
	        
            c.add(t1);
            c.add(t2);
            c.add(t3);
            c.add(t4);
            c.add(t5);

            JLabel l1=new JLabel("ROOM NO");
            JLabel l2=new JLabel("NAME");
			JLabel l3=new JLabel("EMAIL ID");
			JLabel l4=new JLabel("CONTACT NO");
            JLabel l5=new JLabel("NO OF FAMILY MEMBERS");
            l2.setBounds(300,80,200,20);
			l3.setBounds(300,130,200,20);
			l4.setBounds(300,180,200,20);
			l5.setBounds(300,230,200,20);
            l1.setBounds(300,280,200,20);
            c.add(l1);
            c.add(l2);
			c.add(l3);
			c.add(l4);
			c.add(l5);

           ImageIcon Img = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\profile.png");
           JLabel profile = new JLabel();
           p1.add(profile);
           profile.setIcon(Img);
           profile.setBounds(75,10,50,50);
           frame.setVisible(true);

           JLabel profile1 = new JLabel();
           frame.add(profile1);
           profile1.setIcon(Img);
           profile1.setBounds(380,20,50,50);
           frame.setVisible(true);

           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);
           frame.setVisible(true);

           
           frame.setVisible(true);
        }
    }
    
    