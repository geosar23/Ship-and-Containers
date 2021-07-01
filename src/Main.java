import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ship s1=new Ship("Titanic",3);
		Ship s2=new Ship("Velos",20);
		Ship s3=new Ship("Mirmidones",30);
		Ship s4=new Ship("Zeus",30);
		Ship s5=new Ship("Olympus",30);
		
		ArrayList<Ship> ships=new ArrayList<>();
		
		ships.add(s1);
		ships.add(s2);
		ships.add(s3);
		ships.add(s4);
		ships.add(s5);
		
		new ContainerFrame(ships);
		

	}

}
