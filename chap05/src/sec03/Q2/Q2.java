package sec03.Q2;

public class Q2 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인에 성공했습니다?!");
		}else if(result == LoginResult.FAIL_ID) {
			System.out.println("등록된 ID가 없습니다?!");
		}else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호가 틀렸습니다!");
		}else {
			System.out.println("회원가입이나 할래요?");
		}
	}

}
