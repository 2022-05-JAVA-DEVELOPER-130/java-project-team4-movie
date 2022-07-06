package com.movie.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class UiIng extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
					UiIng frame = new UiIng();
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
	public UiIng() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel myPanel = new JPanel();
		myPanel.setLayout(null);
		myPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, myPanel, null);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(12, 10, 73, 52);
		myPanel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_32 = new JLabel("이름");
		lblNewLabel_32.setBounds(173, 86, 57, 15);
		myPanel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("닉네임");
		lblNewLabel_33.setBounds(173, 129, 57, 15);
		myPanel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("생년월일");
		lblNewLabel_34.setBounds(173, 174, 57, 15);
		myPanel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("연락처");
		lblNewLabel_35.setBounds(173, 230, 57, 15);
		myPanel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("이메일");
		lblNewLabel_36.setBounds(173, 282, 57, 15);
		myPanel.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("예매내역");
		lblNewLabel_37.setBounds(446, 86, 57, 15);
		myPanel.add(lblNewLabel_37);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(242, 83, 116, 21);
		myPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 126, 116, 21);
		myPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(242, 171, 116, 21);
		myPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(242, 227, 116, 21);
		myPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(242, 279, 116, 21);
		myPanel.add(textField_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(446, 111, 158, 181);
		myPanel.add(textPane);
		
		JButton btnNewButton_2 = new JButton("회원정보수정");
		btnNewButton_2.setBounds(359, 354, 116, 23);
		myPanel.add(btnNewButton_2);
		
		JPanel updatePanel = new JPanel();
		updatePanel.setLayout(null);
		updatePanel.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, updatePanel, null);
		
		JLabel lblNewLabel_22 = new JLabel("닉네임");
		lblNewLabel_22.setBounds(296, 73, 57, 15);
		updatePanel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("패스워드");
		lblNewLabel_23.setBounds(296, 111, 57, 15);
		updatePanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("생년월일");
		lblNewLabel_24.setBounds(296, 182, 57, 15);
		updatePanel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("성별");
		lblNewLabel_25.setBounds(296, 221, 57, 15);
		updatePanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("휴대폰번호");
		lblNewLabel_26.setBounds(296, 292, 70, 15);
		updatePanel.add(lblNewLabel_26);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("남");
		rdbtnNewRadioButton_5.setBounds(387, 217, 47, 23);
		updatePanel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("여");
		rdbtnNewRadioButton_5_1.setBounds(456, 217, 47, 23);
		updatePanel.add(rdbtnNewRadioButton_5_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(387, 73, 116, 21);
		updatePanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(387, 111, 116, 21);
		updatePanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(387, 179, 116, 21);
		updatePanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(387, 289, 116, 21);
		updatePanel.add(textField_8);
		
		JLabel lblNewLabel_38 = new JLabel("패스워드확인");
		lblNewLabel_38.setBounds(296, 143, 87, 15);
		updatePanel.add(lblNewLabel_38);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(387, 142, 116, 21);
		updatePanel.add(textField_9);
		
		JLabel lblNewLabel_39 = new JLabel("이메일");
		lblNewLabel_39.setBounds(296, 260, 57, 15);
		updatePanel.add(lblNewLabel_39);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(387, 257, 116, 21);
		updatePanel.add(textField_10);
		
		JLabel lblNewLabel_40 = new JLabel("");
		lblNewLabel_40.setBounds(12, 10, 75, 47);
		updatePanel.add(lblNewLabel_40);
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.setBounds(231, 353, 97, 23);
		updatePanel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("정보수정완료");
		btnNewButton_3.setBounds(456, 353, 116, 23);
		updatePanel.add(btnNewButton_3);
	}

}
