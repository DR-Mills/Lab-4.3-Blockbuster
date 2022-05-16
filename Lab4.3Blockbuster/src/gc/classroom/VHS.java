package gc.classroom;
import java.util.ArrayList;

public class VHS extends Movie {
	
	// instance variables
	private int currentTime;

	
	// constructor
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	
	// getters & setters
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}



	// methods
	@Override
	public void play() {
		System.out.println();
		System.out.println("Scene " + currentTime + ":\n" + getPrinterFriendlyScene(getScenes().get(currentTime)));
		currentTime++;
		if (currentTime > getScenes().size()-1) {
			rewind();
		}
	}
	
	public void rewind() {  // be kind, please rewind
		currentTime = 0;
		System.out.println("\nMovie has ended.\n" + "Be kind, please rewind.\n" + "Movie will continue from the beginning unless you exit.\n\n");
	}


}
