package SwingDesignerTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Pictures\\img1.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(114, 57, 62, 26);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(114, 108, 62, 14);
		contentPane.add(lblpassword);
		
		textusername = new JTextField();
		textusername.setBounds(210, 60, 86, 20);
		contentPane.add(textusername);
		textusername.setColumns(10);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlogin.setBounds(114, 167, 89, 23);
		contentPane.add(btnlogin);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncancel.setBounds(234, 167, 89, 23);
		contentPane.add(btncancel);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(210, 105, 86, 20);
		contentPane.add(txtpassword);
	}
}
