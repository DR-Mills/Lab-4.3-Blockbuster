import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {

	// variables
//	Validator validator = new Validator();
//	Scanner scnr = new Scanner(System.in);
	private int playCounter = 0;

	// constructor
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	// methods
	@Override
	public void play() {
		if (playCounter < 1) {
			printScenes();
			playCounter = 1;
		}
		int sceneChoice = validator.integerWithinRange("Which scene of " + getTitle() + " would you like to watch? ",
				scnr, 0, getScenes().size() - 1);
		System.out.println("\nScene " + sceneChoice + ":\n" + getPrinterFriendlyScene(getScenes().get(sceneChoice)));
	}

}
