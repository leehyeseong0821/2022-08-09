package projectA13;

public class KumhoTire extends Tire {
       
	
	public KumhoTire(String location,int maxRotation) {
		 super(location, maxRotation);
		
	}
	
	  @Override
	public boolean roll() {
		  ++accumalatedRoation;
	    	if(accumalatedRoation<maxRotaion) {
	    		System.out.println(location+"KumhoTire 수명:"+(maxRotaion-accumalatedRoation));
	    		return true;
	    	}else {
	    		System.out.println("***"+location+"KumhoTire 펑크 ***");
	    		return false;
	    	}
		  
	}
	
	
	
}
