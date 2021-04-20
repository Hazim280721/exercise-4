
public class aeroplane {
	private String model;
	private String color;
	private int seat;
	private int speed;

	public aeroplane(String m, String c, int s,int sp)  {
	    model = m;
	    color = c;
	    seat= s;
	    speed= sp;
	}
	    public String getModel() {
		       return model;
		   }
		   public String getColor() {
		       return color;
		   }
		   public int getSeat() {
		       return seat;
		   }
		   public int getSpeed() {
		       return speed;
		   }	   
}
