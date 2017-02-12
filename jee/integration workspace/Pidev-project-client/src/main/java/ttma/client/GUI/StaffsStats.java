/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttma.client.GUI;


import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;



public class  StaffsStats extends ApplicationFrame  {
    
   
   //public StatPresence() {}

    public StaffsStats( String title ) 
   {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   private static PieDataset createDataset( ) 
   { 
      DefaultPieDataset dataset = new DefaultPieDataset();
       
      dataset.setValue( "  AgencyResponsible   :" ,1);  
      dataset.setValue( " Financial Responsible   :  "  ,6 );   
      dataset.setValue( "  ROCWP  " ,2);  
      dataset.setValue( "  ROLAC  " ,3);  
      dataset.setValue( "  ROWCM  " ,4);  
      dataset.setValue( " Events Responsible " ,2);  
    
      
    
      return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Statistique des Staffs connectés",  // chart title 
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
   public static void main( String[ ] args )
   {
   StaffsStats dem = new StaffsStats("Statistique des operations reservé" );  
      dem.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( dem );    
      dem.setVisible( true ); 
   }

    
    
}