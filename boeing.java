
public class boeing extends aeroplane{	   

   private double fuel;
   private double range;
   
   public boeing(String m, String c, int s,int sp,double f){
   	
       super(m,c,s,sp); 
    	
       fuel=f;
    	
    }  
   
   public double Fuel(){
       return fuel*1.50;
    }
   
   public double Range(double f){
       return f*30;
    }
   
}

