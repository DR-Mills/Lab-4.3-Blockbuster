package gc.classroom;
import java.util.ArrayList;
import java.util.Scanner;

public class BlockbusterApp {

	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		Validator validator = new Validator();
		MovieDatabase database = new MovieDatabase();
		ArrayList<Movie> moviesInStock = database.getMovieArrayList();

		boolean continueBingeWatching = false;

		System.out.println("Welcome to GC Blockbuster!");

		do {
			System.out.println("Our current movies include,");

			for (int i = 0; i < moviesInStock.size(); i++) {    // prints movie menu
				System.out.println(i + 1 + ". " + moviesInStock.get(i).getTitle());
			}

			int userMovieSelection = validator.integerWithinRange(
					"\nPlease select the movie you want to watch. (enter the movie number) ", scnr, 1,
					moviesInStock.size()) - 1;

			Movie currentMovie = moviesInStock.get(userMovieSelection);

			currentMovie.printInfo(); // prints selected movie information

			boolean watchesMovie = validator.userContinueYorN("\nDo you want to watch the movie? y/n ", scnr);

			if (watchesMovie) {
				boolean userEngaged;

				do {
					currentMovie.play();
					userEngaged = currentMovie.userEngaged();
				} while (userEngaged);
			}

			continueBingeWatching = validator.userContinueYorN("Would you like to watch another movie?",
					"Thanks, goodbye!", scnr);
//			if (continueBlockbuster) {
//				continueBingeWatching = true;
//			} else {
//				continueBingeWatching = false;
//			}

		} while (continueBingeWatching);
	}
}
