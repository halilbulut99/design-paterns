package Observer;

public class TestObservers {

	
	public static void main(String[] args) {
		// Създаване на Subject и Observers.
		ConcreteSubject s = new ConcreteSubject("Петър", 1.29f);
		NameObserver nameObs = new NameObserver();
		HeightObserver heightObs = new HeightObserver();
		
		// Добавяне на наблюдателите!
		s.addObserver(nameObs);
		s.addObserver(heightObs);
		
		// Промяна в subject.
		s.setName("Bulut");
		s.setHeight(1.78f);
		s.setName("Тишо");
		s.setHeight(2.22f);
		s.setName("Jem");
		s.setHeight(1.66f);
	}
}





