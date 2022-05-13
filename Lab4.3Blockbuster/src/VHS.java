import java.util.ArrayList;
import java.util.Scanner;

public class VHS extends Movie {

	Validator validator = new Validator();
	Scanner scnr = new Scanner(System.in);
	
	
	// instance variables
	private int currentTime;

	
	// constructor
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
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


	@Override
	public boolean userEngaged() {
			return validator.userContinueYorN("\nWatch another scene? ", scnr);
	}
}
