package ttma.client.GUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EspaceRespRelations extends JFrame {

	GestionHotels gestionHotels;
	GestionProblems gestionProblems;
	ManageReservations mr;
	ProblemStat ps;
	HotelStat hs;
	private JPanel contentPane;
	JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceRespRelations frame = new EspaceRespRelations();
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
	public EspaceRespRelations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 900);
		JPanel panel=new JPanel();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperations = new JMenu("Operations");
		menuBar.add(mnOperations);
		
		JMenuItem mntmManageHotels = new JMenuItem("Manage Hotels");
		mntmManageHotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionHotels=new GestionHotels();
				scrollPane.setViewportView(gestionHotels);
			}
		});
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				scrollPane.setViewportView(panel);
			}
		});
		mnOperations.add(mntmHome);
		mnOperations.add(mntmManageHotels);
		
		JMenuItem mntmManagePatientsProblems = new JMenuItem("Manage patients problems");
		mntmManagePatientsProblems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gestionProblems=new GestionProblems();
				scrollPane.setViewportView(gestionProblems);
			}
		});
		
		JMenuItem mntmManageReservations = new JMenuItem("Manage reservations");
		mntmManageReservations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mr=new ManageReservations();
				scrollPane.setViewportView(mr);
			}
		});
		mnOperations.add(mntmManageReservations);
		mnOperations.add(mntmManagePatientsProblems);
		
		JMenu mnStatistics = new JMenu("Statistics");
		menuBar.add(mnStatistics);
		
		JMenuItem mntmHotelStatistics = new JMenuItem("Hotel Statistics");
		mntmHotelStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hs=new HotelStat();
				scrollPane.setViewportView(hs);
			}
		});
		mnStatistics.add(mntmHotelStatistics);
		
		JMenuItem mntmProblemStatistics = new JMenuItem("Problem Statistics");
		mntmProblemStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ps=new ProblemStat();
				scrollPane.setViewportView(ps);
			}
		});
		mnStatistics.add(mntmProblemStatistics);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		scrollPane.setViewportView(panel);
		
		JButton btnNewButton = new JButton("Manage Hotels");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setIcon(new ImageIcon("C:\\images\\48x48\\web.png"));
		btnNewButton.setBounds(543, 307, 237, 57);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionHotels=new GestionHotels();
				scrollPane.setViewportView(gestionHotels);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Manage problems");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setIcon(new ImageIcon("C:\\images\\48x48\\applications.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionProblems=new GestionProblems();
				scrollPane.setViewportView(gestionProblems);
			}
		});
		btnNewButton_1.setBounds(543, 375, 237, 75);
		
		JButton btnNewButton_2 = new JButton("Manage Resservations");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setIcon(new ImageIcon("C:\\images\\48x48\\tools.png"));
		btnNewButton_2.setBounds(543, 461, 237, 77);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mr=new ManageReservations();
				scrollPane.setViewportView(mr);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Statistiques");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setIcon(new ImageIcon("C:\\images\\48x48\\chart.png"));
		btnNewButton_3.setBounds(543, 549, 237, 66);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ps=new ProblemStat();
				scrollPane.setViewportView(ps);
			}
		});
		
		JLabel lblRelationsResponsibleSpace = new JLabel("Relations Responsible Space :");
		lblRelationsResponsibleSpace.setBounds(543, 219, 223, 21);
		lblRelationsResponsibleSpace.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.setLayout(null);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);
		panel.add(btnNewButton_3);
		panel.add(lblRelationsResponsibleSpace);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDisconnect.setIcon(new ImageIcon("C:\\images\\48x48\\box_closed.png"));
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new	TTMAAuthentification().setVisible(true);	
			 
			}
		});
		btnDisconnect.setBounds(99, 291, 185, 48);
		panel.add(btnDisconnect);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\images\\bg menu1.png"));
		lblNewLabel.setBounds(10, -27, 1332, 813);
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
}
