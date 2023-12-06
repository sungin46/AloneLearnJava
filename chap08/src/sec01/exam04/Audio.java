package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("오디오를 켜");
	}
	
	public void turnOff() {
		System.out.println("오디오를 꺼");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
}
