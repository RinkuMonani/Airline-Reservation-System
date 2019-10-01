import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Form_demo{

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

public class Form extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JLabel title,name,classes,preferences;
	private JTextField passenger_name;
	private JButton find;
	private Choice select_preference,select_classes;
	private JScrollPane scrollpane1, scrollpane2;

	
	Form() {
		setVisible(true);
		getContentPane().setLayout(null);
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		contentPane = new JPanel();
		
		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		name = new JLabel("Name:-");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		classes = new JLabel("Class:-");
		classes.setFont(new Font("Arial", Font.PLAIN, 12));
		preferences = new JLabel("Preferences:-");
		preferences.setFont(new Font("Arial", Font.PLAIN, 12));
		passenger_name = new JTextField();
		find = new JButton("Find");
		find.setFont(new Font("Arial", Font.PLAIN, 12));
		
		select_classes = new Choice();

		select_classes.add("Not Selected");
		select_classes.add("Economy");
		select_classes.add("Business");
		select_classes.add("First");

		select_preference = new Choice();	
		
		select_preference.add("Not Selected");
		select_preference.add("Window");
		select_preference.add("Aisle");
		select_preference.add("Front");
		select_preference.add("Back");
		
		title.setBounds(200, 50, 200, 30);
		name.setBounds(75,100,75,30);
		classes.setBounds(75,150,75,30);
		preferences.setBounds(75,200,75,30);
		passenger_name.setBounds(160, 100, 200, 30);
		select_classes.setBounds(160, 150, 200, 30);
		select_preference.setBounds(160,200,200,30);
		
		find.setBounds(100, 260, 125, 30);
		find.addActionListener(this);

		getContentPane().add(title);
		getContentPane().add(name);
		getContentPane().add(classes);
		getContentPane().add(preferences);
		getContentPane().add(passenger_name);
		getContentPane().add(select_classes);
		getContentPane().add(select_preference);
		getContentPane().add(find);
	}

	public void actionPerformed(ActionEvent ae){

		String tf_passenger_name = passenger_name.getText();  //passenger name not required in OEP
   		String selected_class = select_classes.getItem(select_classes.getSelectedIndex());
		String selected_preference = select_preference.getItem(select_preference.getSelectedIndex());
		   
		//temporarily printing collected info
		System.out.print("\nPPassenger name : "+ tf_passenger_name);
		System.out.print("\nSelected class : "+selected_class);
		System.out.print("\nSelected preference : "+selected_preference);


  	}
}

