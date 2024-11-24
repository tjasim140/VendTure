import javax.security.auth.Subject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JLabel label;
    JButton submit;
    JTextField textField;
    private ActionEvent e;

    MyFrame(){
        ImageIcon image = new ImageIcon("vend.png");
        ImageIcon math = new ImageIcon("math.png");

        label = new JLabel();
        label.setBounds(40,65,600,600);
        label.setIcon(image);
        label.setText("");

        button = new JButton();
        button.setBounds(180,170,144,144);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button.setForeground(Color.BLACK);
                button.setBackground(new Color(0, 0, 0, 50));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(Color.WHITE);
                button.setBackground(new Color(0, 0, 0, 0));
            }

            @Override
            public void mousePressed(MouseEvent e){
                button.setBackground(new Color(0,0,0,100));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(new Color(0,0,0,50));
            }
        });

        button.setFocusable(false);
        button.setIcon(math);
        button.setBackground(new Color(0, 0, 0, 0));
        button.setContentAreaFilled(false);
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        button2 = new JButton();
        button2.setBounds(335,170,144,144);
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setIcon(math);
        button2.setBackground(new Color(0, 0, 0, 0));
        button2.setContentAreaFilled(false);
        button2.setForeground(Color.WHITE);
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2.setForeground(Color.BLACK);
                button2.setBackground(new Color(0, 0, 0, 50));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button2.setForeground(Color.WHITE);
                button2.setBackground(new Color(0, 0, 0, 0));
            }

            @Override
            public void mousePressed(MouseEvent e){
                button2.setBackground(new Color(0,0,0,100));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button2.setBackground(new Color(0,0,0,50));
            }
        });

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
        submit = new JButton("Enter");
        submit.addActionListener(this);
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(300,50));
        this.add(textField);
        this.add(submit);
        textField.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
