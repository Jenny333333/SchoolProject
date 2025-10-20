package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		setBounds(100, 100, 305, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel.setBounds(60, 64, 53, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(60, 109, 53, 27);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		username.setBounds(107, 71, 96, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		password.setBounds(107, 116, 96, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				String Password=password.getText();
				
				Member member=msi.Login(Username, Password);
				
				if(member!=null)
				{
					LoginSuccess success = new LoginSuccess(member.getUsername());
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
		btnNewButton.setBounds(106, 168, 84, 22);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 219));
		panel.setBounds(21, 10, 241, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("小太陽雜貨店");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 5, 221, 37);
		panel.add(lblNewLabel_2);

	}
}
