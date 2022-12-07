import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Maintenance{
       public Maintenance(){
            JFrame frame=new JFrame();
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Maintenance");
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
            btn2.setForeground(Color.BLUE);
            /*btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Maintenance Maint = new Maintenance();
                }
            });*/
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
                    btn1.setForeground(Color.BLUE);
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

            JTextField t1=new JTextField("BUILDING:");
           t1.setBounds(250,100,100,20);
           c.add(t1);
           t1.setEditable(false);
           JTextField t2=new JTextField("Society Mentenance Bill");
           t2.setBounds(250,120,250,50);
           t2.setFont(new Font("Arial",Font.PLAIN,15));
           c.add(t2);
           t2.setEditable(false);

           JTextField t3=new JTextField("PERSONAL:");
           t3.setBounds(250,200,100,20);
           c.add(t3);
           t3.setEditable(false);
           JTextField t4=new JTextField("Electricity Bill"); 
           t4.setBounds(250,220,250,50);
           c.add(t4);
           t4.setFont(new Font("Arial",Font.PLAIN,15));
           t4.setEditable(false);
           JTextField t5=new JTextField("Water Bill"); 
           t5.setBounds(250,290,250,50);
           t5.setFont(new Font("Arial",Font.PLAIN,15));
           c.add(t5);
           t5.setEditable(false);

           JButton btn=new JButton("PAY");
           btn.setBounds(550,130,75,30);
           btn.setBackground(Color.RED);
           btn.setForeground(Color.YELLOW);
           c.add(btn);
           btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\QRF.jpg");
           JLabel qr = new JLabel();
           qr.setBounds(400,10,100,100);
           frame.add(qr);
           qr.setIcon(Im);
           btn.setBackground(Color.GREEN);
           btn.setForeground(Color.WHITE);
           btn.setText("PAID");
            }});
           JButton btn7=new JButton("PAY");
           btn7.setBounds(550,230,75,30);
           btn7.setBackground(Color.RED);
           btn7.setForeground(Color.YELLOW);
           c.add(btn7);
           btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\QRF.jpg");
           JLabel qr = new JLabel();
           frame.add(qr);
           qr.setIcon(Im);
           qr.setBounds(400,10,100,100);
           btn7.setBackground(Color.GREEN);
           btn7.setForeground(Color.WHITE);
           btn7.setText("PAID");
            }});
           JButton btn8=new JButton("PAID");
           btn8.setBounds(550,300,75,30);
           btn8.setBackground(Color.GREEN);
           btn8.setForeground(Color.WHITE);
           c.add(btn8);

           ImageIcon Img = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\profile.png");
           JLabel profile = new JLabel();
           p1.add(profile);
           profile.setIcon(Img);
           profile.setBounds(75,10,50,50);

           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);
           
           frame.setVisible(true);
    }
}
      
           


