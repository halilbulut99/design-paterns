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
		
			System.out.println(message + " e ��������� ���������.");
			System.out.println(" ���������� � ������.");
			return false;
		}
		
		return true;
	}
	
	

}
