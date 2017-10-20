package com.wsy.iframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.wsy.Library;
import com.wsy.dao.Dao;
import com.wsy.model.Operator;
import com.wsy.model.Operator;
//import com.wsy.util.CreatecdIcon;
import com.wsy.util.MyDocument;

public class BookLoginIFrame extends JFrame {

	private class BookResetAction implements ActionListener {
		public void actionPerformed(final ActionEvent e){
			username.setText("");
			password.setText("");
			
		}
	}
	class BookLoginAction implements ActionListener {
		public void actionPerformed(final ActionEvent e) {
			
			
			user = Dao.check(username.getText(), new String(password.getPassword()));
			if (!user.getName().equals("")) {
	
				try {
					System.out.println("飞哥你好！");

					Library frame = new Library();
					frame.setVisible(true);
					System.out.println("飞哥你好！");
					BookLoginIFrame.this.setVisible(false);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			
			else {
				JOptionPane.showMessageDialog(null, "输入有问题啊！");
				username.setText("");
				password.setText("");
				
			}
			
		}
	}
	private JPasswordField password;
	private JTextField username;
	private JButton login;
	private JButton reset;
	private static Operator user;
	

	public BookLoginIFrame() {
		super();
		final BorderLayout borderLayout = new BorderLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout.setVgap(10);
		getContentPane().setLayout(borderLayout);
		setTitle("图书馆管理系统登录");
		setBounds(100, 100, 285, 194);

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(panel);

		final JPanel panel_2 = new JPanel();
		final GridLayout gridLayout = new GridLayout(0, 2);
		gridLayout.setHgap(5);
		gridLayout.setVgap(20);
		panel_2.setLayout(gridLayout);
		panel.add(panel_2);

		final JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(0, 0));
		label.setMinimumSize(new Dimension(0, 0));
		panel_2.add(label);
		label.setBounds(new Rectangle(20,30,50,30));
		label.setText("用  户  名：");

		username = new JTextField(20);
		username.setPreferredSize(new Dimension(0, 0));
		username.setBounds(new Rectangle(80,30,180,30));
		panel_2.add(username);

		final JLabel label_1 = new JLabel();
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);
		label_1.setBounds(20,80,50,30);
		label_1.setText("密      码：");

		password = new JPasswordField(20);
		password.setBounds(new Rectangle(80,80,180,30));
		password.setDocument(new MyDocument(6));
		password.setEchoChar('*');//设置密码框的回显字符
		password.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				if (e.getKeyCode() == 10)
					login.doClick();
			}
		});
		panel_2.add(password);

		final JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);

		login=new JButton();
		login.addActionListener(new BookLoginAction());
		
		
		login.setText("登录");
		panel_1.add(login);
		reset=new JButton();
		reset.addActionListener(new BookResetAction());
		
		reset.setText("重置");
		panel_1.add(reset);

	   
		setVisible(true);
		setResizable(false);
		//setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

	}
	public static Operator getUser() {
		return user;
	}
	public static void setUser(Operator user) {
		BookLoginIFrame.user = user;
	}

}
