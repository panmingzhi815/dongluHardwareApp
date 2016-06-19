package com.dongluhitec.card;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class HardwareApp {
	
	public enum ShowType{
		实时日志,设备列表
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardwareApp window = new HardwareApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HardwareApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_9.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_9);
		
		JLabel lblip = new JLabel("数据库ip:");
		panel_9.add(lblip);
		
		JLabel label_4 = new JLabel("192.168.123.123");
		panel_9.add(label_4);
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_10.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.add(panel_10);
		
		JLabel lblip_1 = new JLabel("本机电脑ip:");
		panel_10.add(lblip_1);
		
		JLabel label_5 = new JLabel("192.168.123.123");
		panel_10.add(label_5);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_11.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel.add(panel_11);
		
		JLabel label_6 = new JLabel("运行时长：");
		panel_11.add(label_6);
		
		JLabel label_7 = new JLabel("123：123：123");
		panel_11.add(label_7);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_8.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel.add(panel_8);
		
		JLabel label_8 = new JLabel("清空日志");
		panel_8.add(label_8);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("业务底层", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{60, 24, 57, 0};
		gbl_panel_7.rowHeights = new int[]{23, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel label = new JLabel("当前状态：");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_7.add(label, gbc_label);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label_1 = new JLabel("停止");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 10, 0, 10);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panel_7.add(label_1, gbc_label_1);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JToggleButton toggleButton = new JToggleButton("启动");
		GridBagConstraints gbc_toggleButton = new GridBagConstraints();
		gbc_toggleButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_toggleButton.gridx = 2;
		gbc_toggleButton.gridy = 0;
		panel_7.add(toggleButton, gbc_toggleButton);
		toggleButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_12.getLayout();
		flowLayout_5.setVgap(0);
		flowLayout_5.setHgap(0);
		flowLayout_5.setAlignment(FlowLayout.RIGHT);
		panel_12.setBackground(Color.WHITE);
		panel_3.add(panel_12);
		
		JLabel lblNewLabel = new JLabel("显示类型:");
		panel_12.add(lblNewLabel);
		
		JComboBox<ShowType> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<ShowType>(ShowType.values()));
		panel_12.add(comboBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel_4.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("硬件底层", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5, BorderLayout.NORTH);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel label_2 = new JLabel("当前状态：");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 0;
		panel_5.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("停止");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 10, 0, 10);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 0;
		panel_5.add(label_3, gbc_label_3);
		
		JToggleButton toggleButton_1 = new JToggleButton("启动");
		GridBagConstraints gbc_toggleButton_1 = new GridBagConstraints();
		gbc_toggleButton_1.gridx = 2;
		gbc_toggleButton_1.gridy = 0;
		panel_5.add(toggleButton_1, gbc_toggleButton_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		panel_6.add(textArea_1, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("配置");
		menuBar.add(menu);
		
		JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("自动启动业务底层");
		menu.add(checkBoxMenuItem);
		
		JCheckBoxMenuItem checkBoxMenuItem_1 = new JCheckBoxMenuItem("自动启动硬件底层");
		menu.add(checkBoxMenuItem_1);
		
		JMenuItem menuItem = new JMenuItem("配置硬件底层");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("系统");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("关于");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("退出");
		menu_1.add(menuItem_2);
	}

}
