package com.movie.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;

public class ProjectUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectUI frame = new ProjectUI();
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
	public ProjectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel homePanel = new JPanel();
		tabbedPane.addTab("예매 홈", null, homePanel, null);
		homePanel.setLayout(null);
		
		JButton btnNewButton = new JButton("예매하기");
		btnNewButton.setBounds(40, 330, 97, 23);
		homePanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("예매하기");
		btnNewButton_1.setBounds(200, 330, 97, 23);
		homePanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("예매하기");
		btnNewButton_2.setBounds(360, 330, 97, 23);
		homePanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("예매하기");
		btnNewButton_3.setBounds(520, 330, 97, 23);
		homePanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("예매하기");
		btnNewButton_4.setBounds(680, 330, 97, 23);
		homePanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(621, 8, 80, 45);
		homePanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("회원가입");
		btnNewButton_6.setBounds(706, 8, 80, 45);
		homePanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("마이페이지");
		btnNewButton_7.setBounds(497, 9, 116, 45);
		homePanel.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\movie2.jpg"));
		lblNewLabel.setBounds(200, 129, 122, 190);
		homePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\movie3.jpg"));
		lblNewLabel_1.setBounds(360, 140, 122, 165);
		homePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\movie4.jpg"));
		lblNewLabel_2.setBounds(518, 136, 122, 176);
		homePanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\movie5.jpg"));
		lblNewLabel_3.setBounds(667, 148, 110, 157);
		homePanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\movie1.jpg"));
		lblNewLabel_4.setBounds(31, 141, 134, 171);
		homePanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\com\\movie\\현정\\logo5.png"));
		lblNewLabel_5.setBounds(27, 20, 120, 51);
		homePanel.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("회원페이지", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane_1, BorderLayout.CENTER);
		
		JPanel JoinPanel = new JPanel();
		tabbedPane_1.addTab("회원가입", null, JoinPanel, null);
		JoinPanel.setLayout(null);
		JoinPanel.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_8.setBounds(0, 0, 75, 49);
		JoinPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setBounds(70, 118, 57, 15);
		JoinPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1.setBounds(70, 176, 107, 15);
		JoinPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("PASSWORD");
		lblNewLabel_4_1.setBounds(70, 220, 92, 15);
		JoinPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("NAME");
		lblNewLabel_5_1.setBounds(70, 286, 57, 15);
		JoinPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("PHONE");
		lblNewLabel_6_1.setBounds(469, 121, 57, 15);
		JoinPanel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("BIRTHDAY");
		lblNewLabel_7_1.setBounds(469, 176, 92, 15);
		JoinPanel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("GENDER");
		lblNewLabel_8_1.setBounds(469, 223, 57, 15);
		JoinPanel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9 = new JLabel("E-MAIL");
		lblNewLabel_9.setBounds(469, 286, 57, 15);
		JoinPanel.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(173, 115, 116, 21);
		JoinPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(173, 173, 116, 21);
		JoinPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(173, 217, 116, 21);
		JoinPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(172, 283, 116, 21);
		JoinPanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(549, 118, 116, 21);
		JoinPanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(549, 170, 116, 21);
		JoinPanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(549, 280, 199, 21);
		JoinPanel.add(textField_10);
		
		JButton btnNewButton_9 = new JButton("중복확인");
		btnNewButton_9.setBounds(301, 114, 86, 23);
		JoinPanel.add(btnNewButton_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FEMALE");
		rdbtnNewRadioButton.setBounds(544, 216, 75, 23);
		JoinPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MALE");
		rdbtnNewRadioButton_1.setBounds(627, 216, 66, 23);
		JoinPanel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setBounds(70, 245, 219, 15);
		JoinPanel.add(lblNewLabel_10);
		
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.setBounds(254, 358, 97, 23);
		JoinPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("메인으로");
		btnNewButton_2_1.setBounds(445, 358, 97, 23);
		JoinPanel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("*");
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setBounds(173, 136, 116, 15);
		JoinPanel.add(lblNewLabel_11);
		
		JPanel loginPanel = new JPanel();
		tabbedPane_1.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		loginPanel.setBackground(new Color(255, 192, 203));
		
		JLabel loginIdLB_1 = new JLabel("아이디");
		loginIdLB_1.setBounds(300, 240, 57, 15);
		loginPanel.add(loginIdLB_1);
		
		JLabel loginPWLB_1 = new JLabel("패스워드");
		loginPWLB_1.setBounds(300, 299, 57, 15);
		loginPanel.add(loginPWLB_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(397, 237, 116, 21);
		loginPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(397, 296, 116, 21);
		loginPanel.add(textField_3);
		
		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.setBounds(267, 375, 97, 23);
		loginPanel.add(loginBtn_1);
		
		JButton cancelBtn_1 = new JButton("취소");
		cancelBtn_1.setBounds(424, 375, 97, 23);
		loginPanel.add(cancelBtn_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/LOGO4.png")));
		lblNewLabel_1_1.setBounds(300, 45, 213, 167);
		loginPanel.add(lblNewLabel_1_1);
		
		JPanel myPanel = new JPanel();
		tabbedPane_1.addTab("마이페이지", null, myPanel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("영화상세", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane_2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("영화1", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\big_movie2.jpg"));
		lblNewLabel_6.setBounds(41, 40, 217, 305);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_2.addTab("영화2", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\big_movie1.jpg"));
		lblNewLabel_7.setBounds(26, 44, 219, 307);
		panel_3.add(lblNewLabel_7);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("영화3", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\big_movie3.jpg"));
		lblNewLabel_12.setBounds(22, 34, 219, 344);
		panel_4.add(lblNewLabel_12);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("영화4", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team4-movie\\src\\images\\big_movie4.jpg"));
		lblNewLabel_13.setBounds(25, 40, 217, 346);
		panel_5.add(lblNewLabel_13);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("영화5", null, panel_6, null);
		
		JPanel seatPanel = new JPanel();
		tabbedPane.addTab("좌석선택", null, seatPanel, null);
		
		JPanel payPanel = new JPanel();
		tabbedPane.addTab("결제페이지", null, payPanel, null);
	}
}
