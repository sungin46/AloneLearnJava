package sec01.Q6;

public class BytesToStringEx {

	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		// 내 정답
//		String str = bytes.toString();
		// 답지 정답
		String str = new String(bytes);
		System.out.println(str);
	}

}
