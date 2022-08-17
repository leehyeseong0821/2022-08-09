package projectA16;

public interface RemoteControl {
	
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	
	void setVolume(int volume);
	
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattry() {
		System.out.println("배터리 교체합니다.");
	}

}
