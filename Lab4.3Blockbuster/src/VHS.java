import java.time.Duration;
import java.util.ArrayList;

public class VHS extends Movie {

	// instance variables
	private int currentTime;

	// constructor
	public VHS(String title, Duration runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	// methods
	@Override
	public void play() {
		System.out.println("Scene " + currentTime + ": " + getScenes().get(currentTime));
		currentTime++;
		if (currentTime > getScenes().size()) {
			rewind(); //be kind, please rewind
		}
	}

	
	public void rewind() {
		currentTime = 0;
	}

}
