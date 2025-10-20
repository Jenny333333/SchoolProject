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

public class AddMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private MemberServiceImpl msi=new MemberServiceImpl();

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
		setBounds(100, 100, 396, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("註冊");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setBounds(170, 10, 51, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 52, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("帳號:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(35, 82, 46, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("密碼:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(30, 112, 51, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("地址:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(204, 51, 46, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("電話:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(204, 82, 46, 20);
		contentPane.add(lblNewLabel_5);
		
		name = new JTextField();
		name.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		name.setBounds(79, 52, 96, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		username.setBounds(79, 82, 96, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		password.setBounds(79, 114, 96, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		address = new JTextField();
		address.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		address.setBounds(248, 52, 96, 20);
		contentPane.add(address);
		address.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		phone.setBounds(248, 82, 96, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JButton btnNewButton = new JButton("送出");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Username=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Phone=phone.getText();
				
				Member member=new Member(Name,Username,Password,Address,Phone);
				
				if(msi.addMember(member)==1)
				{
					AddMemberError addmembererror=new AddMemberError();
					addmembererror.setVisible(true);
					dispose();
				}
				else
				{
					AddMemberSuccess addmembersuccess=new AddMemberSuccess();
					addmembersuccess.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(260, 111, 84, 22);
		contentPane.add(btnNewButton);

	}

}
