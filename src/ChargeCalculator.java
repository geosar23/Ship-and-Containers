import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChargeCalculator extends JFrame{
	
	
	private JPanel panel=new JPanel();
	private JButton button=new JButton("Calculate Charge");
	private Ship ship=null;
	
	
	public ChargeCalculator(Ship aShip)
	{
		panel.add(button);
		this.setContentPane(panel);
		
		ButtonListener listener=new ButtonListener();
		button.addActionListener(listener);
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("Charge Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.ship=aShip;
	}
	
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Ship Total charge: "+ship.totalCost());
		}
		
	}

}
