package sec01.Q4;

public class Chatting {
	void startChat(String chatId) {
//		String nickname = null;
//		nickname = chatId;
		String nickName = chatId;
		
		class Chat{
			public void start() {
				while(true) {
					String inputData = "Hi";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
