package projectA13;

public class HankookTire extends Tire {
         
	public HankookTire(String location,int maxRoation) {
		super(location,maxRoation);
	}
	
	
	
	@Override
	public boolean roll() {
		++accumalatedRoation;
    	if(accumalatedRoation<maxRotaion) {
    		System.out.println(location+"HanKookTire 수명:"+(maxRotaion-accumalatedRoation));
    		return true;
    	}else {
    		System.out.println("***"+location+"HankookTire 펑크 ***");
    		return false;
    	}
	}
	
	
}   
