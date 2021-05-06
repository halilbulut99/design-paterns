package MediatorAndSingleton;

public class BotSingleton {
	
private static BotSingleton instance;
	
	
	public BotSingleton() {
		
	}
	
	
	public static BotSingleton getInstance() {
		
		if(instance == null) {
			
			instance = new BotSingleton();
		}
		
		return instance;
	}
	
	
	public boolean messageSetings(String message) {
		
		if(message.contains("Cat")) {
		
			System.out.println(message + " e забранено съобщение.");
			System.out.println(" Потрбителя е изтрит.");
			return false;
		}
		
		return true;
	}
	
	

}
