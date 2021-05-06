package MediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	
	private List<User> users;
	private BotSingleton botSingleton;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("add bot")) {
			this.botSingleton = BotSingleton.getInstance();
			System.out.println("BotSingleton e добавен");
		}
			if(botSingleton != null) {
				this.users.remove(user);
				
				if(botSingleton.messageSetings(message)){
					
					for(User chatUser : this.users) {
						if(user != chatUser) {
							chatUser.recive(message);
						}
					}
					
				}
			}			
	}
	
	@Override
	public void addUser(User user) {
       this.users.add(user);
	}


	@Override
	public void removeUser(User user) {
       this.users.remove(user);		
	}

}
