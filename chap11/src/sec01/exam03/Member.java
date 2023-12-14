package sec01.exam03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	//동일 id인 문자열이 있으면 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
