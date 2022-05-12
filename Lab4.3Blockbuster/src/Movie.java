import java.time.Duration;
import java.util.ArrayList;

public abstract class Movie {

	// instance variables
	private String title;
	private Duration runTime;
	private ArrayList<String> scenes = new ArrayList<>();

	// getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Duration getRunTime() {
		return runTime;
	}

	public void setRunTime(Duration runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	// constructor
	public Movie(String title, Duration runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}


	// methods
	public void printInfo() {
		System.out.println("Title: " + getTitle());
		System.out.println("Run Time: " + getRunTime());
	}

	public void printScenes() {
		System.out.printf("%s%-6s%n", "Scene", "Description");
		for (String scene : scenes) {
			System.out.printf("%s%-6s%n", scene.indexOf(scene), scene);
		}
	}
	
	public abstract void play();
}
