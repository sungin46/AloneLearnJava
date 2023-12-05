package sec01.exam01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("JavaPhone", "Black", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("여보 아닌데요.");
		dmbCellPhone.sendVoice("아... 죄송합니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
