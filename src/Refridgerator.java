
public class Refridgerator extends Container{
	
	private double power;
	
	public Refridgerator(String code,String destination,double power)
	{
		super(code,destination);
		this.power=power;
	}
	
	public double cost()
	{
		return 2000*power;
	}

}
