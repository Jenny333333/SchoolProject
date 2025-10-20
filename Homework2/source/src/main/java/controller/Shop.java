package controller;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Sorder;
import service.impl.SorderServiceImpl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Shop extends JFrame {
	private void updateTotal(JSpinner yoyo, JSpinner candy, JSpinner car, JSpinner ball, JLabel totalLabel) {
	    int total = 0;
	    total += (int)yoyo.getValue() * 50;
	    total += (int)candy.getValue() * 10;
	    total += (int)car.getValue() * 150;
	    total += (int)ball.getValue() * 30;

	    totalLabel.setText("總金額: " + total + " 元");
	}
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pay;
	private String submitTime = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop frame = new Shop("username");
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
	public Shop(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(202, 228, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("歡迎：" + username);
		welcomeLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		welcomeLabel.setBounds(235, 26, 189, 20);
		contentPane.add(welcomeLabel);
		
		JLabel time = new JLabel();
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		time.setBounds(362, 10, 62, 19);
		contentPane.add(time);
		Timer timer = new Timer(1000, e->{
		String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
		time.setText(currentTime);
		});
		timer.start();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 217));
		panel.setBounds(25, 10, 200, 36);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("小太陽雜貨店");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setBounds(31, 0, 143, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 242, 202));
		panel_1.setBounds(25, 56, 399, 139);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("溜溜球  50元");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(40, 18, 97, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("跳跳糖  10元");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(225, 19, 97, 17);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("小汽車  150元");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(40, 46, 97, 19);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("彈跳球  30元");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(225, 46, 97, 19);
		panel_1.add(lblNewLabel_4);
		
		
		
		
		
		JLabel totalLabel = new JLabel("總金額:");
		totalLabel.setForeground(new Color(255, 117, 186));
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		totalLabel.setBounds(122, 76, 175, 19);
		panel_1.add(totalLabel);
		JSpinner yoyo = new JSpinner();
		yoyo.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		yoyo.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		yoyo.setBounds(133, 18, 41, 22);
		panel_1.add(yoyo);

		JSpinner candy = new JSpinner();
		candy.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		candy.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		candy.setBounds(319, 18, 41, 22);
		panel_1.add(candy);

		JSpinner car = new JSpinner();
		car.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		car.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		car.setBounds(136, 46, 41, 22);
		panel_1.add(car);

		JSpinner ball = new JSpinner();
		ball.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		ball.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		ball.setBounds(319, 46, 41, 22);
		panel_1.add(ball);

		yoyo.addChangeListener(e -> updateTotal(yoyo, candy, car, ball, totalLabel));
		candy.addChangeListener(e -> updateTotal(yoyo, candy, car, ball, totalLabel));
		car.addChangeListener(e -> updateTotal(yoyo, candy, car, ball, totalLabel));
		ball.addChangeListener(e -> updateTotal(yoyo, candy, car, ball, totalLabel));
		
		JLabel lblNewLabel_6 = new JLabel("請輸入付款金額");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(30, 107, 118, 19);
		panel_1.add(lblNewLabel_6);
		
		pay = new JTextField();
		pay.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		pay.setBounds(146, 106, 96, 20);
		panel_1.add(pay);
		pay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 205, 399, 181);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("微軟正黑體", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setBounds(10, 10, 379, 161);
		panel_2.add(textArea);
		
		JButton btnNewButton_1 = new JButton("重設");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				yoyo.setValue(0);
				candy.setValue(0);
				car.setValue(0);
				ball.setValue(0);
				pay.setText("");
				textArea.setText("");
			}
		});
		btnNewButton_1.setBounds(25, 391, 84, 22);
		contentPane.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_4 = new JButton("關閉");
		btnNewButton_4.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(340, 391, 84, 22);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("列印");
		btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	PrinterJob output = PrinterJob.getPrinterJob(); 
		    	output.setPrintable((graphics, pageFormat, pageIndex) -> {
		            String[] lines = textArea.getText().split("\n");
		            int linesPerPage = 40; 
		            int totalPages = (int) Math.ceil((double) lines.length / linesPerPage);

		            if (pageIndex >= totalPages) {
		                return Printable.NO_SUCH_PAGE;
		            }

		            int y = 100;
		            int start = pageIndex * linesPerPage;
		            int end = Math.min(start + linesPerPage, lines.length);

		            for (int i = start; i < end; i++) {
		                graphics.drawString(lines[i], 100, y);
		                y += 20; 
		            }

		            return Printable.PAGE_EXISTS;
		        });

		        if (output.printDialog()) {
		            try {
		            	output.print();
		            } catch (PrinterException ex) {
		                ex.printStackTrace();
		            }
		        }
		    }

		});
		btnNewButton_3.setBounds(183, 391, 84, 22);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("送出");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		btnNewButton.setBounds(293, 105, 84, 22);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(e -> {
		    submitTime = new SimpleDateFormat("HH:mm:ss").format(new Date());		   
		    int yoyoCount = (int) yoyo.getValue();
		    int candyCount = (int) candy.getValue();
		    int carCount = (int) car.getValue();
		    int ballCount = (int) ball.getValue();

		    int total = yoyoCount * 50 + candyCount * 10 + carCount * 150 + ballCount * 30;

		    totalLabel.setText("總金額: " + total + " 元");

		    int payAmount = 0;
		    try {
		        payAmount = Integer.parseInt(pay.getText());
		    } catch (NumberFormatException ex) {
		        textArea.setText("請輸入正確的付款金額");
		        return;
		    }

		    if (payAmount < total) {
		        textArea.setText("付款金額不足，還差 " + (total - payAmount) + " 元");
		        return;
		    }

		    int change = payAmount - total;
		    Sorder order = new Sorder(username, yoyoCount, candyCount, carCount, ballCount);
		    SorderServiceImpl sorderService = new SorderServiceImpl();
		    int result = sorderService.addSorder(order);

		    int thousand = change / 1000;
		    int hundred = (change % 1000) / 100;
		    int ten = (change % 100) / 10;
		    int one = change % 10;

		    StringBuilder sb = new StringBuilder();
		    sb.append("送出時間：").append(submitTime).append("\n");
		    sb.append("付款金額：").append(payAmount).append(" 元\t");
		    sb.append("總金額：").append(total).append(" 元\n\n");
		    sb.append("找零：").append(change).append(" 元\n");
		    sb.append("千元：").append(thousand).append(" 張\n");
		    sb.append("百元：").append(hundred).append(" 張\n");
		    sb.append("十元：").append(ten).append(" 個\n");
		    sb.append("一元：").append(one).append(" 個\n");

		    textArea.setText(sb.toString());
		});
	}
}
