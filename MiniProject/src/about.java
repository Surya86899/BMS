import javax.swing.*;
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

            JButton btn1= new JButton("PROFILE");
            btn1.setBounds(10,20,100,20);
            frame.add(btn1);
            btn1.setForeground(Color.BLUE);
            btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profile Pro = new Profile();
                }
            });

            JButton btn6=new JButton("ABOUT US");
            btn6.setBounds(350,10,100,20);
            frame.add(btn6);
            btn6.setForeground(Color.BLUE);

            ImageIcon I = new ImageIcon("BMS\\MiniProject\\img\\aboutfinal.jpg");
            JLabel j1 = new JLabel(I, JLabel.CENTER);
            j1.setBounds(0,0,700,400);
            frame.add(j1);
            j1.setIcon(I);
            validate();

            frame.setVisible(true);
    }
}