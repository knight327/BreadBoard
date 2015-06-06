
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.GridLayout;

import javax.swing.JEditorPane;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.swing.border.*;


public class main extends JFrame implements MouseMotionListener, MouseListener{

	private JPanel contentPane;
	private CustomPanel myPanel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	
	public main() {
		setTitle("BBS-Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mnEdit.add(mntmBack);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("about...");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(12, 10, 137, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		ImageIcon icon1 = new ImageIcon("/Users/Mac-Book/BBS/src/7432.png");
		Image img1 = icon1.getImage();
		Image newimg1 = img1.getScaledInstance(40, 100, DO_NOTHING_ON_CLOSE);
		icon1 = new ImageIcon(newimg1);

		ImageIcon icon2 = new ImageIcon("/Users/Mac-Book/BBS/src/7408.png");
		Image img2 = icon2.getImage();
		Image newimg2 = img2.getScaledInstance(40, 100, DO_NOTHING_ON_CLOSE);
		icon2 = new ImageIcon(newimg2);
		
		ImageIcon icon3 = new ImageIcon("/Users/Mac-Book/BBS/src/7404.png");
		Image img3 = icon3.getImage();
		Image newimg3 = img3.getScaledInstance(40, 100, DO_NOTHING_ON_CLOSE);
		icon3 = new ImageIcon(newimg3);
		
		
		ImageIcon icon4 = new ImageIcon("/Users/Mac-Book/BBS/src/led.png");
		Image img4 = icon4.getImage();
		Image newimg4 = img4.getScaledInstance(40, 100, DO_NOTHING_ON_CLOSE);
		icon4 = new ImageIcon(newimg4);
		
		JButton btnNewButton = new JButton("", icon1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(6, 6, 40, 100);
		panel.add(btnNewButton);
		
		JButton button = new JButton("", icon2);
		button.setBounds(46, 6, 40, 100);
		panel.add(button);
		
		JButton button_1 = new JButton("", icon3);
		button_1.setBounds(86, 6, 40, 100);
		panel.add(button_1);
		
		
		
		JButton btnNewButton_1 = new JButton("", icon4);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(6, 120, 40, 100);
		panel.add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(161, 10, 711, 406);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	
		
		
		
		JPanel myPanel = new JPanel();
		myPanel.setBackground(new Color(238, 232, 170));
		myPanel.setBounds(77, 41, 538, 320);
		myPanel.setLayout(null);
	
		panel_1.add(myPanel);
		
		
		
		
		
		int _width = 20; //버튼 크
		int _height = 20;
				
		
		JButton btn1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24;
		        
		ImageIcon icon = new ImageIcon("/Users/Mac-Book/BBS/src/button1.jpg");
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance(_width, _height, DO_NOTHING_ON_CLOSE);
		icon = new ImageIcon(newimg);
		
		

		btn1 = new JButton("", icon);
		btn1.setBounds(10, 10, 20, 20);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(btn1);
		
		
		bt2 = new JButton("", icon);
		bt2.setBounds(40, 10, 20, 20);
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt2);
		
		
		
		bt3 = new JButton("", icon);
		bt3.setBounds(70, 10, 20, 20);
		
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt3);
		
		bt4 = new JButton("", icon);
		bt4.setBounds(100, 10, 20, 20);
		
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt4);
		
