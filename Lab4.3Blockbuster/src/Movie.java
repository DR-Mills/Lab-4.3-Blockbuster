import java.util.ArrayList;

public abstract class Movie {

	// instance variables
	private String title;
	private int runTime;
	private ArrayList<String> scenes = new ArrayList<>();

	// getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	// constructor
	public Movie(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}

	// methods
	public abstract void play();

	public abstract boolean userEngaged();

	@Override
	public String toString() {
		return "[Movie Title: " + title + ", Run Time: " + runTime + " min., Scenes: " + scenes.size() + "]";
	}

	public void printInfo() {
		System.out.println("Title: " + getTitle());
		System.out.println("Run Time: " + getRunTime() + " min.");
	}

	public void printScenes() { // only displays partial scenes
		String partialScene = "";
		
		System.out.println("Scene   Partial Description");
		
		for (int i = 0; i < scenes.size(); i++) {
			
			try {
				partialScene = scenes.get(i).substring(0, 40) + ". . . ";	
			} catch (StringIndexOutOfBoundsException e) {
				partialScene = scenes.get(i).substring(0, scenes.get(i).length());
			}
			
			System.out.println("  " + i + "   " + partialScene);
		}
	}

	public String getPrinterFriendlyScene(String scene) {
		StringBuilder strIn = new StringBuilder(scene);
		StringBuilder strOut = new StringBuilder();
		int substringIndex = 0;

		do {
			if (strIn.length() <= 100) {
				strOut.append(strIn);
				return strOut.toString();
			} else {
				for (int i = 100; i < strIn.length(); i++) {
					if (strIn.charAt(i) == ' ') {
						substringIndex = i;
						break;
					}
				}
				strOut.append(strIn.substring(0, substringIndex + 1) + "\n");
				strIn = strIn.replace(0, substringIndex + 1, "");
			}

		} while (strIn.length() > 0);

		return null;
	}

}
