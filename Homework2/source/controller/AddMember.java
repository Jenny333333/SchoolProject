package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(48, 32, 417, 348);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("註冊");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel.setBounds(156, 30, 33, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1.setBounds(64, 73, 46, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("帳號");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(64, 110, 46, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("密碼");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(64, 147, 46, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("地址");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(64, 184, 46, 27);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("電話");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(64, 231, 46, 27);
		panel.add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setBounds(144, 76, 96, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 113, 96, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 150, 96, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(144, 187, 96, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(144, 234, 96, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.setBounds(144, 286, 87, 23);
		panel.add(btnNewButton);

	}

}
