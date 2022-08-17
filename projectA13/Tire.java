package projectA13;

public class Tire {
         
	public int maxRotaion; //최대 회전수 최대수명
	public int accumalatedRoation; // 누적 회전수
	public String location;
	
	
	
	public Tire(String location,int maxRotation) {
		  this.location=location;
		  this.maxRotaion=maxRotation;
	}
	
	public boolean roll() {
		++accumalatedRoation;
		if(accumalatedRoation<maxRotaion) {
			System.out.println(location+"Tire 수명"+(maxRotaion-accumalatedRoation));
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크");
			return false;
		}
	}
	
}
