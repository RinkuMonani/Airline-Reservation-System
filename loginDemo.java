import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
  
class Login extends JFrame implements ActionListener
 {
  JButton btn_submit;
  JPanel panel;
  JLabel lbl_usrname,lbl_pwd, lbl_title;
  JTextField tf_usrname, tf_lbl_title;
  JPasswordField tf_pwd;

  static menu frame_menu = new menu();

  Login()
   {

    getContentPane().setLayout(null);
    setTitle("LOGIN FORM");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,400);
    setResizable(false);
    setLocationRelativeTo(null);
    
    lbl_title = new JLabel("L O G I N");
    lbl_title.setBounds(-1, 40, 500, 50);
    lbl_title.setFont(new Font("Arial", Font.BOLD, 20));
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    lbl_title.setBorder(border);
    lbl_title.setPreferredSize(new Dimension(500, 50));
    lbl_title.setHorizontalAlignment(JLabel.CENTER);
    lbl_title.setVerticalAlignment(JLabel.CENTER);
    lbl_title.setBackground(Color.WHITE);
    lbl_title.setOpaque(true);

    lbl_usrname = new JLabel("Username: ");
    lbl_usrname.setBounds(160, 120, 75, 30);
    lbl_usrname.setFont(new Font("Arial", Font.BOLD, 12));
    lbl_usrname.setForeground(Color.WHITE);

    tf_usrname = new JTextField(15);
    tf_usrname.setBounds(250, 120, 100, 30);
  
 
    lbl_pwd = new JLabel("Password: ");
    lbl_pwd.setBounds(160, 170, 75, 30);
    lbl_pwd.setFont(new Font("Arial", Font.BOLD, 12));
    lbl_pwd.setForeground(Color.WHITE);

    tf_pwd = new JPasswordField(15);
    tf_pwd.setBounds(250, 170, 100, 30);
  
    btn_submit =new JButton("SUBMIT");
    btn_submit.setBounds(180, 250, 150, 30);
    btn_submit.addActionListener(this);
   
    getContentPane().add(lbl_title);
    getContentPane().add(lbl_usrname);
    getContentPane().add(lbl_pwd);
    getContentPane().add(tf_usrname);
    getContentPane().add(tf_pwd);
    getContentPane().add(btn_submit);
    getContentPane().setBackground(Color.BLACK);
    getRootPane().setDefaultButton(btn_submit);


   }

  public void actionPerformed(ActionEvent ae) {
       String value1=tf_usrname.getText();
       String value2= new String(tf_pwd.getPassword());
       if (value1.equals("roseindia") && value2.equals("roseindia")) {
           frame_menu.setVisible(true);
           this.dispose(); //disposes the current frame : login form
       }
       else{
            System.out.println("enter the valid username and password");
            JOptionPane.showMessageDialog(this,"Incorrect login or password",
             "Error",JOptionPane.ERROR_MESSAGE);
       }
  }
 }

  public class loginDemo extends Login{
    public static Login login_frame = new Login();

    public static void main(String arg[]){
        try{
    
            login_frame.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
 }