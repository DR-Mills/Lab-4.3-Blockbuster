import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {

	// variables
	Validator validator = new Validator();
	Scanner scnr = new Scanner(System.in);
	
	
	// constructor
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}

	
	// methods
	@Override
	public void play() {
		printScenes();
		int sceneChoice = validator.integerWithinRange("Which scene of " + getTitle() + " would you like to watch? ", scnr, 0, getScenes().size()-1);		
		System.out.println("\nScene " + sceneChoice + ":\n" + getPrinterFriendlyScene(getScenes().get(sceneChoice)));
	}
	
	public boolean userEngaged() {
		return validator.userContinueYorN("\nWatch another scene? ", scnr);
		
	}
}
