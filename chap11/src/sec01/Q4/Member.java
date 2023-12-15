package sec01.Q4;

public class Member {
	private String idString;
	private String nameString;
	
	public Member(String idString, String nameString) {
		this.idString = idString;
		this.nameString = nameString;
	}
	
	@Override
	public String toString() {
		return idString + " : " + nameString;
	}
}
