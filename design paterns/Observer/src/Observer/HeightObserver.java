package Observer;

import java.util.Observable;
import java.util.Observer;

public class HeightObserver implements Observer {
	private float height;

	public HeightObserver() {
		height = 0;
		System.out.println("HeightObserver created: Height is " + height);
	}


	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof Float) {
			height = ((Float) arg).floatValue();
			System.out.println("HeightObserver: Height changed to " + height);
		} else {
			System.out.println("HeightObserver: Some other change to	subject!");
		}
	}
}
