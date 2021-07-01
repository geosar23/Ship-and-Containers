import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
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
	private ArrayList<Ship> ships;

	public ContainerFrame(ArrayList<Ship> ships)
	{
		this.ships=ships;
		
		panel.setLayout(new BorderLayout());
		
		fieldPanel.setLayout(new GridLayout(3,2));
		
		codeField=new JTextField("Code");
		destinationField=new JTextField("Destination");
		weightField=new JTextField("weight");
		powerField=new JTextField("power");
		
		createBulkButton=new JButton("Create Bulk");
		createRefrButton=new JButton("Create Refr");
		
		shiplist=new JList();
		
		
		DefaultListModel model=new DefaultListModel();
		

		for(Ship ship:ships)
		{
			model.addElement(ship.getName());
		}
		
		shiplist.setModel(model);
		
		fieldPanel.add(codeField);
		fieldPanel.add(destinationField);
		fieldPanel.add(weightField);
		fieldPanel.add(powerField);
		fieldPanel.add(createBulkButton);
		fieldPanel.add(createRefrButton);
		
		panel.add(fieldPanel,BorderLayout.CENTER);
		panel.add(shiplist,BorderLayout.SOUTH);
		
		this.setContentPane(panel);
		
		BulkListener bulklistener=new BulkListener();
		createBulkButton.addActionListener(bulklistener);
		
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Create Containers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	class BulkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String code=codeField.getText();
			String destination=destinationField.getText();
			
			String weightText=weightField.getText();
			double weight=Double.parseDouble(weightText);
			
			Container bulk=new Bulk(code,destination,weight);
			
			String selectedShipName=(String)shiplist.getSelectedValue();
			
			for(Ship ship:ships)
			{
				if(ship.getName()==selectedShipName)
				{
					ship.loadContainer(bulk);
					ship.totalCost();
				}
			}
			
		}
		
	}
	class RefrigListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String code=codeField.getText();
			String destination=destinationField.getText();
			
			String powerText=powerField.getText();
			double power=Double.parseDouble(powerText);
			
			Container refg=new Refridgerator(code,destination,power);
		}
		
	}

}
