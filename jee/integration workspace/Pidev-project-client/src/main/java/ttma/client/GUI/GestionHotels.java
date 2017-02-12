package ttma.client.GUI;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;






import map.MapLieu;

import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;

import ttma.Entities.Hotel;
import ttma.client.delegate.GestionHotelDelegate;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;

public class GestionHotels extends JPanel {
	private JTable table;
	private JTextField nm;
	private JTextField ad;
	List <Hotel> hotels;
	Hotel hotel;
	URL url;
	private JTextField lat;
	private JTextField longi;
	/**
	 * Create the panel.
	 */
	public GestionHotels() {
		
		JLabel imgg = new JLabel("");
		hotels=new ArrayList<Hotel>();
		hotels=GestionHotelDelegate.dofindAllHotels();
		JSpinner spinner = new JSpinner();
		JLabel star1 = new JLabel("");
		star1.setIcon(new ImageIcon("C:\\images\\star-icon.png"));
		
		JLabel star2 = new JLabel("");
		star2.setIcon(new ImageIcon("C:\\images\\star-icon.png"));
		JLabel star3 = new JLabel("");
		star3.setIcon(new ImageIcon("C:\\images\\star-icon.png"));
		
		JLabel star4 = new JLabel("");
		star4.setIcon(new ImageIcon("C:\\images\\star-icon.png"));
		
		JLabel star5 = new JLabel("");
		star5.setIcon(new ImageIcon("C:\\images\\star-icon.png"));
		star1.setVisible(false);
		star2.setVisible(false);
		star3.setVisible(false);
		star4.setVisible(false);
		star5.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Manage Hotels", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JTextArea ds = new JTextArea();
		
		nm = new JTextField();
		nm.setColumns(10);
		
		ad = new JTextField();
		ad.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox comboBox = (JComboBox) arg0.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("1"))
                    {star1.setVisible(true);
                    star2.setVisible(false);
                    star3.setVisible(false);
                    star4.setVisible(false);
                    star5.setVisible(false);
                    
                    }
                    else if(selected.toString().equals("2"))
                    {
                    	star1.setVisible(true);
                        star2.setVisible(true);
                        star3.setVisible(false);
                        star4.setVisible(false);
                        star5.setVisible(false);
                    } 
                    else if(selected.toString().equals("3"))
                    {
                    	star1.setVisible(true);
                        star2.setVisible(true);
                        star3.setVisible(true);
                        star4.setVisible(false);
                        star5.setVisible(false);
                    } 
                    else if(selected.toString().equals("4"))
                    {
                    	star1.setVisible(true);
                        star2.setVisible(true);
                        star3.setVisible(true);
                        star4.setVisible(true);
                        star5.setVisible(false);
                    } 
                    else if(selected.toString().equals("5"))
                    {
                    	star1.setVisible(true);
                        star2.setVisible(true);
                        star3.setVisible(true);
                        star4.setVisible(true);
                        star5.setVisible(true);
                    } 
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		
		JLabel lblName = new JLabel("Name :");
		
		JLabel lblAdresse = new JLabel("Adresse :");
		
		JLabel lblDescription = new JLabel("Stars :");
		
		JLabel lblDescription_1 = new JLabel("Description :");
		
