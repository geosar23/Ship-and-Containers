
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container r1=new Refridgerator("001","Barcelona",2.3);
		Container r2=new Refridgerator("002","Madrid",2.7);
		Container r3=new Refridgerator("003","London",3.0);
		
		Container b1=new Bulk("004","Boston",1200);
		Container b2=new Bulk("005","Boston",1800);
		Container b3=new Bulk("006","Boston",2000);
		
		Ship s1=new Ship("Titanic",3);
		Ship s2=new Ship("Velos",20);
		Ship s3=new Ship("Mirmidones",30);
		
		
		s1.loadContainer(b1);
		s1.loadContainer(r1);
		s1.loadContainer(b2);
		s1.loadContainer(r2);
		
		System.out.println("----------------------------------");
		System.out.println("Ship Total charge: "+s1.totalCost());
		System.out.println("----------------------------------");
		
		
		s2.loadContainer(r2);
		s2.loadContainer(b2);
		
		s3.loadContainer(r3);
		s3.loadContainer(b3);
		
		s1.totalCost();
		s2.totalCost();
		s3.totalCost();
		
		new ChargeCalculator(s1);
		new ContainerFrame();
		

	}

}
