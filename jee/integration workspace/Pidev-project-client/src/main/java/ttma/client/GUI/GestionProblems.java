package ttma.client.GUI;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;






import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;

import ttma.Entities.Problem;
import ttma.Entities.User;
import ttma.client.delegate.GestionProblemDelegate;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class GestionProblems extends JPanel {
	private JTable table;
	List <Problem> problems;
	Problem problem;
	ProblemStat ps;

	
	/**
	 * Create the panel.
	 */
	public GestionProblems() {
		problems=new ArrayList<Problem>();
		problems=GestionProblemDelegate.dofindAllProblems();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Patients problems", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JButton btnEnterProblemsDiscussion = new JButton("Enter problem's discussion");
		btnEnterProblemsDiscussion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Problem p=new Problem();
				User u=new User();
				p=problems.get(table.getSelectedRow());
				u=p.getUser();
				
				GestionProblemDis pd=new GestionProblemDis(p,u);
				pd.setVisible(true);
				
				
			}
		});
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria :");
		
		JRadioButton ball = new JRadioButton("All");
		
		JRadioButton bresolved = new JRadioButton("Resolved");
		
		JRadioButton bunresolved = new JRadioButton("Unresolved");
		
		ButtonGroup bG = new ButtonGroup();
		bG.add(ball);
		bG.add(bresolved);
		bG.add(bunresolved);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setIcon(new ImageIcon("C:\\images\\48x48\\zoom.png"));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bresolved.isSelected()){
				problems=GestionProblemDelegate.dofindAllResolved();
				initDataBindings();}
				else if(bunresolved.isSelected()){
					problems=GestionProblemDelegate.dofindAllUnresolved();
					initDataBindings();
				}
				else if(ball.isSelected()){
					problems=GestionProblemDelegate.dofindAllProblems();
					initDataBindings();
				}
			}
			
		});
		
		JButton btnGenerateStatistics = new JButton("Refresh Data");
		btnGenerateStatistics.setIcon(new ImageIcon("C:\\images\\arrow_refresh.png"));
		btnGenerateStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initDataBindings();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnEnterProblemsDiscussion)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGenerateStatistics))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblSearchCriteria)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ball)
							.addGap(31)
							.addComponent(bresolved)
							.addGap(26)
							.addComponent(bunresolved))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(278, Short.MAX_VALUE)
					.addComponent(btnSearch)
					.addGap(62))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSearch)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSearchCriteria)
						.addComponent(ball)
						.addComponent(bunresolved)
						.addComponent(bresolved))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEnterProblemsDiscussion, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGenerateStatistics))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		initDataBindings();

	}
	protected void initDataBindings() {
		JTableBinding<Problem, List<Problem>, JTable> jTableBinding = SwingBindings.createJTableBinding(UpdateStrategy.READ, problems, table);
		//
		BeanProperty<Problem, Integer> problemBeanProperty = BeanProperty.create("id");
		jTableBinding.addColumnBinding(problemBeanProperty).setColumnName("Id");
		//
		BeanProperty<Problem, String> problemBeanProperty_1 = BeanProperty.create("title");
		jTableBinding.addColumnBinding(problemBeanProperty_1).setColumnName("Title");
		//
		BeanProperty<Problem, String> problemBeanProperty_2 = BeanProperty.create("description");
		jTableBinding.addColumnBinding(problemBeanProperty_2).setColumnName("Description");
		//
		BeanProperty<Problem, String> problemBeanProperty_3 = BeanProperty.create("user.name");
		jTableBinding.addColumnBinding(problemBeanProperty_3).setColumnName("User name");
		//
		BeanProperty<Problem, Boolean> problemBeanProperty_4 = BeanProperty.create("resolved");
		jTableBinding.addColumnBinding(problemBeanProperty_4).setColumnName("Resolved");
		//
		jTableBinding.bind();
	}
}
