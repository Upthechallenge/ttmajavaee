package ttma.client.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import ttma.Entities.Conge;
import ttma.Entities.Doctor;
import ttma.client.delegate.GestionCongeDelegate;
import ttma.client.delegate.GestionDoctorDelegate;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.text.SimpleDateFormat;

import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;

public class IAddConge extends JFrame {

	private JPanel contentPane;
	private JTextField cin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IAddConge frame = new IAddConge();
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
	public IAddConge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		cin = new JTextField();
		cin.setFont(new Font("Tahoma", Font.BOLD, 13));
		cin.setBounds(236, 43, 148, 42);
		panel.add(cin);
		cin.setColumns(10);
		
		JLabel lblCin = new JLabel("CIN");
		lblCin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCin.setBounds(85, 56, 112, 16);
		panel.add(lblCin);
		
		JLabel lblDd = new JLabel("Start Date");
		lblDd.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDd.setBounds(85, 144, 112, 16);
		panel.add(lblDd);
		
		JLabel lblDf = new JLabel("End Date");
		lblDf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDf.setBounds(85, 227, 112, 16);
		panel.add(lblDf);
		JDateChooser dateChooser1 = new JDateChooser();
		dateChooser1.setBounds(236, 126, 148, 34);
		panel.add(dateChooser1);
		
		JDateChooser datechooser2 = new JDateChooser();
		datechooser2.setBounds(236, 199, 148, 34);
		panel.add(datechooser2);
		JButton btnAd = new JButton("Validate");
		btnAd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conge hotel=new Conge();

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

				  String sd = dateFormat.format(dateChooser1.getDate());

					SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");

					  String sd1 = dateFormat1.format(datechooser2.getDate());

				hotel.setCIN(cin.getText());
				hotel.setDateDeb(sd);
				hotel.setDateFin(sd1);
				hotel.setVerif("Refuser");
				
				if(GestionCongeDelegate.doaddConge(hotel)){
					JOptionPane.showMessageDialog(null,"Leave request is added");
				cin.setText("");
				//	comboboxCL.setText("");
				
				
					
					//hotels=GestionDoctorDelegate.dofindAllDoctors();
				//	initDataBindings();
					//initDataBindings1();
				}
				
			}
		});
		btnAd.setBounds(236, 261, 148, 34);
		panel.add(btnAd);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\images\\bg f.png"));
		lblNewLabel.setBounds(0, 0, 555, 321);
		panel.add(lblNewLabel);
	}
}
