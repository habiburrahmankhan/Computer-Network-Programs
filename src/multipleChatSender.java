import javax.swing.*;
import java.awt.*;

public class multipleChatSender {
    JFrame f1 ;
    JPanel pp1 ;
    JLabel   l1 , l2 ,l3 , l4 ;
    JTextField t1 , t2 , t3 ;
    JButton b1 , b2 ;
    multipleChatSender()
    {
        f1 = new JFrame();
        pp1 = new JPanel();
        l1 = new JLabel("label 1 ");
        l2 = new JLabel("label 2 ");
        l3 = new JLabel("label 3 ");
        l4 = new JLabel("label 4 ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton(" Send " );
        b2 = new JButton("Cancel");
        f1.add(pp1);
        pp1.add(l1);
        pp1.add(l2);
        pp1.add(l3);
        pp1.add(l4);
        pp1.add(t1);
        pp1.add(t2);
        pp1.add(t3);
        pp1.add(b1);
        pp1.add(b2);
        l1.setBounds(50,100,90,25);
        l2.setBounds(50,150,90,25);
        l3.setBounds(50,200,90,25);
        l4.setBounds(50,250,90,25);
        t1.setBounds(220,100,120,25);
        t2.setBounds(220,150,120,25);
        t3.setBounds(220,200,120,25);
        b1.setBounds(80,330,100,25);
        b2.setBounds(200,330,100,25);
        pp1.setLayout(null);
        f1.setSize(400,500);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new multipleChatSender();
    }
}
