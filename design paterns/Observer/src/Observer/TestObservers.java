package Observer;

public class TestObservers {

	
	public static void main(String[] args) {
		// ��������� �� Subject � Observers.
		ConcreteSubject s = new ConcreteSubject("�����", 1.29f);
		NameObserver nameObs = new NameObserver();
		HeightObserver heightObs = new HeightObserver();
		
		// �������� �� �������������!
		s.addObserver(nameObs);
		s.addObserver(heightObs);
		
		// ������� � subject.
		s.setName("Bulut");
		s.setHeight(1.78f);
		s.setName("����");
		s.setHeight(2.22f);
		s.setName("Jem");
		s.setHeight(1.66f);
	}
}





