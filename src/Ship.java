import java.util.ArrayList;

public class Ship {
	
	private String name;
	private int capacity;
	private ArrayList<Container> containers=new ArrayList<>();
	
	
	public Ship(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	public void loadContainer(Container aContainer)
	{
		if(containers.size()<capacity) {
			containers.add(aContainer);
			System.out.println("New Container has been loaded");
		}else
			System.out.println("No Capacity , cant load the Conctainer");
	}
	
	public double totalCost()
	{
		double sum=0;
		for(int i=0; i<containers.size(); i++)
		{
			System.out.print(+containers.get(i).cost()+" + ");
			System.out.println("");
			System.out.println("");
		
			sum=sum+containers.get(i).cost();
		}
		System.out.println("Total cost of shipment: "+name+" is :"+sum);
		return sum;
	}
	

}
