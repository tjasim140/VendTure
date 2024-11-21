//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JLabel;
//
//public class MyFrame extends JFrame implements ActionListener {
//    JButton button;
//    JLabel label;
//    MyFrame(){
//        ImageIcon image = new ImageIcon("vend.png");
//        ImageIcon math = new ImageIcon("math.png");
//
//        label = new JLabel();
//        label.setBounds(40,65,600,600);
//        label.setIcon(image);
//        label.setText("");
//
//        button = new JButton();
//        button.setBounds(180,170,144,144);
//        button.addActionListener(this);
//        button.setFocusable(false);
//        button.setIcon(math);
//        button.setBackground(new Color(0, 0, 0, 0));
//        button.setForeground(Color.WHITE);
//        button.setBorder(BorderFactory.createEmptyBorder());
//
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(700,700);
//        this.setVisible(true);
//
//        this.add(button);
//        this.add(label);
//        this.getContentPane().setBackground(new Color(0xECCEF1));
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
//            String x = "math";
//       }
//    }
//}
