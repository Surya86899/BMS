import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Complaint extends JFrame{
    private Object btn1;
    private Object btn2;
    private Object btn3;
    private Object btn4;

    public Complaint(){
            JFrame frame=new JFrame();
            
            frame.setSize(700,400);
            frame.setLocation(100,100);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("COMPLAINT");
            Container c=frame.getContentPane();
            c.setLayout(null);

            JPanel p1=new JPanel();
            p1.setBounds(0,0,200,400);
            p1.setBackground(Color.BLUE);
            p1.setLayout(null);

            taskbar tas = new taskbar(p1);
            c.add(p1);

            String[] values = {"Problems","1. Neighbour Problem","2. Cleanliness Problem","3. Electricity Problem","4. Water Problem","5. Others"};
            JComboBox c1 = new JComboBox(values);
            c1.setBounds(300,50,200,20);
            c.add(c1);

            JTextField t2=new JTextField("Describe");
            t2.setBounds(300,175,150,20);
            c.add(t2);
            t2.setEditable(false);
            JTextField t1=new JTextField();
            t1.setBounds(300,200,200,80);
            c.add(t1);

           ImageIcon Im = new ImageIcon("C:\\Users\\Surya\\Desktop\\MyVs\\MiniProject\\img\\logom.png");
           JLabel logo = new JLabel();
           frame.add(logo);
           logo.setIcon(Im);
           logo.setBounds(600,10,75,99);

           JButton sub = new JButton("SUBMIT");
           sub.setBounds(320,300,100,25);
           sub.setFont(new Font("Arial",Font.PLAIN,10));
           //frame.add(sub);
           c.add(sub);
           sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setForeground(Color.WHITE);
            }});

           frame.setVisible(true);
        }
    }
    
    