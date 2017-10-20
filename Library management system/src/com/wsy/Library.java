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
			new BookLoginIFrame();//��¼����
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void addIFame(JInternalFrame iframe) { // ����Ӵ���ķ���
		DESKTOP_PANE.add(iframe);
	}
	public Library() {
		super();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setSize(800, 600);
		setTitle("ͼ��ݹ���ϵͳ");
		JToolBar toolBar = createToolBar(); // ���ô����������ķ���
		getContentPane().add(toolBar, BorderLayout.NORTH);
		final JLabel label = new JLabel();
		label.setBounds(0, 0, 0, 0);
		label.setIcon(null); // ���屳��

	
		DESKTOP_PANE.add(label,new Integer(Integer.MIN_VALUE));
		getContentPane().add(DESKTOP_PANE);
	}
	
	
	private JToolBar createToolBar(){             //�����������ķ���
		JToolBar toolBar=new JToolBar();          //��ʼ��������
		toolBar.setFloatable(false);             //�����Ƿ�����ƶ�������
		toolBar.setBorder(new BevelBorder(BevelBorder.RAISED));
		//���ñ߿�ͼ����Ӱ�ť
		JButton bookAddButton=new JButton(MenuActions.BOOK_ADD);
		bookAddButton.setVisible( true);
		toolBar.add(bookAddButton);
		
		//ͼ����Ϣ�޸İ�ť
		JButton bookModiAndDelButton=new JButton(MenuActions.BOOK_MODIFY);
		bookModiAndDelButton.setVisible(true);
		toolBar.add(bookModiAndDelButton);
		
		//ͼ�������Ӱ�ť
		JButton bookTypeAddButton=new JButton(MenuActions.BOOKTYPE_ADD);
		bookTypeAddButton.setVisible(true);
		toolBar.add(bookTypeAddButton);
		
		//ͼ������޸�
		JButton bookTypeModiAndDelButton=new JButton(MenuActions.BOOKTYPE_MODIFY);
		bookTypeModiAndDelButton.setVisible(true);
		toolBar.add(bookTypeModiAndDelButton);
		
		//ͼ����İ�ť
		JButton bookBorrowButton=new JButton(MenuActions.BORROW);
		bookBorrowButton.setVisible(true);
		toolBar.add(bookBorrowButton);
		
		//ͼ��黹��ť
		JButton bookBackButton=new JButton(MenuActions.GIVE_BACK);
		bookBackButton.setVisible(true);
		toolBar.add(bookBackButton);
		
		//ͼ��������ť
		JButton bookSearchButton=new JButton(MenuActions.BOOK_SEARCH);
		bookSearchButton.setVisible(true);
		toolBar.add(bookSearchButton);
		
		
		//���鶩����ť
		JButton bookOrderButton=new JButton(MenuActions.NEWBOOK_ORDER);
		bookOrderButton.setVisible(true);
		toolBar.add(bookOrderButton);
		
		//�������鰴ť
		JButton bookCheckButton=new JButton(MenuActions.NEWBOOK_CHECK_ACCEPT);
		bookCheckButton.setVisible(true);
		toolBar.add(bookCheckButton);
		
		//������Ϣ��Ӱ�ť
		JButton readerAddButton=new JButton(MenuActions.READER_ADD);
		readerAddButton.setVisible(true);
		toolBar.add(readerAddButton);
		
		//������Ϣ�޸�
		JButton readerModiAndDelButton=new JButton(MenuActions.READER_MODIFY);
		readerModiAndDelButton.setVisible(true);
		toolBar.add(readerModiAndDelButton);
		
		//���Ŀ���
		JButton gengGaiMiMaButton=new JButton(MenuActions.MODIFY_PASSWORD);
		gengGaiMiMaButton.setVisible(true);
		toolBar.add(gengGaiMiMaButton);
		
		//�û����
		JButton userAddButton=new JButton(MenuActions.USER_ADD);
		userAddButton.setVisible(true);
		toolBar.add(userAddButton);
		
		//�û��޸�
		JButton userModiAndDelButton=new JButton(MenuActions.USER_MODIFY);
		userModiAndDelButton.setVisible(true);
		toolBar.add(userModiAndDelButton);
		
		//�˳�ϵͳ��ť
		JButton ExitButton=new JButton(MenuActions.EXIT);
		ExitButton.setVisible(true);
		toolBar.add(ExitButton);
		return toolBar;
	}
	
	
}

