package com.movie.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.movie.dto.Customer;
import com.movie.service.CusService;
import com.movie.service.MovieService;

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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProjectUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField loginIdTextField;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField phoneTextField;
	private JTextField birthTextField;
	private JTextField emailTextField;
	private JPanel seatSelectPanel;
	
	MovieService movieService = new MovieService();
	CusService cusService = new CusService();
	
	private Customer loginCus = null;
	private int PayCount = 3;
	private String hall_name = "";
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
		
		mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		JPanel homePanel = new JPanel();
		mainTabbedPane.addTab("예매 홈", null, homePanel, null);
		homePanel.setLayout(null);
		
		JButton movie1Btn = new JButton("예매하기");
		movie1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(2);
				movieTabbedPane.setSelectedIndex(0);
			}
		});
		movie1Btn.setBounds(59, 376, 97, 23);
		homePanel.add(movie1Btn);
		
		JButton movie2Btn = new JButton("예매하기");
		movie2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(2);
				movieTabbedPane.setSelectedIndex(1);
			}
		});
		movie2Btn.setBounds(204, 376, 97, 23);
		homePanel.add(movie2Btn);
		
		JButton movie3Btn = new JButton("예매하기");
		movie3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(2);
				movieTabbedPane.setSelectedIndex(2);
			}
		});
		movie3Btn.setBounds(357, 376, 97, 23);
		homePanel.add(movie3Btn);
		
		JButton movie4Btn = new JButton("예매하기");
		movie4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(2);
				movieTabbedPane.setSelectedIndex(3);
			}
		});
		movie4Btn.setBounds(506, 376, 97, 23);
		homePanel.add(movie4Btn);
		
		JButton movie5Btn = new JButton("예매하기");
		movie5Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(2);
				movieTabbedPane.setSelectedIndex(4);
			}
		});
		movie5Btn.setBounds(662, 376, 97, 23);
		homePanel.add(movie5Btn);
		
		loginBtn = new JButton("login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(1);
			}
		});
		loginBtn.setBounds(599, 21, 73, 32);
		homePanel.add(loginBtn);
		
		joinBtn = new JButton("join");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(0);
			}
		});
		joinBtn.setBounds(515, 21, 73, 32);
		homePanel.add(joinBtn);
		
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
		
		myPageBtn = new JButton("MyPage");
		myPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(2);
			}
		});
		myPageBtn.setBounds(680, 21, 97, 32);
		homePanel.add(myPageBtn);
		
		JLabel lblNewLabel_11 = new JLabel("탑건-매버릭");
		lblNewLabel_11.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_11.setBounds(64, 292, 97, 20);
		homePanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_28 = new JLabel("토르 - 러브 앤 썬더");
		lblNewLabel_28.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_28.setBounds(192, 287, 143, 28);
		homePanel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("헤어질 결심");
		lblNewLabel_29.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_29.setBounds(368, 286, 108, 32);
		homePanel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("마녀");
		lblNewLabel_30.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_30.setBounds(541, 284, 81, 36);
		homePanel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("범죄도시2");
		lblNewLabel_31.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_31.setBounds(668, 288, 115, 25);
		homePanel.add(lblNewLabel_31);
		
		JLabel movie1time = new JLabel("");
		movie1time.setBounds(67, 310, 111, 56);
		homePanel.add(movie1time);
		try {
			movie1time.setText("<html>"+movieService.findBymoviehall("1회차").getM_Start_Time()+ "<p>~ " + movieService.findBymoviehall("1회차").getM_End_Time());
		} catch (Exception e3) {
		}
		
		JLabel movie2time = new JLabel("");
		movie2time.setBounds(221, 310, 111, 56);
		homePanel.add(movie2time);
		try {
			movie2time.setText("<html>"+movieService.findBymoviehall("2회차").getM_Start_Time()+ "<p>~ " + movieService.findBymoviehall("2회차").getM_End_Time());
		} catch (Exception e3) {
		}
		
		JLabel movie3time = new JLabel("");
		movie3time.setBounds(368, 313, 111, 56);
		homePanel.add(movie3time);
		try {
			movie3time.setText("<html>"+movieService.findBymoviehall("3회차").getM_Start_Time()+ "<p>~ " + movieService.findBymoviehall("3회차").getM_End_Time());
		} catch (Exception e3) {
		}
		
		JLabel movie4time = new JLabel("");
		movie4time.setBounds(507, 312, 111, 56);
		homePanel.add(movie4time);
		try {
			movie4time.setText("<html>"+movieService.findBymoviehall("4회차").getM_Start_Time()+ "<p>~ " + movieService.findBymoviehall("4회차").getM_End_Time());
		} catch (Exception e3) {
		}
		
		JLabel movie5time = new JLabel("");
		movie5time.setBounds(662, 313, 111, 56);
		homePanel.add(movie5time);
		try {
			movie5time.setText("<html>"+movieService.findBymoviehall("5회차").getM_Start_Time()+ "<p>~ " + movieService.findBymoviehall("5회차").getM_End_Time());
			
			JLabel reaminseat1 = new JLabel("");
			reaminseat1.setBounds(55, 405, 102, 31);
			homePanel.add(reaminseat1);
			reaminseat1.setText("남은좌석 : " + movieService.findBymoviehall("1회차").getRemainSeat());
			
			JLabel reaminseat2 = new JLabel("");
			reaminseat2.setBounds(206, 404, 102, 31);
			homePanel.add(reaminseat2);
			reaminseat2.setText("남은좌석 : " + movieService.findBymoviehall("2회차").getRemainSeat());
			
			JLabel reaminseat3 = new JLabel("");
			reaminseat3.setBounds(364, 405, 102, 31);
			homePanel.add(reaminseat3);
			reaminseat3.setText("남은좌석 : " + movieService.findBymoviehall("3회차").getRemainSeat());
			
			JLabel reaminseat4 = new JLabel("");
			reaminseat4.setBounds(514, 405, 102, 31);
			homePanel.add(reaminseat4);
			reaminseat4.setText("남은좌석 : " + movieService.findBymoviehall("4회차").getRemainSeat());
			
			JLabel reaminseat5 = new JLabel("");
			reaminseat5.setBounds(666, 404, 102, 31);
			homePanel.add(reaminseat5);
			reaminseat5.setText("남은좌석 : " + movieService.findBymoviehall("5회차").getRemainSeat());
		} catch (Exception e3) {
		}
		
		JPanel cusPanel = new JPanel();
		mainTabbedPane.addTab("회원페이지", null, cusPanel, null);
		cusPanel.setLayout(new BorderLayout(0, 0));
		
		cusTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		cusPanel.add(cusTabbedPane, BorderLayout.CENTER);
		
		JPanel JoinPanel = new JPanel();
		cusTabbedPane.addTab("회원가입", null, JoinPanel, null);
		JoinPanel.setLayout(null);
		JoinPanel.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_8.setBounds(23, 10, 75, 49);
		JoinPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_1 = new JLabel("아이디");
		lblNewLabel_2_1.setBounds(70, 85, 57, 15);
		JoinPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("비밀번호");
		lblNewLabel_3_1.setBounds(70, 176, 107, 15);
		JoinPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("비밀번호 확인");
		lblNewLabel_4_1.setBounds(70, 214, 92, 15);
		JoinPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("이름");
		lblNewLabel_5_1.setBounds(70, 286, 57, 15);
		JoinPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("핸드폰");
		lblNewLabel_6_1.setBounds(469, 121, 57, 15);
		JoinPanel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("생일");
		lblNewLabel_7_1.setBounds(469, 176, 92, 15);
		JoinPanel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("성별");
		lblNewLabel_8_1.setBounds(469, 233, 57, 15);
		JoinPanel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9 = new JLabel("E-MAIL");
		lblNewLabel_9.setBounds(469, 286, 57, 15);
		JoinPanel.add(lblNewLabel_9);
		
		idTextField = new JTextField();
		idTextField.setColumns(10);
		idTextField.setBounds(173, 82, 116, 21);
		JoinPanel.add(idTextField);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(172, 283, 116, 21);
		JoinPanel.add(nameTextField);
		
		phoneTextField = new JTextField();
		phoneTextField.setColumns(10);
		phoneTextField.setBounds(549, 118, 116, 21);
		JoinPanel.add(phoneTextField);
		
		birthTextField = new JTextField();
		birthTextField.setColumns(10);
		birthTextField.setBounds(549, 170, 116, 21);
		JoinPanel.add(birthTextField);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(549, 280, 140, 21);
		JoinPanel.add(emailTextField);
		
		JButton btnNewButton_9 = new JButton("중복확인");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(cusService.findById(idTextField.getText()) != null){
						idinfolabel.setText("중복된 아이디 입니다.");
					}else if(idTextField.getText().equals("")){
						idinfolabel.setText("아이디를 입력해주세요");
					}else {
						idinfolabel.setText("사용가능한 아이디 입니다.");
					}
				} catch (Exception e1) {
				}
			}
		});
		btnNewButton_9.setBounds(301, 81, 86, 23);
		JoinPanel.add(btnNewButton_9);
		
		maleRadioButton = new JRadioButton("남");
		maleRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(maleRadioButton.isSelected()) {
					femaleRadioButton.setSelected(false);
				}
			}
		});
		maleRadioButton.setBounds(544, 226, 75, 23);
		JoinPanel.add(maleRadioButton);
		
		
		femaleRadioButton = new JRadioButton("여");
		femaleRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(femaleRadioButton.isSelected()) {
					maleRadioButton.setSelected(false);
				}
			}
		});
		femaleRadioButton.setBounds(627, 226, 66, 23);
		JoinPanel.add(femaleRadioButton);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setBounds(149, 239, 183, 17);
		JoinPanel.add(lblNewLabel_10);
		//회원가입
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String id =idTextField.getText();
				String password = passwordField.getText();
				String nickname = nicknameTextField.getText();
				String name = nameTextField.getText();
				String phone = phoneTextField.getText();
				String date ;
				date = birthTextField.getText();
				String gender ="";
				String email = emailTextField.getText();
					Date birth = new SimpleDateFormat("yyyyMMdd").parse(date);
				if(maleRadioButton.isSelected()) {
					gender = "M";
					genderinfolabel.setText("");
					
				}else if(femaleRadioButton.isSelected()) {
					gender = "F";
					genderinfolabel.setText("");
				}else {
					genderinfolabel.setText("성별을 선택해주세요");
				}
				
				Customer cus = new Customer(id, 1, nickname, name, password, birth, gender, phone, email, 0, 1);
				boolean a = cusService.addCustomer(cus);
				if(a) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					mainTabbedPane.setSelectedIndex(0);
				}else {
					JOptionPane.showMessageDialog(null, "잘못 입력되었습니다.");
					
				}
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "회원정보를 정확히 입력해주세요");
					
				}
				
			}
		});
		btnNewButton_1_1.setBounds(254, 358, 97, 23);
		JoinPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("메인으로");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_2_1.setBounds(445, 358, 97, 23);
		JoinPanel.add(btnNewButton_2_1);
		
		idinfolabel = new JLabel("");
		idinfolabel.setForeground(Color.RED);
		idinfolabel.setBounds(164, 104, 223, 15);
		JoinPanel.add(idinfolabel);
		
		nicknameTextField = new JTextField();
		nicknameTextField.setColumns(10);
		nicknameTextField.setBounds(173, 122, 116, 21);
		JoinPanel.add(nicknameTextField);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("닉네임");
		lblNewLabel_2_1_1.setBounds(70, 125, 57, 15);
		JoinPanel.add(lblNewLabel_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 173, 116, 21);
		JoinPanel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(173, 211, 116, 21);
		JoinPanel.add(passwordField_1);
		
		genderinfolabel = new JLabel("");
		genderinfolabel.setForeground(Color.RED);
		genderinfolabel.setBounds(466, 258, 223, 15);
		JoinPanel.add(genderinfolabel);
		
		JPanel loginPanel = new JPanel();
		cusTabbedPane.addTab("로그인", null, loginPanel, null);
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
		
		loginIdTextField = new JTextField();
		loginIdTextField.setColumns(10);
		loginIdTextField.setBounds(383, 203, 116, 21);
		loginPanel.add(loginIdTextField);
		
		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = loginIdTextField.getText();
					String password = loginPasswordField.getText();
						int result = cusService.login(id, password);
						if(result == 0) {
							JOptionPane.showMessageDialog(null, "로그인 하셨습니다");
							loginProcess(id);
						}else if(result == 1) {
							JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다");
						}else {
							JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
							
						}
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				
				
			}
		});
		loginBtn_1.setBounds(266, 341, 97, 23);
		loginPanel.add(loginBtn_1);
		
		JButton cancelBtn_1 = new JButton("취소");
		cancelBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(0);
			}
		});
		cancelBtn_1.setBounds(426, 341, 97, 23);
		loginPanel.add(cancelBtn_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/LOGO4.png")));
		lblNewLabel_1_1.setBounds(286, 26, 213, 167);
		loginPanel.add(lblNewLabel_1_1);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.setBounds(383, 262, 116, 18);
		loginPanel.add(loginPasswordField);
		
		JPanel myPanel = new JPanel();
		cusTabbedPane.addTab("마이페이지", null, myPanel, null);
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
		
		JPanel moviePanel = new JPanel();
		mainTabbedPane.addTab("영화상세", null, moviePanel, null);
		moviePanel.setLayout(new BorderLayout(0, 0));
		
		movieTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		moviePanel.add(movieTabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		movieTabbedPane.addTab("영화1", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie2.jpg")));
		lblNewLabel_6.setBounds(41, 40, 217, 305);
		panel_2.add(lblNewLabel_6);
		
		JLabel movie1Label = new JLabel("");
		movie1Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie1Label.setBounds(270, 66, 465, 268);
		panel_2.add(movie1Label);
		try {
			movie1Label.setText("<html>"+movieService.findBymoviehall("1회차").getM_Introduce());
			
			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "1회차";
				}
			});
			seatSelectBtn.setBounds(619, 360, 97, 23);
			panel_2.add(seatSelectBtn);
		} catch (Exception e1) {
			System.out.println("오류");
		}
		
		JPanel panel_3 = new JPanel();
		movieTabbedPane.addTab("영화2", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie1.jpg")));
		lblNewLabel_7.setBounds(26, 44, 219, 307);
		panel_3.add(lblNewLabel_7);
		
		JLabel movie2Label = new JLabel("");
		movie2Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie2Label.setBounds(257, 59, 465, 268);
		panel_3.add(movie2Label);
		try {
			movie2Label.setText("<html>"+movieService.findBymoviehall("2회차").getM_Introduce());
			
			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "2회차";
				}
			});
			seatSelectBtn.setBounds(642, 360, 97, 23);
			panel_3.add(seatSelectBtn);
		} catch (Exception e1) {
			
		}
		
		JPanel panel_4 = new JPanel();
		movieTabbedPane.addTab("영화3", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie3.jpg")));
		lblNewLabel_12.setBounds(22, 34, 219, 344);
		panel_4.add(lblNewLabel_12);
		
		JLabel movie3Label = new JLabel("");
		movie3Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie3Label.setBounds(253, 65, 465, 268);
		panel_4.add(movie3Label);
		try {
			movie3Label.setText("<html>"+movieService.findBymoviehall("3회차").getM_Introduce());
			
			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "3회차";
				}
			});
			seatSelectBtn.setBounds(621, 355, 97, 23);
			panel_4.add(seatSelectBtn);
		} catch (Exception e1) {
		}
		
		JPanel panel_5 = new JPanel();
		movieTabbedPane.addTab("영화4", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie4.jpg")));
		lblNewLabel_13.setBounds(25, 40, 217, 346);
		panel_5.add(lblNewLabel_13);
		
		JLabel movie4Label = new JLabel("");
		movie4Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie4Label.setBounds(254, 76, 465, 268);
		panel_5.add(movie4Label);
		try {
			movie4Label.setText("<html>"+movieService.findBymoviehall("4회차").getM_Introduce());
			
			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "4회차";
				}
			});
			seatSelectBtn.setBounds(622, 364, 97, 23);
			panel_5.add(seatSelectBtn);
		} catch (Exception e1) {
		}
		
		JPanel panel_6 = new JPanel();
		movieTabbedPane.addTab("영화5", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie5.jpg")));
		lblNewLabel_27.setBounds(22, 42, 213, 308);
		panel_6.add(lblNewLabel_27);
		
		JLabel movie5Label = new JLabel("");
		movie5Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie5Label.setBounds(257, 54, 465, 268);
		panel_6.add(movie5Label);
		try {
			movie5Label.setText("<html>"+movieService.findBymoviehall("5회차").getM_Introduce());
			
			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "5회차";
				}
			});
			seatSelectBtn.setBounds(625, 358, 97, 23);
			panel_6.add(seatSelectBtn);
		} catch (Exception e1) {
		}
		
		JPanel seatPanel = new JPanel();
		mainTabbedPane.addTab("좌석선택", null, seatPanel, null);
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
		
		adultCB = new JComboBox();
		adultCB.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		adultCB.setBounds(633, 162, 32, 23);
		seatPanel.add(adultCB);
		
		JLabel lblNewLabel_16 = new JLabel("청소년");
		lblNewLabel_16.setBounds(576, 206, 57, 15);
		seatPanel.add(lblNewLabel_16);
		
		childCB = new JComboBox();
		childCB.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		childCB.setBounds(633, 202, 32, 23);
		seatPanel.add(childCB);
		
		seatSelectPanel = new JPanel();
		seatSelectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		seatSelectPanel.setBounds(48, 88, 379, 324);
		seatPanel.add(seatSelectPanel);
		seatSelectPanel.setLayout(new GridLayout(0, 5, 10, 13));
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/user.png")));
		seatSelectPanel.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("다음");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adult = (String)adultCB.getSelectedItem();
				String child = (String)childCB.getSelectedItem();
				mainTabbedPane.setSelectedIndex(4);
				totalPriceTB.setText(adult);
			}
		});
		btnNewButton.setBounds(587, 353, 97, 23);
		seatPanel.add(btnNewButton);
		
	
		
		
		JPanel payPanel = new JPanel();
		mainTabbedPane.addTab("결제페이지", null, payPanel, null);
		payPanel.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("1.결제수단");
		lblNewLabel_18.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(127, 76, 104, 23);
		payPanel.add(lblNewLabel_18);
		
		JRadioButton cardRBtn = new JRadioButton("카드");
		cardRBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(cardRBtn.isSelected()) {
					cardCB.setEnabled(true);
					depositRBtn.setSelected(false);
					PayCount = 0;
				}
			}
		});
		cardRBtn.setBounds(138, 129, 70, 23);
		payPanel.add(cardRBtn);
		
		
		depositRBtn = new JRadioButton("무통장입금");
		depositRBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(depositRBtn.isSelected()) {
					cardCB.setEnabled(false);
					cardRBtn.setSelected(false);
					PayCount = 1;
				}
			}
		});
		depositRBtn.setBounds(138, 166, 121, 23);
		payPanel.add(depositRBtn);
		
		JLabel lblNewLabel_19 = new JLabel("2.할인");
		lblNewLabel_19.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(138, 237, 57, 23);
		payPanel.add(lblNewLabel_19);
		
		cardCB = new JComboBox();
		cardCB.setEnabled(false);
		cardCB.setModel(new DefaultComboBoxModel(new String[] {"국민", "신한", "농협", "롯데", "현대", "삼성", "기업"}));
		cardCB.setBounds(214, 129, 57, 23);
		payPanel.add(cardCB);
		
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
		
		totalPriceTB = new JTextField();
		totalPriceTB.setEnabled(false);
		totalPriceTB.setEditable(false);
		totalPriceTB.setBounds(425, 130, 116, 21);
		payPanel.add(totalPriceTB);
		totalPriceTB.setColumns(10);
		totalPriceTB.setText("");
		
		JLabel lblNewLabel_21 = new JLabel("원");
		lblNewLabel_21.setBounds(550, 134, 57, 15);
		payPanel.add(lblNewLabel_21);
		seatList();
		
	}
	JButton[] buttons;
	private JTextField totalPriceTB;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField nicknameTextField;
	private JRadioButton femaleRadioButton;
	private JRadioButton maleRadioButton;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField loginPasswordField;
	private JTabbedPane mainTabbedPane;
	private JTabbedPane cusTabbedPane;
	private JTabbedPane movieTabbedPane;
	private JButton myPageBtn;
	private JButton loginBtn;
	private JButton joinBtn;
	private JLabel idinfolabel;
	private JLabel genderinfolabel;
	private JComboBox childCB;
	private JComboBox adultCB;
	private JComboBox cardCB;
	private JRadioButton depositRBtn;
	
	public void seatList() {
		
		for(int i=0;i<15;i++) {
			JButton btnNewButton_10 = new JButton("");
			btnNewButton_10.setToolTipText(i+"");
			
			btnNewButton_10.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/user.png")));
			btnNewButton_10.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e){
					JButton source=(JButton)e.getSource();
					String no=source.getToolTipText();
					/*
					 * if(source.getText()) { btnNewButton_10.setEnabled(false); }
					 */
				System.out.println((source.getToolTipText()));
					
				}
			});
			seatSelectPanel.add(btnNewButton_10);
			
			
				
			
			
		}
		
		logoutProcess();
		
	}
	
	//로그인 메소드
	public void loginProcess(String id) throws Exception{
		loginCus = cusService.findById(id);
		setTitle(loginCus.getCus_name());
		
		cusTabbedPane.setSelectedIndex(2);
		mainTabbedPane.setSelectedIndex(0);
		cusTabbedPane.setEnabledAt(0,false);
		cusTabbedPane.setEnabledAt(1,false);
		cusTabbedPane.setEnabledAt(2,true);
		
		joinBtn.setEnabled(false);
		loginBtn.setEnabled(false);
		myPageBtn.setEnabled(true);
		
	}
	
	public void logoutProcess() {
		this.loginCus = null;
		setTitle("");
		
		cusTabbedPane.setEnabledAt(0,true);
		cusTabbedPane.setEnabledAt(1,true);
		cusTabbedPane.setEnabledAt(2,false);
		
		joinBtn.setEnabled(true);
		loginBtn.setEnabled(true);
		myPageBtn.setEnabled(false);
		
	}
}
