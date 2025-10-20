package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoginSuccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccess frame = new LoginSuccess("username");
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
	public LoginSuccess(String username) {
		this.username = username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 234, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入成功");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblNewLabel.setBounds(49, 30, 116, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("確定");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shop shop = new Shop(username);
				shop.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(74, 86, 72, 22);
		contentPane.add(btnNewButton);

	}

}
