import java.time.Duration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class DVD extends Movie {

	// constructor
	public DVD(String title, Duration runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);

	}

	@Override
	public void play() {
		Scanner scnr = new Scanner(System.in);
		int sceneChoice = 0;
		boolean keepGoing = true;

		System.out.print("Which scene of " + getTitle() + " would you like to watch? ");
		printScenes();

		do {
			try {
				sceneChoice = scnr.nextInt();

				if (sceneChoice < 0 || sceneChoice > getScenes().size() - 1) {
					System.out.print("Please enter a number between 0 and " + (getScenes().size() - 1) + ": ");
					keepGoing = true;
				} else {
					keepGoing = false;
				}
			} catch (InputMismatchException e) {
				System.out.print("Invalid input. Please enter a whole number only between 0 and "
						+ (getScenes().size() - 1) + ": ");
				scnr.nextLine();
				keepGoing = true;
			}
		} while (keepGoing);
		scnr.close();
		
		System.out.println("Scene " + sceneChoice + ": " + getScenes().get(sceneChoice));
	}

}
