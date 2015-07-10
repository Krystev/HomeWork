package UserAcc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enter extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Username;
	private JTextField textField_Password;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enter frame = new Enter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Enter() {
		setTitle("Enter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Username = new JTextField();
		textField_Username.setBounds(156, 58, 116, 22);
		contentPane.add(textField_Username);
		textField_Username.setColumns(10);
		
		textField_Password = new JTextField();
		textField_Password.setBounds(156, 93, 116, 22);
		contentPane.add(textField_Password);
		textField_Password.setColumns(10);
		
		JLabel lbl_Username = new JLabel("Username:");
		lbl_Username.setBounds(76, 58, 68, 22);
		contentPane.add(lbl_Username);
		
		JLabel lbl_Password = new JLabel("Password:");
		lbl_Password.setBounds(76, 96, 68, 16);
		contentPane.add(lbl_Password);
		
		JLabel lbl_Result = new JLabel("");
		lbl_Result.setBounds(143, 224, 144, 16);
		contentPane.add(lbl_Result);
		
		JButton btn_Enter = new JButton("Enter");
		btn_Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textField_Username.getText().equals("admin") && textField_Password.getText().equals("1234")) {
					lbl_Result.setText("Login successful");
				} else {
					lbl_Result.setText("Login unsuccessful");
				}
			}
		});
		btn_Enter.setBounds(166, 134, 97, 25);
		contentPane.add(btn_Enter);
		
		
	}
}
