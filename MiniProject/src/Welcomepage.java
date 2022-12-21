import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class Welcomepage extends Frame{
    private JLabel l1;
    private Button bt1;
    public Welcomepage(){
        
        
        JFrame f = new JFrame("Welcome");
        f.setLocation(100,100);
        f.setSize(700,400);
        f.getContentPane().setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        c.setLayout(null);

        JButton bt = new JButton("Login");
        bt.setBounds(150,200, 120, 30);
        bt.setFont(new Font("Corbel",Font.PLAIN,30));
        bt.setForeground(Color.BLUE);
        c.add(bt);
        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm1 Log = new  LoginForm1();
            }
        });

        JButton bt1 = new JButton("Register");
        bt1.setBounds(400,200,150, 30);
        bt1.setFont(new Font("Corbel",Font.PLAIN,30));
        bt1.setForeground(Color.BLUE);
        c.add(bt1);
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CreateAccount Cr = new CreateAccount();
            }
        });

        ImageIcon Img = new ImageIcon("BMS\\MiniProject\\img\\BMS.jpg");
        l1 = new JLabel("Profile",Img,JLabel.CENTER);
        l1.setBounds(0, 0, 700, 400);
        l1.setIcon(Img);
        f.add(l1);
        validate();

        JLabel l2 = new JLabel("Building");
        l2.setBounds(55,40,150, 40);
        l2.setFont(new Font("Corbel",Font.BOLD,40));
        l1.add(l2);
        JLabel l3 = new JLabel("Management");
        l3.setBounds(20,80,250, 40);
        l3.setFont(new Font("Corbel",Font.BOLD,40));
        l1.add(l3);
        JLabel l4 = new JLabel("System");
        l4.setBounds(58,120,150, 40);
        l4.setFont(new Font("Corbel",Font.BOLD,40));
        l1.add(l4);

        f.setVisible(true);
    }
}
