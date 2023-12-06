package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable{
	public int volume;
	
	public void turnOn() {
		System.out.println("티비를 켜");
	}
	public void turnOff() {
		System.out.println("티비를 꺼");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
