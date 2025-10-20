package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private MemberServiceImpl msi=new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(44, 59, 397, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 15));
		lblNewLabel.setBounds(53, 44, 46, 18);
		panel.add(lblNewLabel);
		
		JLabel lblAua = new JLabel("密碼");
		lblAua.setFont(new Font("新細明體", Font.BOLD, 15));
		lblAua.setBounds(53, 91, 46, 18);
		panel.add(lblAua);
		
		username = new JTextField();
		username.setBounds(160, 43, 96, 21);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(160, 90, 96, 21);
		panel.add(password);
		password.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("確定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				String Password=password.getText();
				
				Member member=msi.Login(Username, Password);
				
				if(member!=null)
				{
					LoginSuccess success=new LoginSuccess();
					success.setVisible(true);
					dispose();
				}
				else
				{
					LoginError error=new LoginError();
					error.setVisible(true);
					dispose();
				}
				
				
			}
		});
		btnNewButton.setBounds(160, 149, 87, 23);
		panel.add(btnNewButton);

	}
}
