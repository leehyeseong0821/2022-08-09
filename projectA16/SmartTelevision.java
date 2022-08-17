package projectA16;

public class SmartTelevision implements RemoteControl, Searchable {
     private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"검색합니다.");

	}

	@Override
	public void turnOn() {
		 System.out.println("티비를 켠다");

	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끈다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
         System.out.println("현재 스마트 볼륨:"+volume);
	
	

	}

}
