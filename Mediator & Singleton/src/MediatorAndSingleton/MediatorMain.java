package MediatorAndSingleton;

public class MediatorMain {

	public static void main(String[] args) {
		
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat," Ivan");
		User user2 = new ChatUser(chat," Maria");
		User user3 = new ChatUser(chat," Georgi");

		
		user2.send(" Hi guys");
		user3.send(" add bot");
		user1.send(" Cat");
		user3.send(" Hello");
		
		
	}

}