		JLabel pathh = new JLabel("");
		
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setIcon(new ImageIcon("C:\\images\\48x48\\add.png"));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//function to transform a file to a byte[]
				 File file = new File(pathh.getText());
			       byte[] b = new byte[(int) file.length()];
			      try {
			               FileInputStream fileInputStream = new FileInputStream(file);
			            try {
			                fileInputStream.read(b);
			            } catch (IOException ex) {
			                Logger.getLogger(GestionHotels.class.getName()).log(Level.SEVERE, null, ex);
			            }
			               for (int i = 0; i < b.length; i++) {
			                           System.out.print((char)b[i]);
			                }
			          } catch (FileNotFoundException e1) {
			                      System.out.println("File Not Found.");
			                      e1.printStackTrace();}
			      ///////
				Hotel hotel=new Hotel();
				hotel.setNom(nm.getText());
				hotel.setDescription(ds.getText());
				hotel.setAdresse(ad.getText());
				hotel.setStar(comboBox.getSelectedIndex()+1);
				hotel.setPic(b);
				hotel.setRoomNumber((Integer) spinner.getValue());
				hotel.setLatitude(lat.getText());
				hotel.setLongitude(longi.getText());
				if(GestionHotelDelegate.doaddHotel(hotel)){
					JOptionPane.showMessageDialog(null, "ajout reussie");
					nm.setText("");
					ds.setText("");
					ad.setText("");
					imgg.setText("");
					pathh.setText("");
					lat.setText("");
					longi.setText("");
					star1.setVisible(false);
                    star2.setVisible(false);
                    star3.setVisible(false);
                    star4.setVisible(false);
                    star5.setVisible(false);
					hotels=GestionHotelDelegate.dofindAllHotels();
					initDataBindings();
				}
			}
		});
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setIcon(new ImageIcon("C:\\images\\48x48\\trash.png"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotel=hotels.get(table.getSelectedRow());
				if(GestionHotelDelegate.dodeleteHotel(hotel)){
					JOptionPane.showMessageDialog(null, "delete reussie...");
					nm.setText("");
					ds.setText("");
					ad.setText("");
					hotels=GestionHotelDelegate.dofindAllHotels();
					initDataBindings();
				}
				else{}
				
			}
		});
		
		JButton btnModify = new JButton("Modify");
		btnModify.setIcon(new ImageIcon("C:\\images\\48x48\\applications.png"));
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//function to transform a file to a byte[]
				 File file = new File(pathh.getText());
			       byte[] b = new byte[(int) file.length()];
			      try {
			               FileInputStream fileInputStream = new FileInputStream(file);
			            try {
			                fileInputStream.read(b);
			            } catch (IOException ex) {
			                Logger.getLogger(GestionHotels.class.getName()).log(Level.SEVERE, null, ex);
			            }
			               for (int i = 0; i < b.length; i++) {
			                           System.out.print((char)b[i]);
			                }
			          } catch (FileNotFoundException e1) {
			                      System.out.println("File Not Found.");
			                      e1.printStackTrace();}
			      ///////
				hotel.setAdresse(ad.getText());
				hotel.setNom(nm.getText());
				hotel.setDescription(nm.getText());
				hotel.setPic(b);
				hotel.setStar(comboBox.getSelectedIndex()+1);
				hotel.setRoomNumber((Integer) spinner.getValue());
				if(GestionHotelDelegate.doupdateHotel(hotel)){
					JOptionPane.showMessageDialog(null, "update reussie...");
					nm.setText("");
					ds.setText("");
					ad.setText("");
					lat.setText("");
					longi.setText("");
					hotels=GestionHotelDelegate.dofindAllHotels();
					initDataBindings();
				}
				else{}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnSelectionnerImage = new JButton("Selectionner Image");
		btnSelectionnerImage.setIcon(new ImageIcon("C:\\images\\32x32\\documents.png"));
		btnSelectionnerImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				 chooser.showOpenDialog(null);
			     File f=chooser.getSelectedFile();
			     String filename =f.getAbsolutePath();
			     pathh.setText(filename);
			   //function to transform a file to a byte[]
				 File file = new File(pathh.getText());
			       byte[] b = new byte[(int) file.length()];
			      try {
			               FileInputStream fileInputStream = new FileInputStream(file);
			            try {
			                fileInputStream.read(b);
			            } catch (IOException ex) {
			                Logger.getLogger(GestionHotels.class.getName()).log(Level.SEVERE, null, ex);
			            }
			               for (int i = 0; i < b.length; i++) {
			                           System.out.print((char)b[i]);
			                }
			          } catch (FileNotFoundException e1) {
			                      System.out.println("File Not Found.");
			                      e1.printStackTrace();}
			      ///////
			      ImageIcon format=null;
				     format=new ImageIcon(b);
				    Image img = format.getImage();
				    Image newimg = img.getScaledInstance(220, 135,  java.awt.Image.SCALE_SMOOTH);
				    ImageIcon newIcon=null;
				    newIcon = new ImageIcon(newimg);
				     imgg.setIcon(newIcon);
			}
			
		});
		
		
		
		JLabel lblRooms = new JLabel("Rooms");
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				hotel=hotels.get(table.getSelectedRow());
				nm.setText(hotel.getNom());
				ad.setText(hotel.getAdresse());
				ds.setText(hotel.getDescription());
				lat.setText(hotel.getLatitude());
				longi.setText(hotel.getLongitude());
				spinner.setValue(hotel.getRoomNumber());
				Integer i=hotel.getStar();
				ImageIcon format=null;
			     format=new ImageIcon(hotel.getPic());
			    Image img = format.getImage();
			    Image newimg = img.getScaledInstance(220, 135,  java.awt.Image.SCALE_SMOOTH);
			    ImageIcon newIcon=null;
			    newIcon = new ImageIcon(newimg);
			     imgg.setIcon(newIcon);
			     comboBox.setSelectedIndex(i-1);
				if(i==1){
					star1.setVisible(true);
                    star2.setVisible(false);
                    star3.setVisible(false);
                    star4.setVisible(false);
                    star5.setVisible(false);
					
				}
				else if(i==2)
					{
						star1.setVisible(true);
	                    star2.setVisible(true);
	                    star3.setVisible(false);
	                    star4.setVisible(false);
	                    star5.setVisible(false);
						
					}
				else if(i==3)
				{
					star1.setVisible(true);
                    star2.setVisible(true);
                    star3.setVisible(true);
                    star4.setVisible(false);
                    star5.setVisible(false);
					
				}
				else if(i==4)
				{
					star1.setVisible(true);
                    star2.setVisible(true);
                    star3.setVisible(true);
                    star4.setVisible(true);
                    star5.setVisible(false);
					
				}
				else if(i==5)
				{
					star1.setVisible(true);
                    star2.setVisible(true);
                    star3.setVisible(true);
                    star4.setVisible(true);
                    star5.setVisible(true);
					
				}
			}
		});
		
		JLabel lblPositions = new JLabel("Positions :");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Google Maps", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		longi = new JTextField();
		longi.setColumns(10);
		
		JLabel lblLongitude = new JLabel("Longitude =");
		
		lat = new JTextField();
		lat.setColumns(10);
		
		JLabel lblLattitude = new JLabel("Lattitude =");
		
		JButton btnShowInMap = new JButton("Show in map");
		btnShowInMap.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnShowInMap.setIcon(new ImageIcon("C:\\images\\32x32\\web.png"));
		btnShowInMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mapIcon = "hhh";
		        String s,z;
		            s=lat.getText();
		            z=longi.getText();
					
					MapLieu.main(new String[]{s,z, mapIcon});
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(92, Short.MAX_VALUE)
					.addComponent(lblLattitude, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblLongitude, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(longi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnShowInMap)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLongitude)
						.addComponent(lblLattitude)
						.addComponent(longi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnShowInMap, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblName)
					.addGap(37)
					.addComponent(nm, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAdresse)
					.addGap(25)
					.addComponent(ad, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDescription)
					.addGap(39)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(star1)
					.addGap(10)
					.addComponent(star2)
					.addGap(10)
					.addComponent(star3)
					.addGap(6)
					.addComponent(star5)
					.addGap(10)
					.addComponent(star4))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblRooms)
					.addGap(39)
					.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDescription_1)
					.addGap(10)
					.addComponent(ds, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addComponent(lblPositions, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSelectionnerImage)
								.addComponent(pathh, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(38)
							.addComponent(imgg, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(115)
							.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(121)
					.addComponent(btnModify, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblName))
						.addComponent(nm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAdresse))
						.addComponent(ad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDescription))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(star1)
						.addComponent(star2)
						.addComponent(star3)
						.addComponent(star5)
						.addComponent(star4))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblRooms))
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription_1)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(ds, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addComponent(lblPositions)))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnSelectionnerImage)
							.addGap(18)
							.addComponent(pathh, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addComponent(imgg, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnModify, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(btnAdd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		initDataBindings();

	}
	protected void initDataBindings() {
		JTableBinding<Hotel, List<Hotel>, JTable> jTableBinding = SwingBindings.createJTableBinding(UpdateStrategy.READ, hotels, table);
		//
		BeanProperty<Hotel, Integer> hotelBeanProperty = BeanProperty.create("id");
		jTableBinding.addColumnBinding(hotelBeanProperty).setColumnName("id");
		//
		BeanProperty<Hotel, String> hotelBeanProperty_1 = BeanProperty.create("nom");
		jTableBinding.addColumnBinding(hotelBeanProperty_1).setColumnName("Name");
		//
		BeanProperty<Hotel, String> hotelBeanProperty_2 = BeanProperty.create("adresse");
		jTableBinding.addColumnBinding(hotelBeanProperty_2).setColumnName("Adress");
		//
		BeanProperty<Hotel, Integer> hotelBeanProperty_3 = BeanProperty.create("star");
		jTableBinding.addColumnBinding(hotelBeanProperty_3).setColumnName("Star");
		//
		jTableBinding.bind();
	}
}
