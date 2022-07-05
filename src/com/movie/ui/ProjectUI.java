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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import java.awt.Panel;

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
	private JTextField textField;
	private JPanel seatSelectPanel;

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
		btnNewButton.setBounds(59, 322, 97, 23);
		homePanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("예매하기");
		btnNewButton_1.setBounds(209, 322, 97, 23);
		homePanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("예매하기");
		btnNewButton_2.setBounds(361, 323, 97, 23);
		homePanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("예매하기");
		btnNewButton_3.setBounds(507, 323, 97, 23);
		homePanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("예매하기");
		btnNewButton_4.setBounds(659, 323, 97, 23);
		homePanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("login");
		btnNewButton_5.setBounds(599, 21, 73, 32);
		homePanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("join");
		btnNewButton_6.setBounds(515, 21, 73, 32);
		homePanel.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie2.jpg")));
		lblNewLabel.setBounds(200, 101, 122, 190);
		homePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie3.jpg")));
		lblNewLabel_1.setBounds(350, 114, 122, 165);
		homePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie4.jpg")));
		lblNewLabel_2.setBounds(497, 109, 122, 176);
		homePanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie5.jpg")));
		lblNewLabel_3.setBounds(649, 117, 110, 157);
		homePanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie1.jpg")));
		lblNewLabel_4.setBounds(54, 112, 134, 171);
		homePanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_5.setBounds(27, 10, 129, 65);
		homePanel.add(lblNewLabel_5);
		
		JButton btnNewButton_7 = new JButton("MyPage");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(680, 21, 97, 32);
		homePanel.add(btnNewButton_7);
		
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
		lblNewLabel_8.setBounds(23, 10, 75, 49);
		JoinPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setBounds(70, 118, 57, 15);
		JoinPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1.setBounds(70, 176, 107, 15);
		JoinPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("PASSWORD");
		lblNewLabel_4_1.setBounds(70, 234, 92, 15);
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
		lblNewLabel_8_1.setBounds(469, 233, 57, 15);
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
		textField_6.setBounds(174, 231, 116, 21);
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
		textField_10.setBounds(549, 280, 140, 21);
		JoinPanel.add(textField_10);
		
		JButton btnNewButton_9 = new JButton("중복확인");
		btnNewButton_9.setBounds(301, 114, 86, 23);
		JoinPanel.add(btnNewButton_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FEMALE");
		rdbtnNewRadioButton.setBounds(544, 226, 75, 23);
		JoinPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MALE");
		rdbtnNewRadioButton_1.setBounds(627, 226, 66, 23);
		JoinPanel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setBounds(174, 216, 219, 15);
		JoinPanel.add(lblNewLabel_10);
		
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.setBounds(254, 358, 97, 23);
		JoinPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("메인으로");
		btnNewButton_2_1.setBounds(445, 358, 97, 23);
		JoinPanel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("*");
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setBounds(173, 100, 116, 15);
		JoinPanel.add(lblNewLabel_11);
		
		JPanel loginPanel = new JPanel();
		tabbedPane_1.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		loginPanel.setBackground(new Color(255, 192, 203));
		
		JLabel loginIdLB_1 = new JLabel("ID");
		loginIdLB_1.setFont(new Font("굴림", Font.PLAIN, 13));
		loginIdLB_1.setBounds(286, 206, 57, 15);
		loginPanel.add(loginIdLB_1);
		
		JLabel loginPWLB_1 = new JLabel("PASSWORD");
		loginPWLB_1.setFont(new Font("굴림", Font.PLAIN, 13));
		loginPWLB_1.setBounds(286, 265, 84, 15);
		loginPanel.add(loginPWLB_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(383, 203, 116, 21);
		loginPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(383, 262, 116, 21);
		loginPanel.add(textField_3);
		
		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.setBounds(266, 341, 97, 23);
		loginPanel.add(loginBtn_1);
		
		JButton cancelBtn_1 = new JButton("취소");
		cancelBtn_1.setBounds(426, 341, 97, 23);
		loginPanel.add(cancelBtn_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/LOGO4.png")));
		lblNewLabel_1_1.setBounds(286, 26, 213, 167);
		loginPanel.add(lblNewLabel_1_1);
		
		JPanel myPanel = new JPanel();
		tabbedPane_1.addTab("마이페이지", null, myPanel, null);
		myPanel.setLayout(null);
		
		JLabel lblNewLabel_22 = new JLabel("이름");
		lblNewLabel_22.setBounds(46, 37, 57, 15);
		myPanel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("생년월일");
		lblNewLabel_23.setBounds(46, 89, 57, 15);
		myPanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("이메일");
		lblNewLabel_24.setBounds(46, 146, 57, 15);
		myPanel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("성별");
		lblNewLabel_25.setBounds(46, 204, 57, 15);
		myPanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("휴대폰번호");
		lblNewLabel_26.setBounds(46, 256, 70, 15);
		myPanel.add(lblNewLabel_26);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("남");
		rdbtnNewRadioButton_5.setBounds(117, 204, 47, 23);
		myPanel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("여");
		rdbtnNewRadioButton_5_1.setBounds(168, 204, 47, 23);
		myPanel.add(rdbtnNewRadioButton_5_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(115, 34, 116, 21);
		myPanel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(115, 86, 116, 21);
		myPanel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(115, 143, 116, 21);
		myPanel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(115, 253, 116, 21);
		myPanel.add(textField_14);
		textField_14.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("영화상세", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane_2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("영화1", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie2.jpg")));
		lblNewLabel_6.setBounds(41, 40, 217, 305);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_2.addTab("영화2", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie1.jpg")));
		lblNewLabel_7.setBounds(26, 44, 219, 307);
		panel_3.add(lblNewLabel_7);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("영화3", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie3.jpg")));
		lblNewLabel_12.setBounds(22, 34, 219, 344);
		panel_4.add(lblNewLabel_12);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("영화4", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie4.jpg")));
		lblNewLabel_13.setBounds(25, 40, 217, 346);
		panel_5.add(lblNewLabel_13);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("영화5", null, panel_6, null);
		
		JPanel seatPanel = new JPanel();
		tabbedPane.addTab("좌석선택", null, seatPanel, null);
		seatPanel.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Screen");
		btnNewButton_8.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_8.setBounds(51, 46, 376, 34);
		seatPanel.add(btnNewButton_8);
		
		JLabel lblNewLabel_14 = new JLabel("인원/좌석");
		lblNewLabel_14.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_14.setBounds(576, 113, 115, 26);
		seatPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("성인");
		lblNewLabel_15.setBounds(576, 166, 57, 15);
		seatPanel.add(lblNewLabel_15);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		comboBox.setBounds(633, 162, 32, 23);
		seatPanel.add(comboBox);
		
		JLabel lblNewLabel_16 = new JLabel("청소년");
		lblNewLabel_16.setBounds(576, 206, 57, 15);
		seatPanel.add(lblNewLabel_16);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		comboBox_1.setBounds(633, 202, 32, 23);
		seatPanel.add(comboBox_1);
		
		JLabel lblNewLabel_17 = new JLabel("남은좌석");
		lblNewLabel_17.setBounds(576, 282, 57, 15);
		seatPanel.add(lblNewLabel_17);
		
		textField = new JTextField();
		textField.setBounds(633, 278, 53, 21);
		seatPanel.add(textField);
		textField.setColumns(10);
		
		seatSelectPanel = new JPanel();
		seatSelectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		seatSelectPanel.setBounds(48, 88, 379, 324);
		seatPanel.add(seatSelectPanel);
		seatSelectPanel.setLayout(new GridLayout(0, 5, 10, 13));
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/user.png")));
		seatSelectPanel.add(btnNewButton_10);
		
		
		
		JPanel payPanel = new JPanel();
		tabbedPane.addTab("결제페이지", null, payPanel, null);
		payPanel.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("1.결제수단");
		lblNewLabel_18.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(127, 76, 104, 23);
		payPanel.add(lblNewLabel_18);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("카드");
		rdbtnNewRadioButton_2.setBounds(138, 129, 70, 23);
		payPanel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("무통장입금");
		rdbtnNewRadioButton_3.setBounds(138, 166, 121, 23);
		payPanel.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_19 = new JLabel("2.할인");
		lblNewLabel_19.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(138, 237, 57, 23);
		payPanel.add(lblNewLabel_19);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"국민", "신한", "농협", "롯데", "현대", "삼성", "기업"}));
		comboBox_2.setBounds(214, 129, 57, 23);
		payPanel.add(comboBox_2);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("쿠폰");
		rdbtnNewRadioButton_4.setBounds(149, 294, 59, 23);
		payPanel.add(rdbtnNewRadioButton_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_3.setBounds(227, 294, 32, 23);
		payPanel.add(comboBox_3);
		
		JLabel lblNewLabel_19_1 = new JLabel("3.총 결제금액");
		lblNewLabel_19_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_19_1.setBounds(420, 76, 121, 23);
		payPanel.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_20 = new JLabel("-------------------------------");
		lblNewLabel_20.setBounds(127, 105, 189, 15);
		payPanel.add(lblNewLabel_20);
		
		JButton btnNewButton_11 = new JButton("결제하기");
		btnNewButton_11.setBounds(401, 283, 104, 44);
		payPanel.add(btnNewButton_11);
		
		JButton btnNewButton_11_1 = new JButton("이전으로");
		btnNewButton_11_1.setBounds(527, 283, 104, 44);
		payPanel.add(btnNewButton_11_1);
		
		JLabel lblNewLabel_20_1 = new JLabel("-------------------------------");
		lblNewLabel_20_1.setBounds(418, 105, 189, 15);
		payPanel.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("-------------------------------");
		lblNewLabel_20_2.setBounds(127, 265, 189, 15);
		payPanel.add(lblNewLabel_20_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(425, 130, 116, 21);
		payPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("원");
		lblNewLabel_21.setBounds(550, 134, 57, 15);
		payPanel.add(lblNewLabel_21);
		seatList();
	}
	JButton[] buttons;
	private JTextField textField_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public void seatList() {
		buttons=new JButton[15];
		for(int i=0;i<15;i++) {
			JButton btnNewButton_10 = new JButton("");
			btnNewButton_10.setToolTipText(i+"");
			//btnNewButton_10.setText(i+"");
			
			btnNewButton_10.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/user.png")));
			if(i%3==0) {
				btnNewButton_10.setEnabled(false);
			}
			btnNewButton_10.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e){
					JButton source=(JButton)e.getSource();
					String no=source.getToolTipText();
					btnNewButton_10.setToolTipText("click-"+no);
					System.out.println(no);
					/*
					for(int i=0;i<buttons.length;i++) {
						System.out.println(buttons[i].getToolTipText());
					}
					*/
				}
			});
			seatSelectPanel.add(btnNewButton_10);
			buttons[i]=btnNewButton_10;
			
		}
		
	}
}
