
public class airbus extends aeroplane{	   

   private double fuel;
   
   public airbus(String m, String c, int s,int sp,double f){
   	
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
