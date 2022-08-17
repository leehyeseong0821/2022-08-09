package projectA16;

public class projectA1204 {

	public static void main(String[] args) {
		 
		RemoteControl remocon;
		
		
		remocon = new Television();
		
		remocon.turnOn();
		remocon.setVolume(6);
		remocon.turnOff();
		
		remocon = new Audio();
		remocon.turnOn();
		remocon.setVolume(9);
		remocon.turnOff();
		
		
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("켜기");
				
			}
			@Override
			public void turnOff() {
				System.out.println("끄기");
				
			}
			@Override
			public void setVolume(int volume) {
				
//				/*기능 정의 
			}
		
		};

	}

}
