import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreateAccount{
    public CreateAccount(){
            JFrame frame=new JFrame();
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("CREATE ACCOUNT");
            Container c=frame.getContentPane();
            c.setLayout(null);


            JLabel l1=new JLabel("NAME");
            JLabel l2=new JLabel("USERNAME");
			JLabel l3=new JLabel("EMAIL");
			JLabel l4=new JLabel("CONTACT NO.");
            JLabel l5=new JLabel("PASSWORD");
			JLabel l6=new JLabel("RE-TYPE PASSWORD");
            l1.setBounds(100,30,120,20);
            l2.setBounds(100,80,120,20);
			l3.setBounds(100,130,120,20);
			l4.setBounds(100,180,120,20);
			l5.setBounds(100,230,120,20);
			l6.setBounds(100,280,120,20);
            l1.setForeground(Color.WHITE);
            l2.setForeground(Color.WHITE);
            l3.setForeground(Color.WHITE);
            l4.setForeground(Color.WHITE);
            l5.setForeground(Color.WHITE);
            l6.setForeground(Color.WHITE);
            l1.setFont(new Font("ARIAL",Font.BOLD,15));
            l2.setFont(new Font("ARIAL",Font.BOLD,15));
            l3.setFont(new Font("ARIAL",Font.BOLD,15));
            l4.setFont(new Font("ARIAL",Font.BOLD,15));
            l5.setFont(new Font("ARIAL",Font.BOLD,15));
            l6.setFont(new Font("ARIAL",Font.BOLD,15));
            c.add(l1);
            c.add(l2);
			c.add(l3);
			c.add(l4);
			c.add(l5);
			c.add(l6);
            
            JTextField t1=new JTextField();
            t1.setBounds(300,30,120,20);
		    JTextField t2=new JTextField();
            t2.setBounds(300,80,120,20);
			JTextField t3=new JTextField();
            t3.setBounds(300,130,120,20);
			JTextField t4=new JTextField();
            t4.setBounds(300,180,120,20);
            JPasswordField p1=new JPasswordField();
            p1.setBounds(300,230,120,20);
	        JPasswordField p2=new JPasswordField();
            p2.setBounds(300,280,120,20);
            
            c.add(t1);
            c.add(t2);
            c.add(t3);
            c.add(t4);
            c.add(p1);
            c.add(p2);

            JButton btn=new JButton("Register");
            btn.setBounds(200,320,120,30);
            btn.setFont(new Font("Arial",Font.PLAIN,20));
            c.add(btn);
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    LoginForm1 Log = new  LoginForm1();
                }   
            });

            ImageIcon Img = new ImageIcon("C:\\Users\\Surya\\Desktop\\img\\CR.jpg");
            JLabel b1 = new JLabel();
            b1.setBounds(0, 0, 700, 400);
            b1.setIcon(Img);
            frame.add(b1);

            frame.setVisible(true);
    }
}