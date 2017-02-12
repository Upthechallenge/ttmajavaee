package ttma.client.GUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;




import map.MapLieu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Maap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maap frame = new Maap();
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
	public Maap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnShowMap = new JButton("show map");
		btnShowMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double latitude = 47;
	            double longitude = -122;
	            String mapIcon = "hhh";
	        String s,z;
	            s=Double.toString(latitude);
	            z=Double.toString(longitude);
				
				MapLieu.main(new String[]{s,z, mapIcon});
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addComponent(btnShowMap)
					.addContainerGap(276, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(btnShowMap)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
