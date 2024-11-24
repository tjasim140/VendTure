import javax.security.auth.Subject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JLabel label;
    MyFrame(){
        ImageIcon image = new ImageIcon("vend.png");
        ImageIcon math = new ImageIcon("math.png");

        label = new JLabel();
        label.setBounds(40,65,600,600);
        label.setIcon(image);
        label.setText("");

        button = new JButton();
        button.setBounds(180,170,144,144);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(math);
        button.setBackground(new Color(0, 0, 0, 0));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder());

        button2 = new JButton();
        button2.setBounds(335,170,144,144);
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setIcon(math);
        button2.setBackground(new Color(0, 0, 0, 0));
        button2.setForeground(Color.WHITE);
        button2.setBorder(BorderFactory.createEmptyBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,700);
        this.setTitle("VendTure");
        this.setResizable(false);
        this.setVisible(true);

        this.add(button);
        this.add(button2);
        this.add(label);
        this.getContentPane().setBackground(new Color(0xc6bbf0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){

       }
    }
}
