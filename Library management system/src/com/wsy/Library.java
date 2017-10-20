package com.wsy;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.wsy.iframe.*;


public class Library extends JFrame {
	private static final JDesktopPane DESKTOP_PANE = new JDesktopPane();
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager
					.getSystemLookAndFeelClassName());
			new BookLoginIFrame();//登录窗口
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void addIFame(JInternalFrame iframe) { // 添加子窗体的方法
		DESKTOP_PANE.add(iframe);
	}
	public Library() {
		super();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setSize(800, 600);
		setTitle("图书馆管理系统");
		JToolBar toolBar = createToolBar(); // 调用创建工具栏的方法
		getContentPane().add(toolBar, BorderLayout.NORTH);
		final JLabel label = new JLabel();
		label.setBounds(0, 0, 0, 0);
		label.setIcon(null); // 窗体背景

	
		DESKTOP_PANE.add(label,new Integer(Integer.MIN_VALUE));
		getContentPane().add(DESKTOP_PANE);
	}
	
	
	private JToolBar createToolBar(){             //创建工具栏的方法
		JToolBar toolBar=new JToolBar();          //初始化工具栏
		toolBar.setFloatable(false);             //设置是否可以移动工具栏
		toolBar.setBorder(new BevelBorder(BevelBorder.RAISED));
		//设置边框图书添加按钮
		JButton bookAddButton=new JButton(MenuActions.BOOK_ADD);
		bookAddButton.setVisible( true);
		toolBar.add(bookAddButton);
		
		//图书信息修改按钮
		JButton bookModiAndDelButton=new JButton(MenuActions.BOOK_MODIFY);
		bookModiAndDelButton.setVisible(true);
		toolBar.add(bookModiAndDelButton);
		
		//图书类别添加按钮
		JButton bookTypeAddButton=new JButton(MenuActions.BOOKTYPE_ADD);
		bookTypeAddButton.setVisible(true);
		toolBar.add(bookTypeAddButton);
		
		//图书类别修改
		JButton bookTypeModiAndDelButton=new JButton(MenuActions.BOOKTYPE_MODIFY);
		bookTypeModiAndDelButton.setVisible(true);
		toolBar.add(bookTypeModiAndDelButton);
		
		//图书借阅按钮
		JButton bookBorrowButton=new JButton(MenuActions.BORROW);
		bookBorrowButton.setVisible(true);
		toolBar.add(bookBorrowButton);
		
		//图书归还按钮
		JButton bookBackButton=new JButton(MenuActions.GIVE_BACK);
		bookBackButton.setVisible(true);
		toolBar.add(bookBackButton);
		
		//图书搜索按钮
		JButton bookSearchButton=new JButton(MenuActions.BOOK_SEARCH);
		bookSearchButton.setVisible(true);
		toolBar.add(bookSearchButton);
		
		
		//新书订购按钮
		JButton bookOrderButton=new JButton(MenuActions.NEWBOOK_ORDER);
		bookOrderButton.setVisible(true);
		toolBar.add(bookOrderButton);
		
		//验收新书按钮
		JButton bookCheckButton=new JButton(MenuActions.NEWBOOK_CHECK_ACCEPT);
		bookCheckButton.setVisible(true);
		toolBar.add(bookCheckButton);
		
		//读者信息添加按钮
		JButton readerAddButton=new JButton(MenuActions.READER_ADD);
		readerAddButton.setVisible(true);
		toolBar.add(readerAddButton);
		
		//读者信息修改
		JButton readerModiAndDelButton=new JButton(MenuActions.READER_MODIFY);
		readerModiAndDelButton.setVisible(true);
		toolBar.add(readerModiAndDelButton);
		
		//更改口令
		JButton gengGaiMiMaButton=new JButton(MenuActions.MODIFY_PASSWORD);
		gengGaiMiMaButton.setVisible(true);
		toolBar.add(gengGaiMiMaButton);
		
		//用户添加
		JButton userAddButton=new JButton(MenuActions.USER_ADD);
		userAddButton.setVisible(true);
		toolBar.add(userAddButton);
		
		//用户修改
		JButton userModiAndDelButton=new JButton(MenuActions.USER_MODIFY);
		userModiAndDelButton.setVisible(true);
		toolBar.add(userModiAndDelButton);
		
		//退出系统按钮
		JButton ExitButton=new JButton(MenuActions.EXIT);
		ExitButton.setVisible(true);
		toolBar.add(ExitButton);
		return toolBar;
	}
	
	
}

