package Observer;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private String name;
	private float height;

	public ConcreteSubject(String name, float height) {
		this.name = name;
		this.height = height;
		System.out.println("ConcreteSubject created: " + name  +  " at " + height);
	}

	public String getName() {
		return name;
	}
	

	public float getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}

	
	public void setHeight(float height) {
		this.height = height;
		setChanged();
		notifyObservers(new Float(height));
	}
}





