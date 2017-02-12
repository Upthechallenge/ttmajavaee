package ttma.client.GUI;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;





import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;

import ttma.Entities.Reservation;


import ttma.client.delegate.GestionReservationDelegate;

import java.sql.Date;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ManageReservations extends JPanel {
	
	List <Reservation> reservations;
	Reservation reservation;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ManageReservations() {
		
		reservations=new ArrayList<Reservation>();
		reservations=GestionReservationDelegate.dofindAllReservations();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Manage reservations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setIcon(new ImageIcon("C:\\images\\32x32\\add.png"));
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation=reservations.get(table.getSelectedRow());
				reservation.setApprovation(true);
				GestionReservationDelegate.doupdateReservation(reservation);
				reservations=GestionReservationDelegate.dofindAllReservations();
				initDataBindings();
			}
		});
		
		JButton btnRefuse = new JButton("Refuse");
		btnRefuse.setIcon(new ImageIcon("C:\\images\\32x32\\stop.png"));
		btnRefuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation=reservations.get(table.getSelectedRow());
				reservation.setApprovation(false);
				GestionReservationDelegate.doupdateReservation(reservation);
				reservations=GestionReservationDelegate.dofindAllReservations();
				initDataBindings();
			}
		});
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon("C:\\images\\32x32\\trash.png"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reservation=reservations.get(table.getSelectedRow());
				
				GestionReservationDelegate.dodeleteReservation(reservation);
				reservations=GestionReservationDelegate.dofindAllReservations();
				initDataBindings();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnAccept)
							.addGap(34)
							.addComponent(btnRefuse)
							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
							.addComponent(btnDelete)
							.addGap(35))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAccept)
						.addComponent(btnRefuse, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
		initDataBindings();

	}
	protected void initDataBindings() {
		JTableBinding<Reservation, List<Reservation>, JTable> jTableBinding = SwingBindings.createJTableBinding(UpdateStrategy.READ, reservations, table);
		//
		BeanProperty<Reservation, String> reservationBeanProperty = BeanProperty.create("user.name");
		jTableBinding.addColumnBinding(reservationBeanProperty).setColumnName("Patient");
		//
		BeanProperty<Reservation, String> reservationBeanProperty_1 = BeanProperty.create("hotel.nom");
		jTableBinding.addColumnBinding(reservationBeanProperty_1).setColumnName("Hotel");
		//
		BeanProperty<Reservation, Date> reservationBeanProperty_2 = BeanProperty.create("dateReserv");
		jTableBinding.addColumnBinding(reservationBeanProperty_2).setColumnName("Date");
		//
		BeanProperty<Reservation, Boolean> reservationBeanProperty_3 = BeanProperty.create("approvation");
		jTableBinding.addColumnBinding(reservationBeanProperty_3).setColumnName("approvation");
		//
		jTableBinding.bind();
	}
}
