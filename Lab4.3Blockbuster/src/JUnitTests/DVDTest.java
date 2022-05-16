package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import gc.classroom.DVD;
import gc.classroom.Movie;

class DVDTest {

	@Test
	void dvdInstanceOfMovie() {
		DVD actualVHS = new DVD("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		assertTrue(actualVHS instanceof Movie);
	}

	@Test
	void dvdObjectCorrectTitle() {
		DVD testDVD = new DVD("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		String actualTitle = testDVD.getTitle();
		assertEquals("Amazing Movie Title", actualTitle);		
	}
	
	@Test
	void vhsObjectCorrectRunTime() {
		DVD testDVD = new DVD("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		int actualRunTime = testDVD.getRunTime();
		assertEquals(60, actualRunTime);		
	}
	

}
