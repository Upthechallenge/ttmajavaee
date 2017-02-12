package ttma.client.GUI;


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;

import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;


import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartMouseEvent;

import ttma.client.delegate.GestionProblemDelegate;

public class ProblemStat extends JPanel {

	/**
	 * Create the panel.
	 */
	public ProblemStat() {
		String chartTitle="Problem statistiques";
		// This will create the dataset 
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        
        ChartPanel chartPanel = new ChartPanel(chart);
        
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
       
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setRowHeaderView(chartPanel);
		
		JLabel lblResolved = new JLabel("number of resolved problems :");
		
		JLabel resolved = new JLabel("");
		
		JLabel lblUnresolved = new JLabel("number of unresolvesd problems :");
		
		JLabel unresolved = new JLabel("");
		resolved.setText(GestionProblemDelegate.dofindResolved().toString());
		unresolved.setText(GestionProblemDelegate.dofindUnresolved().toString());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblResolved)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(resolved))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblUnresolved)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(unresolved)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResolved)
						.addComponent(resolved))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUnresolved)
						.addComponent(unresolved))
					.addGap(54))
		);
		setLayout(groupLayout);

	}
	 private  PieDataset createDataset() {
	        DefaultPieDataset result = new DefaultPieDataset();
	        Long x=GestionProblemDelegate.dofindUnresolved();
	        Long y=GestionProblemDelegate.dofindResolved();
	        Double unresolved=(x/(double)(x+y))*100;
	        Double resolved=(y/(double)(x+y))*100;
	        
	        result.setValue("Unresolved ", unresolved);
	        
	        result.setValue("Resolved", resolved);
	        
	        return result;
	        
	    }
	 private JFreeChart createChart(PieDataset dataset, String title) {
	        
	        JFreeChart chart = ChartFactory.createPieChart3D(title,          // chart title
	            dataset,                // data
	            true,                   // include legend
	            true,
	            false);

	        PiePlot3D plot = (PiePlot3D) chart.getPlot();
	        plot.setStartAngle(290);
	        plot.setDirection(Rotation.CLOCKWISE);
	        plot.setForegroundAlpha(0.5f);
	        return chart;
	        
	    }
}
