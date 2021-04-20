
public class main {

	

	public static void main(String[] args)
	{
		
		airbus objAirbus = new airbus ("airbus 333", "red", 200,350,2000);
		
		
		
		System.out.println(" Model = " + objAirbus.getModel());
		System.out.println(" color = " + objAirbus.getColor());
		System.out.println(" Seat = " + objAirbus.getSeat());
		System.out.println(" speed = " + objAirbus.getSpeed()+" KN");
		System.out.println(" fuel price = " +"RM "+ objAirbus.Fuel());
		System.out.println(" Fly Range  = " + objAirbus.Range(0)+" KM");
		System.out.println();
		boeing objBoeing = new boeing("boeing 777","blue",250,300,2500);
		
		System.out.println(" Model = " + objBoeing.getModel());
		System.out.println(" Color = " + objBoeing.getColor());
		System.out.println(" Seat = " + objBoeing.getSeat());
		System.out.println("Speed " + objBoeing.getSpeed()+" KN");
		System.out.println(" fuel price = " +"RM "+ objBoeing.Fuel());
		System.out.println(" Fly Range  = " + objBoeing.Range(0)+" KM");
	    }

	}


