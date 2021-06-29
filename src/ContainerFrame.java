import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerFrame extends JFrame{
	
	private JPanel panel=new JPanel();
	private JPanel fieldPanel=new JPanel();
	private JTextField codeField,destinationField, weightField,powerField;
	private JButton createBulkButton,createRefrButton;
	private JList shiplist;

	public ContainerFrame()
	{
		panel.setLayout(new BorderLayout());
		
		fieldPanel.setLayout(new GridLayout(3,2));
		
		codeField=new JTextField("Code");
		destinationField=new JTextField("Destination");
		weightField=new JTextField("weight");
		powerField=new JTextField("power");
		
		createBulkButton=new JButton("Create Bulk");
		createRefrButton=new JButton("Create Refr");
		
		shiplist=new JList();
		
		fieldPanel.add(codeField);
		fieldPanel.add(destinationField);
		fieldPanel.add(weightField);
		fieldPanel.add(powerField);
		fieldPanel.add(createBulkButton);
		fieldPanel.add(createRefrButton);
		
		panel.add(fieldPanel,BorderLayout.CENTER);
		panel.add(shiplist,BorderLayout.SOUTH);
		
		this.setContentPane(panel);
		
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Create Containers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
}