		bt5 = new JButton("", icon);
		bt5.setBounds(150, 10, 20, 20);
		
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt5);
		
		bt6 = new JButton("", icon);
		bt6.setBounds(180, 10, 20, 20);
		
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt6);
		
		bt7 = new JButton("", icon);
		bt7.setBounds(210, 10, 20, 20);
		
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt7);
		
		bt8 = new JButton("", icon);
		bt8.setBounds(240, 10, 20, 20);
		
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt8);
		
		
		bt8 = new JButton("", icon);
		bt8.setBounds(290, 10, 20, 20);
		
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt8);
		
		
		bt9 = new JButton("", icon);
		bt9.setBounds(320, 10, 20, 20);
		
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt9);
		
		
		
		bt10 = new JButton("", icon);
		bt10.setBounds(350, 10, 20, 20);
		
		bt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt10);
		
		
		
		
		bt11 = new JButton("", icon);
		bt11.setBounds(380, 10, 20, 20);
		
		bt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt11);
		
		
		
		
		bt12 = new JButton("", icon);
		bt12.setBounds(10, 30, 20, 20);
		
		bt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt12);
		
		bt13 = new JButton("", icon);
		bt13.setBounds(40, 30, 20, 20);
		
		bt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt13);
		
		
		bt14 = new JButton("", icon);
		bt14.setBounds(70, 30, 20, 20);
		
		bt14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt14);
		
		
		bt15 = new JButton("", icon);
		bt15.setBounds(100, 30, 20, 20);
		
		bt15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt15);
		
		bt16 = new JButton("", icon);
		bt16.setBounds(150, 30, 20, 20);
		
		bt16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt16);
		
		bt17 = new JButton("", icon);
		bt17.setBounds(180, 30, 20, 20);
		
		bt17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt17);
		
		bt17 = new JButton("", icon);
		bt17.setBounds(210, 30, 20, 20);
		
		bt17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt17);
		
		bt18 = new JButton("", icon);
		bt18.setBounds(240, 30, 20, 20);
		
		bt18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt18);
		
		bt19 = new JButton("", icon);
		bt19.setBounds(290, 30, 20, 20);
		
		bt19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt19);
		
		bt20 = new JButton("", icon);
		bt20.setBounds(320, 30, 20, 20);
		
		bt20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt20);
		
		
		bt21 = new JButton("", icon);
		bt21.setBounds(350, 30, 20, 20);
		
		bt21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt21);
		
		bt22 = new JButton("", icon);
		bt22.setBounds(380, 30, 20, 20);
		
		bt22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		myPanel.add(bt22);
		
		JButton button_2 = new JButton("", icon);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(10, 67, 20, 20);
		myPanel.add(button_2);
		
		JButton button_3 = new JButton("", icon);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(412, 10, 20, 20);
		myPanel.add(button_3);
		
		JButton button_4 = new JButton("", icon);
		button_4.setBounds(444, 10, 20, 20);
		myPanel.add(button_4);
		
		JButton button_5 = new JButton("", icon);
		button_5.setBounds(473, 10, 20, 20);
		myPanel.add(button_5);
		
		JButton button_6 = new JButton("", icon);
		button_6.setBounds(501, 10, 20, 20);
		myPanel.add(button_6);
		
		JButton button_7 = new JButton("", icon);
		button_7.setBounds(412, 30, 20, 20);
		myPanel.add(button_7);
		
		JButton button_8 = new JButton("", icon);
		button_8.setBounds(444, 30, 20, 20);
		myPanel.add(button_8);
		
		JButton button_9 = new JButton("", icon);
		button_9.setBounds(473, 30, 20, 20);
		myPanel.add(button_9);
		
		JButton button_10 = new JButton("", icon);
		button_10.setBounds(501, 30, 20, 20);
		myPanel.add(button_10);
		
		JButton button_11 = new JButton("", icon);
		button_11.setBounds(40, 67, 20, 20);
		myPanel.add(button_11);
		
		JButton button_12 = new JButton("", icon);
		button_12.setBounds(70, 67, 20, 20);
		myPanel.add(button_12);
		
		JButton button_13 = new JButton("", icon);
		button_13.setBounds(100, 67, 20, 20);
		myPanel.add(button_13);
		
		JButton button_14 = new JButton("", icon);
		button_14.setBounds(150, 67, 20, 20);
		myPanel.add(button_14);
		
		JButton button_15 = new JButton("", icon);
		button_15.setBounds(180, 67, 20, 20);
		myPanel.add(button_15);
		
		JButton button_16 = new JButton("", icon);
		button_16.setBounds(210, 67, 20, 20);
		myPanel.add(button_16);
		
		JButton button_17 = new JButton("", icon);
		button_17.setBounds(240, 67, 20, 20);
		myPanel.add(button_17);
		
		JButton button_18 = new JButton("", icon);
		button_18.setBounds(290, 67, 20, 20);
		myPanel.add(button_18);
		
		JButton button_19 = new JButton("", icon);
		button_19.setBounds(320, 67, 20, 20);
		myPanel.add(button_19);
		
		JButton button_20 = new JButton("", icon);
		button_20.setBounds(350, 67, 20, 20);
		myPanel.add(button_20);
		
		JButton button_21 = new JButton("", icon);
		button_21.setBounds(380, 67, 20, 20);
		myPanel.add(button_21);
		
		JButton button_22 = new JButton("", icon);
		button_22.setBounds(412, 67, 20, 20);
		myPanel.add(button_22);
		
		JButton button_23 = new JButton("", icon);
		button_23.setBounds(444, 67, 20, 20);
		myPanel.add(button_23);
		
		JButton button_24 = new JButton("", icon);
		button_24.setBounds(473, 67, 20, 20);
		myPanel.add(button_24);
		
		JButton button_25 = new JButton("", icon);
		button_25.setBounds(501, 67, 20, 20);
		myPanel.add(button_25);
		
		JButton button_26 = new JButton("",icon);
		button_26.setBounds(10, 90, 20, 20);
		myPanel.add(button_26);
		
		JButton button_27 = new JButton("", icon);
		button_27.setBounds(40, 90, 20, 20);
		myPanel.add(button_27);
		
		JButton button_28 = new JButton("", icon);
		button_28.setBounds(70, 90, 20, 20);
		myPanel.add(button_28);
		
		JButton button_29 = new JButton("", icon);
		button_29.setBounds(100, 90, 20, 20);
		myPanel.add(button_29);
		
		JButton button_30 = new JButton("", icon);
		button_30.setBounds(150, 90, 20, 20);
		myPanel.add(button_30);
		
		JButton button_31 = new JButton("", icon);
		button_31.setBounds(180, 90, 20, 20);
		myPanel.add(button_31);
		
		JButton button_32 = new JButton("", icon);
		button_32.setBounds(210, 90, 20, 20);
		myPanel.add(button_32);
		
		JButton button_33 = new JButton("", icon);
		button_33.setBounds(240, 90, 20, 20);
		myPanel.add(button_33);
		
		JButton button_34 = new JButton("", icon);
		button_34.setBounds(290, 90, 20, 20);
		myPanel.add(button_34);
		
		JButton button_35 = new JButton("", icon);
		button_35.setBounds(320, 90, 20, 20);
		myPanel.add(button_35);
		
		JButton button_36 = new JButton("", icon);
		button_36.setBounds(350, 90, 20, 20);
		myPanel.add(button_36);
		
		JButton button_37 = new JButton("", icon);
		button_37.setBounds(380, 90, 20, 20);
		myPanel.add(button_37);
		
		JButton button_38 = new JButton("", icon);
		button_38.setBounds(412, 90, 20, 20);
		myPanel.add(button_38);
		
		JButton button_39 = new JButton("", icon);
		button_39.setBounds(444, 90, 20, 20);
		myPanel.add(button_39);
		
		JButton button_40 = new JButton("", icon);
		button_40.setBounds(473, 90, 20, 20);
		myPanel.add(button_40);
		
		JButton button_41 = new JButton("", icon);
		button_41.setBounds(501, 90, 20, 20);
		myPanel.add(button_41);
		
		JButton button_42 = new JButton("", icon);
		button_42.setBounds(10, 117, 20, 20);
		myPanel.add(button_42);
		
		JButton button_43 = new JButton("", icon);
		button_43.setBounds(40, 117, 20, 20);
		myPanel.add(button_43);
		
		JButton button_44 = new JButton("", icon);
		button_44.setBounds(70, 117, 20, 20);
		myPanel.add(button_44);
		
		JButton button_45 = new JButton("", icon);
		button_45.setBounds(100, 117, 20, 20);
		myPanel.add(button_45);
		
		JButton button_46 = new JButton("", icon);
		button_46.setBounds(150, 117, 20, 20);
		myPanel.add(button_46);
		
		JButton button_47 = new JButton("", icon);
		button_47.setBounds(180, 117, 20, 20);
		myPanel.add(button_47);
		
		JButton button_48 = new JButton("", icon);
		button_48.setBounds(210, 117, 20, 20);
		myPanel.add(button_48);
		
		JButton button_49 = new JButton("", icon);
		button_49.setBounds(240, 117, 20, 20);
		myPanel.add(button_49);
		
		JButton button_50 = new JButton("", icon);
		button_50.setBounds(290, 117, 20, 20);
		myPanel.add(button_50);
		
		JButton button_51 = new JButton("", icon);
		button_51.setBounds(320, 117, 20, 20);
		myPanel.add(button_51);
		
		JButton button_52 = new JButton("", icon);
		button_52.setBounds(350, 117, 20, 20);
		myPanel.add(button_52);
		
		JButton button_53 = new JButton("", icon);
		button_53.setBounds(380, 117, 20, 20);
		myPanel.add(button_53);
		
		JButton button_54 = new JButton("", icon);
		button_54.setBounds(412, 117, 20, 20);
		myPanel.add(button_54);
		
		JButton button_55 = new JButton("", icon);
		button_55.setBounds(444, 117, 20, 20);
		myPanel.add(button_55);
		
		JButton button_56 = new JButton("", icon);
		button_56.setBounds(473, 117, 20, 20);
		myPanel.add(button_56);
		
		JButton button_57 = new JButton("", icon);
		button_57.setBounds(501, 117, 20, 20);
		myPanel.add(button_57);
		
		JButton button_58 = new JButton("", icon);
		button_58.setBounds(10, 145, 20, 20);
		myPanel.add(button_58);
		
		JButton button_59 = new JButton("", icon);
		button_59.setBounds(40, 145, 20, 20);
		myPanel.add(button_59);
		
		JButton button_60 = new JButton("", icon);
		button_60.setBounds(70, 145, 20, 20);
		myPanel.add(button_60);
		
		JButton button_61 = new JButton("", icon);
		button_61.setBounds(100, 145, 20, 20);
		myPanel.add(button_61);
		
		JButton button_62 = new JButton("", icon);
		button_62.setBounds(150, 145, 20, 20);
		myPanel.add(button_62);
		
		JButton button_63 = new JButton("", icon);
		button_63.setBounds(180, 145, 20, 20);
		myPanel.add(button_63);
		
		JButton button_64 = new JButton("", icon);
		button_64.setBounds(210, 145, 20, 20);
		myPanel.add(button_64);
		
		JButton button_65 = new JButton("", icon);
		button_65.setBounds(240, 145, 20, 20);
		myPanel.add(button_65);
		
		JButton button_66 = new JButton("", icon);
		button_66.setBounds(290, 145, 20, 20);
		myPanel.add(button_66);
		
		JButton button_67 = new JButton("", icon);
		button_67.setBounds(320, 145, 20, 20);
		myPanel.add(button_67);
		
		JButton button_68 = new JButton("", icon);
		button_68.setBounds(350, 145, 20, 20);
		myPanel.add(button_68);
		
		JButton button_69 = new JButton("", icon);
		button_69.setBounds(380, 145, 20, 20);
		myPanel.add(button_69);
		
		JButton button_70 = new JButton("", icon);
		button_70.setBounds(412, 145, 20, 20);
		myPanel.add(button_70);
		
		JButton button_71 = new JButton("", icon);
		button_71.setBounds(444, 145, 20, 20);
		myPanel.add(button_71);
		
		JButton button_72 = new JButton("", icon);
		button_72.setBounds(473, 145, 20, 20);
		myPanel.add(button_72);
		
		JButton button_73 = new JButton("", icon);
		button_73.setBounds(501, 145, 20, 20);
		myPanel.add(button_73);
		
		JButton button_74 = new JButton("", icon);
		button_74.setBounds(10, 172, 20, 20);
		myPanel.add(button_74);
		
		JButton button_75 = new JButton("", icon);
		button_75.setBounds(40, 172, 20, 20);
		myPanel.add(button_75);
		
		JButton button_76 = new JButton("", icon);
		button_76.setBounds(70, 172, 20, 20);
		myPanel.add(button_76);
		
		JButton button_77 = new JButton("", icon);
		button_77.setBounds(100, 172, 20, 20);
		myPanel.add(button_77);
		
		JButton button_78 = new JButton("", icon);
		button_78.setBounds(150, 172, 20, 20);
		myPanel.add(button_78);
		
		JButton button_79 = new JButton("", icon);
		button_79.setBounds(180, 172, 20, 20);
		myPanel.add(button_79);
		
		JButton button_80 = new JButton("", icon);
		button_80.setBounds(210, 172, 20, 20);
		myPanel.add(button_80);
		
		JButton button_81 = new JButton("", icon);
		button_81.setBounds(240, 172, 20, 20);
		myPanel.add(button_81);
		
		JButton button_82 = new JButton("", icon);
		button_82.setBounds(290, 172, 20, 20);
		myPanel.add(button_82);
		
		JButton button_83 = new JButton("", icon);
		button_83.setBounds(320, 172, 20, 20);
		myPanel.add(button_83);
		
		JButton button_84 = new JButton("", icon);
		button_84.setBounds(350, 172, 20, 20);
		myPanel.add(button_84);
		
		JButton button_85 = new JButton("", icon);
		button_85.setBounds(380, 172, 20, 20);
		myPanel.add(button_85);
		
		JButton button_86 = new JButton("", icon);
		button_86.setBounds(412, 172, 20, 20);
		myPanel.add(button_86);
		
		JButton button_87 = new JButton("", icon);
		button_87.setBounds(444, 172, 20, 20);
		myPanel.add(button_87);
		
		JButton button_88 = new JButton("", icon);
		button_88.setBounds(473, 172, 20, 20);
		myPanel.add(button_88);
		
		JButton button_89 = new JButton("", icon);
		button_89.setBounds(501, 172, 20, 20);
		myPanel.add(button_89);
		
		JButton button_90 = new JButton("", icon);
		button_90.setBounds(10, 197, 20, 20);
		myPanel.add(button_90);
		
		JButton button_91 = new JButton("", icon);
		button_91.setBounds(40, 197, 20, 20);
		myPanel.add(button_91);
		
		JButton button_92 = new JButton("", icon);
		button_92.setBounds(70, 197, 20, 20);
		myPanel.add(button_92);
		
		JButton button_93 = new JButton("", icon);
		button_93.setBounds(100, 197, 20, 20);
		myPanel.add(button_93);
		
		JButton button_94 = new JButton("", icon);
		button_94.setBounds(150, 197, 20, 20);
		myPanel.add(button_94);
		
		JButton button_95 = new JButton("", icon);
		button_95.setBounds(180, 197, 20, 20);
		myPanel.add(button_95);
		
		JButton button_96 = new JButton("", icon);
		button_96.setBounds(210, 197, 20, 20);
		myPanel.add(button_96);
		
		JButton button_97 = new JButton("", icon);
		button_97.setBounds(240, 197, 20, 20);
		myPanel.add(button_97);
		
		JButton button_98 = new JButton("", icon);
		button_98.setBounds(290, 197, 20, 20);
		myPanel.add(button_98);
		
		JButton button_99 = new JButton("", icon);
		button_99.setBounds(320, 197, 20, 20);
		myPanel.add(button_99);
		
		JButton button_100 = new JButton("", icon);
		button_100.setBounds(350, 197, 20, 20);
		myPanel.add(button_100);
		
		JButton button_101 = new JButton("", icon);
		button_101.setBounds(380, 197, 20, 20);
		myPanel.add(button_101);
		
		JButton button_102 = new JButton("", icon);
		button_102.setBounds(412, 197, 20, 20);
		myPanel.add(button_102);
		
		JButton button_103 = new JButton("", icon);
		button_103.setBounds(444, 197, 20, 20);
		myPanel.add(button_103);
		
		JButton button_104 = new JButton("", icon);
		button_104.setBounds(473, 197, 20, 20);
		myPanel.add(button_104);
		
		JButton button_105 = new JButton("", icon);
		button_105.setBounds(501, 197, 20, 20);
		myPanel.add(button_105);
		
		JButton button_106 = new JButton("", icon);
		button_106.setBounds(10, 221, 20, 20);
		myPanel.add(button_106);
		
		JButton button_107 = new JButton("", icon);
		button_107.setBounds(40, 221, 20, 20);
		myPanel.add(button_107);
		
		JButton button_108 = new JButton("", icon);
		button_108.setBounds(70, 221, 20, 20);
		myPanel.add(button_108);
		
		JButton button_109 = new JButton("", icon);
		button_109.setBounds(100, 221, 20, 20);
		myPanel.add(button_109);
		
		JButton button_110 = new JButton("", icon);
		button_110.setBounds(150, 221, 20, 20);
		myPanel.add(button_110);
		
		JButton button_111 = new JButton("", icon);
		button_111.setBounds(180, 221, 20, 20);
		myPanel.add(button_111);
		
		JButton button_112 = new JButton("", icon);
		button_112.setBounds(210, 221, 20, 20);
		myPanel.add(button_112);
		
		JButton button_113 = new JButton("", icon);
		button_113.setBounds(240, 221, 20, 20);
		myPanel.add(button_113);
		
		JButton button_114 = new JButton("",icon);
		button_114.setBounds(290, 221, 20, 20);
		myPanel.add(button_114);
		
		JButton button_115 = new JButton("", icon);
		button_115.setBounds(320, 221, 20, 20);
		myPanel.add(button_115);
		
		JButton button_116 = new JButton("",icon);
		button_116.setBounds(350, 221, 20, 20);
		myPanel.add(button_116);
		
		JButton button_117 = new JButton("", icon);
		button_117.setBounds(380, 221, 20, 20);
		myPanel.add(button_117);
		
		JButton button_118 = new JButton("", icon);
		button_118.setBounds(412, 221, 20, 20);
		myPanel.add(button_118);
		
		JButton button_119 = new JButton("", icon);
		button_119.setBounds(444, 221, 20, 20);
		myPanel.add(button_119);
		
		JButton button_120 = new JButton("", icon);
		button_120.setBounds(473, 221, 20, 20);
		myPanel.add(button_120);
		
		JButton button_121 = new JButton("", icon);
		button_121.setBounds(501, 221, 20, 20);
		myPanel.add(button_121);
		
		JButton button_122 = new JButton("", icon);
		button_122.setBounds(10, 268, 20, 20);
		myPanel.add(button_122);
		
		JButton button_123 = new JButton("", icon);
		button_123.setBounds(40, 268, 20, 20);
		myPanel.add(button_123);
		
		JButton button_124 = new JButton("", icon);
		button_124.setBounds(70, 268, 20, 20);
		myPanel.add(button_124);
		
		JButton button_125 = new JButton("",icon);
		button_125.setBounds(100, 268, 20, 20);
		myPanel.add(button_125);
		
		JButton button_126 = new JButton("", icon);
		button_126.setBounds(150, 268, 20, 20);
		myPanel.add(button_126);
		
		JButton button_127 = new JButton("",icon);
		button_127.setBounds(180, 268, 20, 20);
		myPanel.add(button_127);
		
		JButton button_128 = new JButton("", icon);
		button_128.setBounds(210, 268, 20, 20);
		myPanel.add(button_128);
		
		JButton button_129 = new JButton("", icon);
		button_129.setBounds(240, 268, 20, 20);
		myPanel.add(button_129);
		
		JButton button_130 = new JButton("", icon);
		button_130.setBounds(290, 268, 20, 20);
		myPanel.add(button_130);
		
		JButton button_131 = new JButton("", icon);
		button_131.setBounds(320, 268, 20, 20);
		myPanel.add(button_131);
		
		JButton button_132 = new JButton("", icon);
		button_132.setBounds(350, 268, 20, 20);
		myPanel.add(button_132);
		
		JButton button_133 = new JButton("", icon);
		button_133.setBounds(380, 268, 20, 20);
		myPanel.add(button_133);
		
		JButton button_134 = new JButton("", icon);
		button_134.setBounds(412, 268, 20, 20);
		myPanel.add(button_134);
		
		JButton button_135 = new JButton("", icon);
		button_135.setBounds(444, 268, 20, 20);
		myPanel.add(button_135);
		
		JButton button_136 = new JButton("", icon);
		button_136.setBounds(473, 268, 20, 20);
		myPanel.add(button_136);
		
		JButton button_137 = new JButton("",icon);
		button_137.setBounds(501, 268, 20, 20);
		myPanel.add(button_137);
		
		JButton button_138 = new JButton("", icon);
		button_138.setBounds(10, 294, 20, 20);
		myPanel.add(button_138);
		
		JButton button_139 = new JButton("", icon);
		button_139.setBounds(40, 294, 20, 20);
		myPanel.add(button_139);
		
		JButton button_140 = new JButton("", icon);
		button_140.setBounds(70, 294, 20, 20);
		myPanel.add(button_140);
		
		JButton button_141 = new JButton("", icon);
		button_141.setBounds(100, 294, 20, 20);
		myPanel.add(button_141);
		
		JButton button_142 = new JButton("", icon);
		button_142.setBounds(150, 294, 20, 20);
		myPanel.add(button_142);
		
		JButton button_143 = new JButton("", icon);
		button_143.setBounds(180, 294, 20, 20);
		myPanel.add(button_143);
		
		JButton button_144 = new JButton("", icon);
		button_144.setBounds(210, 294, 20, 20);
		myPanel.add(button_144);
		
		JButton button_145 = new JButton("", icon);
		button_145.setBounds(240, 294, 20, 20);
		myPanel.add(button_145);
		
		JButton button_146 = new JButton("", icon);
		button_146.setBounds(290, 294, 20, 20);
		myPanel.add(button_146);
		
		JButton button_147 = new JButton("", icon);
		button_147.setBounds(320, 294, 20, 20);
		myPanel.add(button_147);
		
		JButton button_148 = new JButton("",icon);
		button_148.setBounds(350, 294, 20, 20);
		myPanel.add(button_148);
		
		JButton button_149 = new JButton("", icon);
		button_149.setBounds(380, 294, 20, 20);
		myPanel.add(button_149);
		
		JButton button_150 = new JButton("", icon);
		button_150.setBounds(412, 294, 20, 20);
		myPanel.add(button_150);
		
		JButton button_151 = new JButton("", icon);
		button_151.setBounds(444, 294, 20, 20);
		myPanel.add(button_151);
		
		JButton button_152 = new JButton("", icon);
		button_152.setBounds(473, 294, 20, 20);
		myPanel.add(button_152);
		
		JButton button_153 = new JButton("", icon);
		button_153.setBounds(501, 294, 20, 20);
		myPanel.add(button_153);
		
		
		

		
		
		
		
	
		JRadioButton rdbtnRed = new JRadioButton("RED");
		rdbtnRed.setBounds(8, 6, 55, 23);
		panel_1.add(rdbtnRed);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Black");
		rdbtnNewRadioButton.setBounds(67, 6, 70, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnWhite = new JRadioButton("White");
		rdbtnWhite.setBounds(141, 6, 70, 23);
		panel_1.add(rdbtnWhite);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(12, 464, 860, 67);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JEditorPane editorPane = new JEditorPane();
		panel_3.add(editorPane);
		
	}
	
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
