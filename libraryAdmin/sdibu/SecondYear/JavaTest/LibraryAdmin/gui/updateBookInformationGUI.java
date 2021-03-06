package sdibu.SecondYear.JavaTest.LibraryAdmin.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class updateBookInformationGUI extends JFrame {
	public updateBookInformationGUI() {
		super("修改图书信息");
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	    int height = Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕的长宽
	    try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {			
			e1.printStackTrace();
		}			//窗口皮肤
		Container c =this.getContentPane();
//		GroupLayout group = new GroupLayout(c);
//		c.setLayout(group);
		JPanel box = new JPanel();
		JPanel box1 = new JPanel();
		Component n1 = Box.createVerticalStrut(60);
		final JLabel tips1 = new JLabel("书籍名称");
		JTextField ip1 = new JTextField(30);
		box1.add(n1);
		box1.add(tips1);
		box1.add(ip1);
		box.add(box1);
		
		JPanel box2 = new JPanel();
		Component n2 = Box.createVerticalStrut(50);
		final JLabel tips2 = new JLabel("     作者");
		JTextField ip2 = new JTextField(30);
		box2.add(n2);
		box2.add(tips2);
		box2.add(ip2);
		box.add(box2);
		
		JPanel box3 = new JPanel();
		Component n3 = Box.createVerticalStrut(50);
		final JLabel tips3 = new JLabel("出版日期");
		JTextField ip3 = new JTextField(30);
		box3.add(n3);
		box3.add(tips3);
		box3.add(ip3);
		box.add(box3);
		
		JPanel box4 = new JPanel();
		Component n4 = Box.createVerticalStrut(50);
		final JLabel tips4 = new JLabel("     类别");
		JTextField ip4 = new JTextField(30);
		box4.add(n4);
		box4.add(tips4);
		box4.add(ip4);
		box.add(box4);
		
		c.add(box);
		
		JPanel down = new JPanel();
		JButton sure = new JButton("确定");
		Dimension preferredSize = new Dimension(100,30);
		sure.setPreferredSize(preferredSize );//设置按钮大小
		down.add(sure);
		c.add(down, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);//窗体可见
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(600, 450);
		this.setBounds((width - 500) / 2,(height - 400) / 2, 500, 400);//窗体大小，居中
		this.setResizable(false);//禁止拉伸窗口，最大化
	}

	public static void main(String[] args) {
		new updateBookInformationGUI();

	}

}
