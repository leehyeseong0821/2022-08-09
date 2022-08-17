package projectA16;

public class projectA1205 {

	public static void main(String[] args) {
	      
		
		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(9);
		rc.turnOff();
		
		sc.search("www.naver.com");
		System.out.println();
		IFContorl ifc= new SmartTv();
		
		ifc.turnOn();
		ifc.setVolume(20);
		ifc.setMute(true);
		ifc.turnOff();
		ifc.search("www.google.com");
	    
	}

}
