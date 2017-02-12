package ttma.client.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import javax.swing.JInternalFrame;
import org.jdesktop.beansbinding.ObjectProperty;
import java.awt.Container;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

public class StatPanel extends JFrame {

	private JPanel contentPane;
	private JInternalFrame internalFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatPanel frame = new StatPanel();
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
	public StatPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(12, 13, 236, 223);
		panel.add(internalFrame);
		
		x();
		//setContentPane(createDemoPanel( ));
		
	}
	 private static PieDataset createDataset( ) 
	   { 
	      DefaultPieDataset dataset = new DefaultPieDataset();
	       // GestionConge g = new GestionConge();
	      //dataset.setValue( "  CONGE ACCEPTE   :  '"+g.countCongeAccpte()+"'" ,g.countCongeAccpte());  
	      //dataset.setValue( " CONGE REFUSE   :  '"+g.countCongeRefuse()+"'"  ,g.countCongeRefuse() );   
	      //dataset.setValue( "  CONGE SANS REPONSE   :  '"+g.countCongeSansRep()+"'" ,g.countCongeSansRep());  
	      dataset.setValue( "  Face Surgery   :" ,20);  
	      dataset.setValue( " Breast Surgery   :  "  ,6 );   
	      dataset.setValue( "  Surgery teeth   " ,11);  
	      dataset.setValue( "  Surgery plastic  " ,8);  
	      dataset.setValue( "  intimate Surgery  " ,17);  
	      dataset.setValue( "  gastric Band  " ,6);  
	    
	      
	    
	      return dataset;         
	   }
	   private static JFreeChart createChart( PieDataset dataset )
	   {
	      JFreeChart chart = ChartFactory.createPieChart(      
	         "Statistique des operations reservé",  // chart title 
	         dataset,        // data    
	         true,           // include legend   
	         true, 
	         false);

	      return chart;
	   }
	   public static JPanel createDemoPanel( )
	   {
	      JFreeChart chart = createChart(createDataset( ) );  
	      return new ChartPanel( chart ); 
	   }
	protected void x() {
		internalFrame.setContentPane(createDemoPanel( ));
		
	}
}
