package ttma.client.GUI;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;





import ttma.Entities.Evenement;
import ttma.client.delegate.EventDelegate;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.Button;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class EventAdd extends JPanel {
	private JTextField name_event;
	private JTextField place_event;
	private JTextField date_event;
	private JTextField price;
	private JTextArea program;
	private JTextField pn;
	
	public EventAdd() {

	JPanel panel = new JPanel();
	panel.setBounds(245, 262, 1400, 900);
	JLabel pathh = new JLabel("");
	//DateTextField date_event = new DateTextField();
	JTextArea program1 = new JTextArea();
	panel.setBorder(new TitledBorder(null, "Add event", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panel.setLayout(null);
	
	name_event = new JTextField();
	name_event.setBounds(99, 33, 86, 20);
	panel.add(name_event);
	name_event.setColumns(10);
	JTextArea program = new JTextArea();
	
	JButton btnAdd = new JButton("Add");
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//function to transform a file to a byte[]
			/* File file = new File(pathh.getText());
		       byte[] b = new byte[(int) file.length()];
		      try {
		               FileInputStream fileInputStream = new FileInputStream(file);
		            try {
		                fileInputStream.read(b);
		            } catch (IOException ex) {
		                Logger.getLogger(EventAdd.class.getName()).log(Level.SEVERE, null, ex);
		            }
		               for (int i = 0; i < b.length; i++) {
		                           System.out.print((char)b[i]);
		                }
		          } catch (FileNotFoundException e1) {
		                      System.out.println("File Not Found.");
		                      e1.printStackTrace();}
		      ///////
		    */
			Evenement evenement=new Evenement();
			//evenement.setImage("");
			evenement.setName_event(name_event.getText());
			evenement.setPlace_event(place_event.getText());
			//evenement.setDate_event(date_event.getText());
			evenement.setProgram(program1.getText());
			evenement.setPrice(Float.parseFloat(price.getText()));
			evenement.setNbr_participants(Integer.parseInt(pn.getText()));
			EventDelegate ed = new EventDelegate();
			if(EventDelegate.doaddEvenement(evenement)){
				
				
				JOptionPane.showMessageDialog(null, "Added");
				
				name_event.setText("");
				place_event.setText("");
				//date_event.setText("");
				price.setText("");
				pn.setText("");
				
			
				program1.setText("");
			}
			
		}
	});
	
	btnAdd.setBounds(10, 258, 89, 23);
	panel.add(btnAdd);
	
	JLabel lblPlace = new JLabel("Place");
	lblPlace.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblPlace.setBounds(10, 67, 46, 14);
	panel.add(lblPlace);
	
	place_event = new JTextField();
	place_event.setBounds(99, 64, 86, 20);
	panel.add(place_event);
	place_event.setColumns(10);
	
	//date_event = new JTextField();
	//date_event.setBounds(99, 95, 86, 20);
	//panel.add(date_event);
	//date_event.setColumns(10);
	
	JLabel lblPrice = new JLabel("price");
	lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblPrice.setBounds(10, 97, 46, 14);
	panel.add(lblPrice);
	
	price = new JTextField();
	price.setBounds(99, 94, 86, 20);
	panel.add(price);
	price.setColumns(10);
	
	JLabel lblProgram = new JLabel("program");
	lblProgram.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblProgram.setBounds(383, 37, 97, 14);
	panel.add(lblProgram);
	
	JLabel lblParticipantsNumber = new JLabel("Participant's number");
	lblParticipantsNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblParticipantsNumber.setBounds(10, 124, 118, 14);
	panel.add(lblParticipantsNumber);
	
	pn = new JTextField();
	pn.setBounds(138, 121, 47, 20);
	panel.add(pn);
	pn.setColumns(10);
	
	
	program1.setBounds(303, 61, 303, 94);
	panel.add(program1);
	
	Button button = new Button("Choose image");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser=new JFileChooser();
			 chooser.showOpenDialog(null);
		     File f=chooser.getSelectedFile();
		     String filename =f.getAbsolutePath();
		     pathh.setText(filename);
		}
	});
	button.setBounds(10, 179, 89, 22);
	panel.add(button);
	
	
	pathh.setBounds(105, 217, 46, 14);
	panel.add(pathh);
	
	JLabel lblName = new JLabel("Name");
	lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblName.setBounds(10, 36, 46, 14);
	panel.add(lblName);
	setLayout(null);
	
	JButton btnNewButton = new JButton("home");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	btnNewButton.setBounds(47, 279, 97, 25);
	add(btnNewButton);
	add(panel);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon("C:\\images\\bg f.png"));
	lblNewLabel.setBounds(0, 0, 1410, 900);
	add(lblNewLabel);

}
}
