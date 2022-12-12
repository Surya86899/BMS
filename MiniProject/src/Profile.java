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
            
            taskbar tas = new taskbar(p1);
            //tas.btn1.setForeground(Color.blue);

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

           ImageIcon Img = new ImageIcon("MiniProject\\img\\profile.png");
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

           ImageIcon Im = new ImageIcon("MiniProject\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);
           frame.setVisible(true);

           
           frame.setVisible(true);
        }
    }
    
    